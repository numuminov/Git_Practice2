package Scan_classes;

import java.util.Scanner;

public class charat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence");
        String sent = scan.nextLine();
        char firstletter =sent.charAt(0);
        int Index=sent.length()-1;
        char lastletter = sent.charAt(Index);
        System.out.println(firstletter+" "+lastletter);



    }
}
