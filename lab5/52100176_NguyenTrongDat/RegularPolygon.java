public class RegularPolygon {
    private String name;
    private int egdeAmount;
    private double egdeLength;

    public RegularPolygon() {
        name = "";
        egdeAmount = 3;
        egdeLength = 1;
    }

    public RegularPolygon(String name, int egdeAmount, double egdeLength) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = egdeLength;
    }

    public RegularPolygon(String name, int egdeAmount) {
        this.name = name;
        this.egdeAmount = egdeAmount;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.egdeAmount = polygon.egdeAmount;
        this.egdeLength = polygon.egdeLength;
    }

    public String getName() {
        return this.name;
    }

    public int getEgdeAmount() {
        return this.egdeAmount;
    }

    public double getEgdeLength() {
        return this.egdeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEgdeAmount(int edgeAmount) {
        this.egdeAmount = edgeAmount;
    }

    public void setEgdeLength(double edgeLength) {
        this.egdeLength = edgeLength;
    }

    public String getPolygon() {
        if (this.egdeAmount == 3) {
            return "Triangle";
        } else if (this.egdeAmount == 4) {
            return "Quadrangle";
        } else if (this.egdeAmount == 5) {
            return "Pentagon";
        } else if (this.egdeAmount == 6) {
            return "Hexagon";
        }
        return "Polygon has the number of edges greater than 6";
    }

    public double getPerimeter() {
        return this.egdeAmount * this.egdeLength;
    }

    public double getArea() {
        if (this.egdeAmount > 6) {
            return -1;
        } else if (this.egdeAmount == 3) {
            return (this.egdeLength * this.egdeLength) * 0.433;
        } else if (this.egdeAmount == 4) {
            return (this.egdeLength * this.egdeLength) * 1;
        } else if (this.egdeAmount == 5) {
            return (this.egdeLength * this.egdeLength) * 1.75;
        } else if (this.egdeAmount == 6) {
            return (this.egdeLength * this.egdeLength) * 2.595;
        }
        return 0;
    }

    public String toString() {
        return this.name + " - " + getPolygon() + " - " + getArea();
    }
}
