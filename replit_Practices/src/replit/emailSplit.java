package replit;

import java.util.Scanner;

public class emailSplit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        String email = input.nextLine();
        String email2=email;

        //Write your code below
        int count =0;


        while(email.contains("@")){
            count++;
            email=email.replaceFirst("@","");
        }

        if(count==1){String id=email2.substring(0,email2.indexOf("@"));
            String domain=email2.substring(email2.indexOf("@")+1);System.out.println("Email id: "+id);
            System.out.println("Email domain: "+domain);


        }else{System.out.println("invalid email");}

    }
}