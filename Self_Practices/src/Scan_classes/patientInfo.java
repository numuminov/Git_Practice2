package Scan_classes;
import java.util.Scanner;
public class patientInfo {
        public static void main(String[] args) {
            //Enter your code here
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the patient portal!");
            System.out.println("Please enter your personal information");
            System.out.println("Enter your first name");
            String firstName= scan.next();
            System.out.println("Enter your last name");
            String lastName= scan.next();







            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            String email = scan.next();
            scan.nextLine();//to capture Enter key press
            System.out.println("Enter your street");
            String street = scan.nextLine();
            // continue for city
            System.out.println("Enter your city");
            String city= scan.next();
            System.out.println("Enter your state");
            String state= scan.next();
            System.out.println("Enter your zip code");
            int zipcode = scan.nextInt();
            System.out.println("Enter your work phone number");
            long workPhoneNumber=scan.nextLong();
            System.out.println("Enter your personal phone number");
            long personalPhoneNumber=scan.nextLong();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Enter your height");
            double height = scan.nextDouble();
            System.out.println("Enter your weight");
            double weight = scan.nextDouble();
            System.out.println("Are you married?");
            boolean isMarried =scan.nextBoolean();
            System.out.println("Patient personal information");
            System.out.println("Full name: "+lastName+firstName);

            System.out.println("Adress: " +street+", "+ city+", "+state+" "+ zipcode);
            System.out.println("Contacts: work phone number-"+workPhoneNumber+", personal phone number-"+personalPhoneNumber+", email: "+email);
            System.out.println("Age: "+ age );

            System.out.println("Height: "+height);
            System.out.println("Weight: "+weight+" pounds");
            System.out.println("Married?: " +isMarried);












        }
    }






