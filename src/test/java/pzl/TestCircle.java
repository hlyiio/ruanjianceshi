package pzl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestCircle {
    /**
     * 测试圆形适配器能否构成（合法情况）
     **/
    @Test
    void testAdapterCircleCanFormTrue() {
        Circle circle = new Circle();
        circle.center = new Vertex();
        circle.center.x = 2;
        circle.center.y = 2;
        circle.radius = 3;
        AdapterCircle adapterCircle = new AdapterCircle(circle);
        assertTrue(adapterCircle.canForm());
    }

    /**
     * 测试圆形适配器能否构成（非法情况）
     **/
    @Test
    void testAdapterCircleCanFormFalse() {
        Circle circle = new Circle();
        circle.center = new Vertex();
        circle.center.x = 2;
        circle.center.y = 2;
        circle.radius = 0;
        AdapterCircle adapterCircle = new AdapterCircle(circle);
        assertTrue(!adapterCircle.canForm());
    }

    /**
     * 测试圆形适配器面积计算
     **/
    @Test
    void testAdapterCircleArea() {
        Circle circle = new Circle();
        circle.center = new Vertex();
        circle.center.x = 2;
        circle.center.y = 2;
        circle.radius = 3;
        AdapterCircle adapterCircle = new AdapterCircle(circle);
        float expectedArea = (float) (Math.PI * 3 * 3);
        assertEquals(expectedArea, adapterCircle.calcArea(), 0.01);
    }
}
