package practiceClassHours;

import java.util.Arrays;

public class Split2arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3, 4,5,6,78,98,12,12,1321,312,321,112};
        int[] arr2 = {4,5,4,5,6,7,8,9,0};
        /*


        int index =0;

        int size= arr1.length+arr2.length;
        int [] arr3= new int [size];

        for(int each:arr1){
            arr3[index]=each;
            index++;

        }

        for(int each:arr2){
            arr3[index]=each;
            index++;

        }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("Maxsimum number is: " +(arr3[arr3.length-1]));

         */
        int index=0;
        int[] arr3= new int[arr1.length+arr2.length];


        for(int each: arr1){

            arr3[index]=each;
            index++;

        }
        for(int each: arr2){
            arr3[index]=each;
            index++;

        }
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("max num is: "+ arr3[arr3.length-1]);












    }
}
