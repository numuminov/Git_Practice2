package Office_Hours.Practice_09_09_2020;

public class Phone {
    /*
    Phone: brand, model, price, madeIn, call(), text()
    static: brand, madeIn
    instance: model, price, call(), text(), toString()
Samsung: brand, model, price, madeIn, call(), text(), toString()
Iphone: brand, model, price, madeIn, call(), text(), toString()
Nokia: brand, model, price, madeIn, call(), text(), toString()
overriding: one method with different implemntations

     */

    public static String brand;
    public static String madeIn;

    public String model;
    public double price;

    public Phone(String model, double price){
        this.model  = model;
        this.price = price;
    }


    public void call(long phoneNumber){
        System.out.println("Phone is calling: "+phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Phone is texting to: "+phoneNumber);
    }

    public String toString(){
        return "Brand: "+brand+" \nModel: "+model+"\nPrice: $"+price+" \nMade in: "+madeIn;
    }

}