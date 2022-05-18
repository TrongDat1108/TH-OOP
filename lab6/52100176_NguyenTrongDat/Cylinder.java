public class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius ,double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius ,double height, String color){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return Math.pow(Math.PI,2.0)*height*radius;
    }
    
    @Override
    public String toString(){
        return "Cylinder[ Radius = "+this.radius+", Height = "+this.height+", Color = "+this.color+", Volume = "+this.getVolume()+" ]";
    }
}
