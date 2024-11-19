package pzl;


public class AdapterCircle implements Polygon{
    Circle circle;
    AdapterCircle(Circle circle) {
        this.circle = circle;
    }

    @Override
    public void draw() {
        circle.drawCircle();
    }

    /**
     * 判断圆形是否合法的逻辑
     * @return: boolean
     **/
    @Override
    public boolean canForm() {
        System.out.println();
        if (circle.radius > 0) {
            System.out.println("该圆合法");
            return true;
        }
        System.out.println("非法圆");
        return false;

    }

    /**
     * 计算圆的面积
     * @return: float
     **/
    @Override
    public float calcArea() {
        float ret=circle.areaCircle();
        System.out.println("圆的面积为：  "+ret);
        return ret;
    }
}
