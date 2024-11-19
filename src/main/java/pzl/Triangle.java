package pzl;

public class Triangle implements Polygon{
    Vertex v1;
    Vertex v2;
    Vertex v3;

    /**
     * 绘制三角形的逻辑
     **/
    @Override
    public void draw() {

    }

    /**
     * 判断三个顶点是否能构成三角形的逻辑
     * @return: boolean
     **/
    @Override
    public boolean canForm() {

        float a = calcDistance(v1, v2);
        float b = calcDistance(v2, v3);
        float c = calcDistance(v3, v1);
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * 计算面积
     * @return: float
     **/
    @Override
    public float calcArea() {
        float a = calcDistance(v1, v2);
        float b = calcDistance(v2, v3);
        float c = calcDistance(v3, v1);
        float s = (a + b + c) / 2;
        return (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    private float calcDistance(Vertex v1, Vertex v2) {
        float dx = v2.x - v1.x;
        float dy = v2.y - v1.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }

}
