package day50_Inheritance_Overriding.ShapeTask;

public class Rectangle extends Shape{
    public double width;
    public double length;

   // public double area;
   // public double perimeter;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }


    public double calculateArea() {

        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}