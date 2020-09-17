package practiceClassHours.AbstractTask;

public abstract class   Shape {
    /*
    task01:
    1. create an abstract class called Shape
        attributes:
            name(static), area, perimeter, hasVolume(static), volume
        abstract methods: calculateArea(), calculatePerimeter, calculateVolume()
                            return-types: double
    2. create a sbub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle
    3. create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle
    4. create a sub class of shape called Cylinder
            attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
            override the abstrat methods
            add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
            add a static block that can initialize the static variables of the cylinder
    5. create the following sub classes of shapes:
                Square
                Triangle
                Cude
                ...
                and repeat the same steps
    6. create a class called shape objects:
            create objects of each shapes and calculate thier area, perimeter, and volume
    HINT: Math.PI will give you the actual value of PI
     */

     public static String name;
    double area;
    double perimeter;
    double volume;
    public static boolean hasVolume;



    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public abstract double calculateVolume();


    }









