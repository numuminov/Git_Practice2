package day51_Exeption.PetsTask;

public class Pet {
    /*
    Animal Task:
            1. create a class called Pet
                    attributes:
                            name, age, gender, breed, color
                    create a constructor that can initialize the instances
                   instance methods (with protected access modifiers):
                            eat(): by default assume all Pets eat  chocolate
                            drink(): by default assume all Pets drink milk
                            sleep(): by default assume all Pet sleep on the floor
                            toString():

     */
    public String name;
    public  String bread;
    public char gender;
    public  int age;
    public  String color;

    public Pet(String name, String bread, char gender, int age, String color) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    protected void eat(){
        System.out.println(name+" is eating chocolate");

    }
    protected void drink(){
        System.out.println(name+" is drinking milk");

    }



    protected void sleep(){
        System.out.println(name+" is sleeping on the floor");

    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
