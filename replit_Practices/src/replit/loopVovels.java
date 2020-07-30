package replit;

import java.util.Scanner;

public class loopVovels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String fn=email.substring(0,email.indexOf("_"));
        String ln=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String dm=email.substring(email.indexOf("@")+1,email.indexOf("."));
        String tpdm=email.substring(email.indexOf(".")+1,email.length());



        System.out.println("First name: "+fn);
        System.out.println("Last name: "+ln);
        System.out.println("Domain: "+dm);
        System.out.println("Top-Level Domain: "+tpdm);





    }
}
