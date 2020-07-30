package replit;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i=0;i<=word.length()-1;i++){System.out.println(word.charAt(i));}


    }
}

