package day6_16warmUp;

public class maxNumber {
    public static void main(String[] args) {
        int num1=21;
        int num2=99;
        int num3 = 7;
        if (num1>num2 && num1>num3){
            System.out.println(num1+ " is maxsimum number");
        };
        if (num2>num1 && num2>num3){
            System.out.println(num2 +" is maxsimum number");
        };
        if(num3>num1 && num3>num2){
            System.out.println(num3 +" is maxsimum number");
        };
        if(num1<num2 && num1<num3) {
            System.out.println(num1 + " is minimum number");
        };
        if (num2<num1 && num2<num3){
            System.out.println(num2 +" is minimum number");
        };
        if(num3<num1 && num3<num2){
            System.out.println(num3 +" is minimum number");
        };
        if(num1<num2 && num1>num3) {
            System.out.println(num1 + " is mediam number");
        };
        if (num2<num1 && num2>num3){
            System.out.println(num2 +" is mediam number");
        };
        if(num3<num1 && num3>num2){
            System.out.println(num3 +" is mediam number");
        };


    }
}
