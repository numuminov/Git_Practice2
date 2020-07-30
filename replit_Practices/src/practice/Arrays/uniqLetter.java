package practice.Arrays;

public class uniqLetter {
    public static void main(String[] args) {
        String str="addccnamgg";
        String uniq="";


        for(int j=0;j<=str.length()-1;j++){
            char ch2=str.charAt(j);
            int count =0;

        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch2==ch){count++;}


        }
        if(count==1){uniq=uniq+ch2;}}
        System.out.println(uniq);
    }
}
