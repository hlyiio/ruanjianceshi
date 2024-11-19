package pzl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestTriangle {
    /**
     * 测试三角形能否构成（合法情况）
     **/
    @Test
    void testTriangleCanFormTrue() {
        Triangle triangle = new Triangle();
        triangle.v1 = new Vertex();
        triangle.v1.x = 0;
        triangle.v1.y = 0;
        triangle.v2 = new Vertex();
        triangle.v2.x = 3;
        triangle.v2.y = 0;
        triangle.v3 = new Vertex();
        triangle.v3.x = 0;
        triangle.v3.y = 4;
        // 断言三角形可以构成
        assertTrue(triangle.canForm());
    }

    /**
     * 测试三角形能否构成（合法情况）
     **/
    @Test
    void testTriangleCanFormFalse() {
        Triangle triangle = new Triangle();
        triangle.v1 = new Vertex();
        triangle.v1.x = 0;
        triangle.v1.y = 0;
        triangle.v2 = new Vertex();
        triangle.v2.x = 0;
        triangle.v2.y = 0;
        triangle.v3 = new Vertex();
        triangle.v3.x = 0;
        triangle.v3.y = 0;
        // 断言三角形不能构成
        assertTrue(!triangle.canForm());
    }

    /**
     * 测试三角形能否构成（合法情况）
     **/
    @Test
    void testTriangleArea() {
        Triangle triangle = new Triangle();
        triangle.v1 = new Vertex();
        triangle.v1.x = 0;
        triangle.v1.y = 0;
        triangle.v2 = new Vertex();
        triangle.v2.x = 3;
        triangle.v2.y = 0;
        triangle.v3 = new Vertex();
        triangle.v3.x = 0;
        triangle.v3.y = 4;
        // 预期的三角形面积
        float expectedArea = 6;
        // 断言计算出的三角形面积与预期面积相等（允许一定误差）
        assertEquals(expectedArea, triangle.calcArea(), 0.01);
    }

}
