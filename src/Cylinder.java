import static java.lang.Math.PI;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getArea1(double radius,double height){
        double Area=2*PI*radius(radius+height);
        return Area;
    }
    public double getVolume(double Area,double height){
        double volume= ( Area*height);
        return  volume;
    }

    private double radius(double v) {
        return getRadius();
    }


}
