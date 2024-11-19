package pzl;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class TestClass {
    /**
     * 测试类的关系
     **/
    @Test
    void testClassRelationships() {
        checkClassRelationships(Triangle.class);
        checkClassRelationships(Rectangle.class);
        checkClassRelationships(AdapterCircle.class);
    }

    /**
     * 测试方法
     **/
    private void checkClassRelationships(Class<?> clazz) {
        List<String> issues = new ArrayList<>();

        // 检查是否实现了 Polygon 接口
        if (!isImplementingInterface(clazz, Polygon.class)) {
            issues.add(clazz.getSimpleName() + " does not implement Polygon interface.");
        }

        // 检查方法重写
        Method[] interfaceMethods = Polygon.class.getMethods();
        for (Method interfaceMethod : interfaceMethods) {
            try {
                Method classMethod = clazz.getMethod(interfaceMethod.getName(), interfaceMethod.getParameterTypes());
                if (!classMethod.getDeclaringClass().equals(clazz)) {
                    issues.add(clazz.getSimpleName() + " does not properly override " + interfaceMethod.getName());
                }
            } catch (NoSuchMethodException e) {
                issues.add(clazz.getSimpleName() + " is missing implementation for " + interfaceMethod.getName());
            }
        }

        if (issues.isEmpty()) {
            System.out.println(clazz.getSimpleName() + " has correct class relationships.");
        } else {
            for (String issue : issues) {
                System.out.println(issue);
            }
        }
    }

    private boolean isImplementingInterface(Class<?> clazz, Class<?> interfaceClass) {
        for (Class<?> interf : clazz.getInterfaces()) {
            if (interf.equals(interfaceClass)) {
                return true;
            }
        }
        return false;
    }
}
