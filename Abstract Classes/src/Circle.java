public class Circle extends Shape {
    private double radius;

    public Circle(double getRadius) {
        radius = getRadius;
    }

    public double calcArea() {
        return (Math.PI*Math.pow(radius, 2));
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
