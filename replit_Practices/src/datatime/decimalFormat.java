package datatime;

import java.text.DecimalFormat;

public class decimalFormat {
    public static void main(String[] args) {
        DecimalFormat m=new DecimalFormat("0.000");
        double r =4.778876;
        double t = 5.09876;
        System.out.println(r+t);
        System.out.println(m.format(r+t));
    }
}