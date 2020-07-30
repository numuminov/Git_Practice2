package replit;
import java.util.Scanner;

public class hourConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.

         */
        int hour=Integer.parseInt(s.substring(0,s.indexOf(":")));

        if(s.endsWith("PM"))
        {if(hour==12){
            System.out.println(s.replace("PM",""));
        } else{hour=hour+12;
            System.out.println(hour+s.substring(s.indexOf(":"),s.indexOf("PM")));}

        }

        else {if(hour==12){
            System.out.println("00"+s.substring(2,8));
        }else {
            System.out.println(s.replace("AM",""));
        }


    }
}
}
