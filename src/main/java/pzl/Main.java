package pzl;


public class Main {

    public static void main(String[] args) {
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

        System.out.println("Triangle can form: " + triangle.canForm());
        System.out.println("Triangle area: " + triangle.calcArea());
        triangle.draw();

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

        System.out.println("Rectangle can form: " + rectangle.canForm());
        System.out.println("Rectangle area: " + rectangle.calcArea());
        rectangle.draw();

        Circle circle = new Circle();
        circle.center = new Vertex();
        circle.center.x = 2;
        circle.center.y = 2;
        circle.radius = 3;

        AdapterCircle adapterCircle = new AdapterCircle(circle);
        System.out.println("AdapterCircle can form: " + adapterCircle.canForm());
        System.out.println("AdapterCircle area: " + adapterCircle.calcArea());
        adapterCircle.draw();
    }
}
