package replit;

import java.util.Arrays;

public class firstAndLast {
    public static void main(String[] args) {
        String [] words={"hello", "way", "bye", "apple", "nate"};
        for(String each: words){String words2=
                (""+each.charAt(0)+each.charAt(each.length()-1)+", ");
        String [] word3= words2.split(",");
            System.out.println(Arrays.toString(word3));}
    }
}
