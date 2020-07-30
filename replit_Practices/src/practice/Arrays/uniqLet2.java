package practice.Arrays;

public class uniqLet2 {
    public static void main(String[] args) {
        String word ="asdfghgfdskj";
        String uniqLet="";


        for(int i=0;i<=word.length()-1;i++){

            char ch =word.charAt(i);
            int f=word.indexOf(ch);
            int l=word.lastIndexOf(ch);
            if(f==l){uniqLet=uniqLet+ch;
            }
        }
        System.out.println(uniqLet);
    }
}
