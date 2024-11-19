package pzl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestRectangle {
    /**
     * 测试矩形能否构成（合法情况）
     **/
    @Test
    void testRectangleCanFormTrue() {
        Rectangle rectangle = new Rectangle();
        rectangle.v1 = new Vertex();
        rectangle.v1.x = 0;
        rectangle.v1.y = 0;
        rectangle.v2 = new Vertex();
        rectangle.v2.x = 5;
        rectangle.v2.y = 0;
        rectangle.v3 = new Vertex();
        rectangle.v3.x = 5;
        rectangle.v3.y = 3;
        rectangle.v4 = new Vertex();
        rectangle.v4.x = 0;
        rectangle.v4.y = 3;
        assertTrue(rectangle.canForm());
    }

    /**
     * 测试矩形能否构成（非法情况）
     **/
    @Test
    void testRectangleCanFormFalse() {
        Rectangle rectangle = new Rectangle();
        rectangle.v1 = new Vertex();
        rectangle.v1.x = 0;
        rectangle.v1.y = 0;
        rectangle.v2 = new Vertex();
        rectangle.v2.x = 2;
        rectangle.v2.y = 2;
        rectangle.v3 = new Vertex();
        rectangle.v3.x = 3;
        rectangle.v3.y = 3;
        rectangle.v4 = new Vertex();
        rectangle.v4.x = 1;
        rectangle.v4.y = 1;
        assertTrue(!rectangle.canForm());
    }

    /**
     * 测试矩形面积计算
     **/
    @Test
    void testRectangleArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.v1 = new Vertex();
        rectangle.v1.x = 0;
        rectangle.v1.y = 0;
        rectangle.v2 = new Vertex();
        rectangle.v2.x = 5;
        rectangle.v2.y = 0;
        rectangle.v3 = new Vertex();
        rectangle.v3.x = 5;
        rectangle.v3.y = 3;
        rectangle.v4 = new Vertex();
        rectangle.v4.x = 0;
        rectangle.v4.y = 3;
        float expectedArea = 15;
        assertEquals(expectedArea, rectangle.calcArea(), 0.01);
    }

}
