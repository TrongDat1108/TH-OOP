public class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public boolean equals(Shape s) {
        if (s instanceof Rectangle) {
            Rectangle temp = (Rectangle) s;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Rectangle[" + this.width + ", " + this.length + ", " + this.getArea() + ", " + this.getPerimeter()
                + ", " + this.color + ", " + this.filled + "]";
    }
}
