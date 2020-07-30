package Scan_classes;
import java.util.Scanner;

public class repl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if (word.length()>5||word.length()<5){if(word.length()>5){System.out.println("Too long!");}else{System.out.println("Too short!");}}else{




            System.out.print(word.charAt(4));
            System.out.print(word.charAt(3));
            System.out.print(word.charAt(2));
            System.out.print(word.charAt(1));
            System.out.print(word.charAt(0));

        }}
}

