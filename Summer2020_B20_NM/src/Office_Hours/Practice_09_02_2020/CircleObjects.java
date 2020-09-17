package Office_Hours.Practice_09_02_2020;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1=new Circle(3);

        System.out.println("circle1 radius:  " + circle1.radius);
        System.out.println("circle1 diameter:  " + circle1.diameter);
        System.out.println("circle1 area:" +circle1.area);
        System.out.println(circle1.area);

        System.out.println(" Circle1 perimeter: "+ circle1.perimeter);
        System.out.println("=========================");
        Circle circle2= new Circle(5);

        System.out.println("Circle2 radius: "+ circle2.radius);
        System.out.println("Circle2 diameter: "+ circle2.diameter);
        System.out.println("Circle2 area: "+ circle2.area);
        System.out.println("Circle2 perimeter: "+ circle2.perimeter);
        System.out.println("============================");

        Circle circle3= new Circle(6);

        System.out.println("Circle3 radius: "+ circle3.radius);
        System.out.println("Circle3 diameter: "+ circle3.diameter);
        System.out.println("Circle3 area: "+ circle3.area);
        System.out.println("Circle3 perimeter: "+ circle3.perimeter);


        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);







    }


}
