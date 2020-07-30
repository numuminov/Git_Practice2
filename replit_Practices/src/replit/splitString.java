package replit;

import java.util.Arrays;

public class splitString {
    public static void main(String[] args) {

        String s2 = "java is fun";
        /*
        String[] arr=s.split(",");
        System.out.print("person name: "+arr[0]+" last name: "+ arr[1] +" age: "+ arr[2]);

         */
        String[] arr2 = s2.split(" ");
        for (int i = arr2.length - 1; i >= 0; i--) {

            System.out.println(arr2[i]);

        }
    }}
