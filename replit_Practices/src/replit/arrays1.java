package replit;
import java.util.Arrays;

public class arrays1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int[] a = new int[arr.length*2];
        a[a.length-1]=arr[arr.length-1];
        System.out.print(Arrays.toString(a));

    }
}
