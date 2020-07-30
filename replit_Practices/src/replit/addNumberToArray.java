package replit;

import java.util.Arrays;

public class addNumberToArray {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6};
        add_to_r(arr,n);
       String t= next3(n);
        System.out.println(t);


    }

    public static void add_to_r(int arr[],int  n) {

        int[] arr2 = new int [arr.length + 1];
        arr2[arr2.length-1]=n;
        int k=0;
        for(int each: arr){
            arr2[k]=each;
            k++;

        }
        System.out.println(Arrays.toString(arr2));}

    public static String next3(int num){

        String next=(num+1)+" "+(num+2)+" "+(num+3);


  return next;}



}



