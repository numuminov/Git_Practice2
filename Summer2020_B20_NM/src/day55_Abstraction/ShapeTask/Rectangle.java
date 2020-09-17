package day55_Abstraction.ShapeTask;

public class Rectangle extends Shape{
/*
3. create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods

            add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle

 */
    public double width;
    public double length;

    public Rectangle(double width, double length){
        if(width <=0|| length<=0){
            throw new RuntimeException("Invalid length or width");
        }




        this.length=length;
        this.width=width;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateVolume();

    }

    static {
        name="Rectangle";
        hasVolume=false;

}
@Override
public double calculateArea(){
  return       width*length;

}
@Override
    public double calculatePerimeter(){
        return       2*(width+length);

    }
@Override
    public double calculateVolume(){
        return       0;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width: " + width +
                "length: " + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
