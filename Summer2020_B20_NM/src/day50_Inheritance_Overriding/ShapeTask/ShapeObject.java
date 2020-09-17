package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle =new Circle(3);
        System.out.println("area of circle is: "+circle.area);
        System.out.println("===================");
        Rectangle rectangle=new Rectangle(3,4);

        System.out.println("area of rectangle is: "+rectangle.area);
        System.out.println("perimeter of rectangle is: "+rectangle.perimeter);
        System.out.println("width of rectangle is: "+rectangle.length);
        System.out.println("length of rectangle is: "+rectangle.width);

    }
}
