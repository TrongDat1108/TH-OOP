public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle() {
        base = 0.0;
        height = 0.0;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (this.base * this.height);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            Triangle temp = (Triangle) obj;
            if (this.getArea() == temp.getArea()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + this.base + ", height=" + this.height + "}";
    }
}
