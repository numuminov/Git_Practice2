package replit;
import java.util.Scanner;


public class books {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer){if(nbooksPurchased>=1&&nbooksPurchased<5){freeBooks=0;}else
        if(nbooksPurchased>=5&&nbooksPurchased<=7){freeBooks=1;}else
        if(nbooksPurchased>=8){freeBooks=2;}else{System.out.println("Invalid num");}

        }else{if(nbooksPurchased>=1&&nbooksPurchased<7){freeBooks=0;}else
        if(nbooksPurchased>=7&&nbooksPurchased<=11){freeBooks=1;}else
        if(nbooksPurchased>=12){freeBooks=2;}else{System.out.println("Invalid num");}}






    }

}
