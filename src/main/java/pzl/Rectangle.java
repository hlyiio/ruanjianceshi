package pzl;

public class Rectangle implements Polygon{
    Vertex v1;
    Vertex v2;
    Vertex v3;
    Vertex v4;
    @Override
    public void draw() {
        // 绘制矩形的逻辑
    }

    /**
     * 判断四个顶点是否能构成矩形的逻辑
     * @return: boolean
     **/
    @Override
    public boolean canForm() {
        float d1 = calcDistance(v1, v2);
        float d2 = calcDistance(v2, v3);
        float d3 = calcDistance(v3, v4);
        float d4 = calcDistance(v4, v1);
        float d5 = calcDistance(v1, v3);
        float d6 = calcDistance(v2, v4);
        return d1 == d3 && d2 == d4 && d5 == d6;
    }

    /**
     * 计算面积
     * @return: float
     **/
    @Override
    public float calcArea() {
        float width = calcDistance(v1, v2);
        float height = calcDistance(v2, v3);
        return width * height;
    }

    private float calcDistance(Vertex v1, Vertex v2) {
        float dx = v2.x - v1.x;
        float dy = v2.y - v1.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}
