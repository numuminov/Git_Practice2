package practiceClassHours.AbstractTask;

public class Rectangle extends Shape {

    double length;
    double width;
    static {name="Rectangle";
        hasVolume=false;}

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;

    }

    @Override
    public double calculateArea() {
        return area=length*width;
    }

    @Override
    public double calculatePerimeter() {
        return perimeter=2*(length+width);
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }


}
