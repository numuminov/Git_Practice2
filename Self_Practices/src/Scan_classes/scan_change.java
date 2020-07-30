package Scan_classes;
import java.util.Scanner;


public class scan_change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents: ");
        int itemPrice = scan.nextInt();
        int quarters=(100-itemPrice)/25;
        int dimes =((100-itemPrice)/25)/10;
        int nickels=((100-itemPrice)/25)/10/5;


        if(itemPrice % 5 == 0&&itemPrice>=25&&itemPrice<=100){System.out.println("Your change is "+quarters+" quaters, "+dimes+" dimes, and "+nickels+" nikels.");






        }else{System.out.println("Invalid price");}


    }


}
