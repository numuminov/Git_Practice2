package practice.Arrays;
import java.util.Arrays;

public class splitInt {
    public static void main(String[] args) {
        String[] a={"c#","c#","Java","Py","Pith","C++"};

        int longest =a[0].length();
        int max=longest;





        for(String i: a) {if(i.length()>longest){max=i.length();
        System.out.println(a[max]);}}







    }
}
