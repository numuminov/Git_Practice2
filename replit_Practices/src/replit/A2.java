package replit;

public class A2 extends A1{

    public A2(){
        super(3);
    }

    public String graduationRequirements(){
        return super.graduationRequirements()+ " and passing bar";
    }

}