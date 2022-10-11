public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println(circle.calcArea());
        System.out.println(rectangle.calcArea());
    }
}