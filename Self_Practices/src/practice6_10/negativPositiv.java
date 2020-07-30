package practice6_10;

public class negativPositiv {
    public static void main(String[] args) {
        int num = 0;
        boolean positive = num>0;
        boolean negative = num<0;
        boolean zero = num==0;
        System.out.println(num + " is positive number " + positive);
        System.out.println( num + " is negative number "+ negative);
        System.out.println(num + " is zero " + zero);

        if(positive == true){
            System.out.println(num + " is positive number!");
        };
        if(negative==true){
            System.out.println(num + " is negative number!");
        };
        if ( zero== true){
            System.out.println(num + " is zero!");

        };





    }
}
