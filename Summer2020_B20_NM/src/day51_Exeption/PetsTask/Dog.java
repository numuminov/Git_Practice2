package day51_Exeption.PetsTask;

public class Dog extends Pet {

    double price;

    public Dog(String name, String bread, char gender, int age, String color, double price) {
        super(name, bread, gender, age, color);
        this.price=price;
    }
}
