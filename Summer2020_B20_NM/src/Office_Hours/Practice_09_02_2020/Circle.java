package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI;

    public double area;
    public  double perimeter;

    static {PI=3.14;}

    public Circle(double radius) {
        this.radius = radius;
        diameter=radius*2;
        area=calculateArea();
        perimeter=calculatePerimeter();
    }
    private double calculateArea(){

        return radius*radius*PI;
    }
    private double calculatePerimeter(){

        return diameter*PI;
    }
    public String toString(){

        return  "Radius: "+radius+", Diameter: "+diameter+", Area: "+area+", Perimeter: "+perimeter;
    }





}
