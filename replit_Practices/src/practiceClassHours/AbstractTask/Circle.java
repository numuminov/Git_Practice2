package practiceClassHours.AbstractTask;

public class Circle extends Shape{

    public double radius;

    public Circle( double radius) {
        this.radius=radius;
    }
    static {name="Circle";
    hasVolume=false;}

    @Override
    public double calculateArea() {
        return area=radius*radius*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return perimeter=2*Math.PI*radius;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
