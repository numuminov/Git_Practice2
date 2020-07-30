package replit;

import java.util.Scanner;

public class skipX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result="";
        for(int i=0;i<=word.length()-1;i++){if(word.charAt(i)=='x'||word.charAt(i)=='X'){continue;}
            result=result+word.charAt(i);}
            System.out.println(result);


    }

}
