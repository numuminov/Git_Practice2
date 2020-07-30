package ScanWarmUp;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("first num");
        double fnum =scan.nextDouble();

        System.out.println("second num");
        double snum =scan.nextDouble();

        System.out.println("oper");
        String oper =scan.next();
        char op=oper.charAt(0);
        double result =0;
        if(op=='*'||op=='/'||op=='%'||op=='-'||op=='+'){
            if(op=='*'){result=fnum*snum;}else
            if(op=='/'){result=fnum/snum;}else
            if(op=='%'){result=fnum%snum;}else
            if(op=='+'){result=fnum+snum;}else
            {result=fnum-snum;}









        }else{
            System.out.println("invalid char");
        }
        System.out.println(result);

    }
}
