package day6_16warmUp;

public class eligibleBuy {
    public static void main(String[] args) {
        int age = 18;
        String name = "John Oliver";
        boolean eligibleBuy =age >= 18;
        if(eligibleBuy==true){
            System.out.println(name +" is eligible to buy alcohol");
        };
        if(eligibleBuy==false){
            System.out.println(name +" is not eligible to buy alcohol");
        };

    }
}
