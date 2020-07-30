package replit;

import java.util.Arrays;

public class removeHi {
    public static void main(String[] args) {
        String str ="olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        /*
        int countjava=0;
        int countpython=0;
        int javastr=sentence.length()-4;
        int ptstr=sentence.length()-6;
        for(int i=0;i<=javastr;i++){

            if(sentence.substring(i,i+4).equalsIgnoreCase("java")){countjava++;}
        }
        for(int i=0;i<=ptstr;i++){

            if(sentence.substring(i,i+6).equalsIgnoreCase("python")){countpython++;}
        }

        System.out.println(countjava==countpython);

         *///count word in str

        String [] arr=str.split(", ");
        System.out.println(Arrays.toString(arr));

        int min =arr[0].length();
        for (String each:arr) {
            if(each.length()<min){min=each.length();}


        }
        int count=0;
        for (String each1:arr) {
            if(each1.length()==min){
                count++;
                System.out.println(each1);
                }


        }
        System.out.println(count);


        String[] resultarr= new String[count];
        int x=0;
        for (String each2:arr) {
            if(each2.length()==min){

                resultarr[x]=each2;
                x++;
            }

        }
        Arrays.sort(resultarr);
        System.out.println(Arrays.toString(resultarr));









    }
}