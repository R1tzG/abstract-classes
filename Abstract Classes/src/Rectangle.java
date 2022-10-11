public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double getLength, double getWidth) {
        length = getLength;
        width = getWidth;
    }

    public double calcArea() {
        return (length*width);
    }
}
