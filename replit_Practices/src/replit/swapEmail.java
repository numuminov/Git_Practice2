package replit;

public class swapEmail {
    public static void main(String[] args) {

        /*
        xample:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com
         */
        String email="tyson_mike@gmail.com";
        if(email.contains("_")){
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf("@"))+"_"+email.substring(0,email.indexOf("_") ) +
                    email.substring(email.indexOf("@")));
        }else {
            System.out.println(email);
        }





    }
}
