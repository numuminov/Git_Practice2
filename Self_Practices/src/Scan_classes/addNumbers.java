package Scan_classes;
import java.util.Scanner;


public class addNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        int first =input.nextInt();
        System.out.println("Enter second:");
        int second= input.nextInt();
        System.out.println("Enter third:");
        int third= input.nextInt();
        System.out.println("your total is: "+(first+second+third));

    }
}
