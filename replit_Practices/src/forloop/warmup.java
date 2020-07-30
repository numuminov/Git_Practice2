package forloop;

public class warmup {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){if(i%3!=0) System.out.print(i+" ");}

        System.out.println();
        int fact=1;

        for(int k=5;k>=1;k--) {fact*=k;}
        System.out.println(fact);
    }
}
