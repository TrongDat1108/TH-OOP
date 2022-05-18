public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public boolean equals(Shape s) {
        if (s instanceof Circle) {
            Circle temp = (Circle) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle[" + this.radius + ", " + this.color + ", " + this.filled + ", " + this.getArea() + ", "
                + this.getPerimeter() + "]";
    }
}
