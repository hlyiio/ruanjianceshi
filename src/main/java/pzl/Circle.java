package pzl;


public class Circle {
    Vertex center;
    float radius;

    /**
     * 绘制圆形的逻辑
     **/
    void drawCircle() {

    }

    /**
     * 计算圆的面积
     * @return: float
     **/
    float areaCircle() {
        return (float) (Math.PI * radius * radius);
    }
}
