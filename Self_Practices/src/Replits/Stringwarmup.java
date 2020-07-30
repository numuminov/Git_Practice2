package Replits;

import java.util.Scanner;

public class Stringwarmup {
    public static void main(String[] args) {


        /*
        1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

         */
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("enter word");
        String word = scan.next();
        char x1 = word.charAt(0);
        if(x1=='x'||x1=='X') System.out.println(word.substring(1));else System.out.println(word);
        /*
        Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                        oidex



        System.out.println("enter word");
        String word2 = scan.next();
        boolean b2= word2.startsWith("x");
        boolean c2= word2.endsWith("x");
        boolean d2= word2.charAt(1)=='x';
        if(b2) System.out.println(word2.substring(1)); else
        if(b2&&c2) System.out.println(word2.substring(1,word2.length()-1)); else
        if(c2) System.out.println(word2.length()-1); else
        if(b2&&d2) System.out.println(word2.substring(2)); else
        if(d2) System.out.println(word2.substring(0,1).concat(word2.substring(2)));else System.out.println(word2);


         */


/*
Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */

        System.out.println("enter word1");
        String one = scan.next();

        System.out.println("enter word1");
        String two = scan.next();

        char ch1= one.charAt(one.length()-1);
        char ch2= two.charAt(0);
        if(ch1==ch2) System.out.println(ch1);else System.out.println(one.concat(two));


    }
}
