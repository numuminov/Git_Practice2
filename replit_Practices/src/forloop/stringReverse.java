package forloop;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your word");
        String w=scan.next();
        int w2=w.length()-1;
        String reverse= "";

        for(int i=w2; i>=0;i--)  {reverse+=w.charAt(i);} {System.out.println(reverse);}

        if(w==reverse) {System.out.println(true);}
        else{
            System.out.println(false);}



    }
}
