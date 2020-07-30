package Scan_classes;

import java.util.Scanner;

public class task_Stringchar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence ");
        String sentence=scan.nextLine();
        char firstlet= sentence.charAt(0);
        int lastindnumb=sentence.length()-1;
        char lastnum= sentence.charAt(lastindnumb);
        System.out.println("first letter is: "+firstlet+" last letter is: "+lastnum);



    }
}
