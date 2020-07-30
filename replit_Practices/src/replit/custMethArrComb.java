package replit;
import java.util.Arrays;

public class custMethArrComb {
    public static int[] mergR(int[] a,int[] b) {
        int [] c=new int[a.length+b.length];
        int z=0;
        for(int each: a){
            c[z]=each;
            z++;
        }
        for(int each: b){
            c[z]=each;
            z++;

        }

        return c;

    }//end merg

    public static void main(String[] args) {
        int q []={1,2,3};
        int t []={1,2,3};
        int j[]=mergR(q,t);
        System.out.println(Arrays.toString(j));
    }
}
