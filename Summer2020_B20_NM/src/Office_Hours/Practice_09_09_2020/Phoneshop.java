package Office_Hours.Practice_09_09_2020;

public class Phoneshop {
    public static void main(String[] args) {
        Iphone iphone =new Iphone("11 Pro",1000);
        iphone.call(911);
        iphone.text(111);
        System.out.println(iphone);
        System.out.println("=======================");


        Samsung samsung =new Samsung("Galaxy Note20",850);

        System.out.println( samsung);
        samsung.call(1234);
        samsung.text(321122);
        System.out.println("==========================");

        Nokia nokia =new Nokia("3100",80);
        nokia.call(3421);
        nokia.text(3421);

        System.out.println(nokia);









    }
}
