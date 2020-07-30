package ScanWarmUp;

import java.util.Scanner;

public class lenght {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String text = scan.next();
        int lengh=text.length();
        System.out.println("Lenght is: "+ lengh);
    }
}
