package replit;

import java.util.Arrays;

public class vowels {
    public static void main(String[] args) {
        String word="qwertuikmjh";

        String vowel="aeuio";
        String result="";
        for(int each:word.toCharArray()){
            for(int each1:vowel.toCharArray()){

                if(each==each1){result+=""+each;}
            }}
            System.out.println(result);


    }}