package replit;

import java.util.Scanner;

public class countWord {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int count =0;
        while(word.contains("java")){
            count++;
            word.replaceFirst("java","");
        }
        System.out.println(count);




    }
}
