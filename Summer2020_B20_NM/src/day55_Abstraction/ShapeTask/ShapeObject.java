package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public class ShapeObject {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(7,9);
        System.out.println("rectangle = " + rectangle);
        
        Cylinder cylinder=new Cylinder(6,9);
        System.out.println("cylinder = " + cylinder);
        
        
        Circle circle=new Circle(8);
        System.out.println("circle = " + circle);
        DecimalFormat df= new DecimalFormat("0.00");
    }
}
