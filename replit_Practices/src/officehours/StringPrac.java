package officehours;

public class StringPrac {


    public static void main(String args[]) {
        /*
        3. write a program that can reverse the following string:
                String str = "Java";
                output: avaJ
            please provide two solutions:
                        first solution, you MUST use substring method
                        second solution, you MUST use charAt method
4. write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo

         */

        // reverse the String
        String str ="Java";
        System.out.println(str.substring(1).concat(str.substring(0,1)));

        //
        char ch1 = str.charAt(0);
        String str2 = str.substring(1)+ch1;
        System.out.println(str2);

        String mail= "test@mail.com";
        int first=mail.indexOf("@")+1;
        int last = mail.indexOf(".");
        System.out.println(mail.substring(first,last));

        double fareng= 100;
        double celci=fareng*2;
        System.out.println(celci);







    }
}
