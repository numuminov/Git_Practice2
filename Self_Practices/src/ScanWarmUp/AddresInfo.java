package ScanWarmUp;
import java.util.Scanner;

public class AddresInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("Address");
        int adress = info.nextInt();
        info.nextLine();
        System.out.println("State");
        String state =info.nextLine();
        System.out.println("zipcode");
        int zip = info.nextInt();

        System.out.println(adress + " "+state + " "+zip);


    }
}
