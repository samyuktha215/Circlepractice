public class Main {
    public static void main(String[] args)
    {
       Circle circle= new Circle(10);
        System.out.println("circle radius:"+circle.getRadius());
        System.out.println("circle area:"+circle.getArea());
        Cylinder cylinder=new Cylinder(10,10);
        System.out.println("cylinder height:"+cylinder.getHeight());
        System.out.println("cylinder radius:"+cylinder.getRadius());
        System.out.println("cylinder area:"+cylinder.getArea());
        System.out.println("cylinder volume:"+cylinder.getVolume(10,10));


    }
}