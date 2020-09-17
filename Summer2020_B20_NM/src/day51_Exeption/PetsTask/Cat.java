package day51_Exeption.PetsTask;

public class Cat extends Pet{

    public Cat(String name, String bread, char gender, int age, String color) {
        super(name, bread, gender, age, color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
