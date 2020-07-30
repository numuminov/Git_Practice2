package officehours.Forloop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class dublicate {
    public static void main(String[] args) {
        String a = "dddccssjjuu";
        String b = "";
        for (int i = 0; i <= a.length() - 1; i++) {
            String ch = "" + a.charAt(i);

                if (b.contains(ch)) {
                    continue;
                } else {
                    b += ch;}
            }
            System.out.println(b);


        String expextedResult="";

        for(int j=0;j<=b.length()-1;j++){

        int count=0;
        char ch =b.charAt(j);

        for(int i=0; i<=a.length()-1;i++){

            if(a.charAt(i)==ch){count++;}}
            expextedResult=expextedResult+ch+count;
        }
        System.out.println(expextedResult);
    }




}
