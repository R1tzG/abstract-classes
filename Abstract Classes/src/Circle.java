public class Circle extends Shape {
    private double radius;

    public Circle(double getRadius) {
        radius = getRadius;
    }

    public double calcArea() {
        return (Math.PI*Math.pow(radius, 2));
    }
}
