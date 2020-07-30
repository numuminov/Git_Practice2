package replit;
import java.util.*;

public class first2num {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int r=0;
        if(size>=2){r=2;int [] arr =new int[r];

        arr[0]=num[0];
            arr[1]=num[1];System.out.println(Arrays.toString(arr));

        }else{r=1;int [] arr =new int[r];arr[0]=num[0];


        System.out.println(Arrays.toString(arr));}

    }
}