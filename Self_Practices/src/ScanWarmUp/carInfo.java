package ScanWarmUp;

import java.util.Scanner;

public class carInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter brand");
        String brand =info.next();
        System.out.println("enter model");
        String model = info.next();
        System.out.println("enter year");
        String year = info.next();
        System.out.println("Enter color");
        String color =info.next();
        System.out.println("Mileage");
        String mile =info.next();
        System.out.println("Price");
        String price =info.next();
        System.out.println(year +" "+brand+" "+model+" "+color+" "+mile+ " "+ price);

    }
}
