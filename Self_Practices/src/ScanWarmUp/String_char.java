package ScanWarmUp;
import java.util.Scanner;


public class String_char {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int word1=word.length();
        int word2=word1/2;

        if(word1%2==1&&word1>=3){System.out.println(word.charAt(word2));}
        if(word1==1){
            System.out.println(word+ word+word
            );}
    }}
