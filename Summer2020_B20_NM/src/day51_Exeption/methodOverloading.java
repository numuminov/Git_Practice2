package day51_Exeption;
/*
method overloading: same method name, different parameter
                    access modifier does not matter
                    return-type does not matter
                    any method can be overload
method overriding: same method name, same parameter, same return-type (MUST)
                   MUST happen in sub class
                   @Override MUST be applicable (for checking)
                   Access Modifier MUST be same or more visible
                   only instance method can be override (cannot be final or private)
visibility:
    public > protected > default > private

 */

public class methodOverloading {

    public void method(int a){

    }

    private void method(double b){

    }

    protected long method(long c){
        return 10;
    }


}