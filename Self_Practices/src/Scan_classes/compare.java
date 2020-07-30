package Scan_classes;

import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word");
        String w1= scan.next();
        System.out.println("word2");
        String w2 =scan.next();
        char ch1= w2.charAt(0);
        char ch2= w1.charAt(w1.length()-1);
        int i1 =w1.length();
        int i2= w2.length();
        if(i1!=5||i2!=5){
            System.out.println("need 5 char");}else if(ch2==ch1){
            System.out.println("Fuzz");}else{
            System.out.println("yana bir narsa");}



    }
}
