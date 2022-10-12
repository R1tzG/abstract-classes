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

    public int compareTo(Shape shape) {
        if(this.calcArea() > shape.calcArea()) {
            return 1;
        }
        else if(this.calcArea() < shape.calcArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
