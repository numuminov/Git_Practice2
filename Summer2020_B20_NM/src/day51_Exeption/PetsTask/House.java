package day51_Exeption.PetsTask;

public class House {
    public static void main(String[] args) {
        Dog dog1 =new Dog("Winston","Scotty Terrier",'M',4, "Black",7);

        System.out.println(dog1.name);
        System.out.println(dog1);

        Cat cat1= new Cat("Salomon","Belgan",'M',3,"Orange");
        System.out.println(cat1);
        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");

        System.out.println(tiger1);
        tiger1.eat();
    }
}
