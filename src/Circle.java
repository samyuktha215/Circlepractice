import static java.lang.Math.*;
public class Circle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double Area=radius*radius*PI;
        return Area;
    }
}
