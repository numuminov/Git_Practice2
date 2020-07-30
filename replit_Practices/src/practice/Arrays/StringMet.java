package practice.Arrays;

public class StringMet {
    public static void main(String[] args) {
        int[] num ={1,2,3,4,5,5,4,3,2,1,6,7,6,9};


        for(int j=0;j<=num.length-1;j++) {

            int b = num[j];

            int count = 0;
            for (int i = 0; i <= num.length - 1; i++) {
                int a = num[i];
                if (b == a) {
                    count++;
                }

            }
            if(count==1){System.out.println(b);}
        }


    }
}
