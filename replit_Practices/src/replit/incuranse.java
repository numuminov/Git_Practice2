package replit;

import java.util.Scanner;

public class incuranse {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name=scan.nextLine();

        System.out.println("Do you have a US driver license");
        String yesOrnot=scan.next();
        if(yesOrnot.equalsIgnoreCase("no")){System.exit(0);}
        System.out.println("Enter zip code");
        int zip = scan.nextInt();
        if(zip==20290||zip==20270){premium=60;}else if(zip==22102||zip==22103){premium=30;}else{
            premium=50;
        }
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.next();

        if(vehicleOwnership.equalsIgnoreCase("owned")){premium=premium+10;}else{premium+=20;}

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.next();
        if(vehicleUsage.equalsIgnoreCase("Business")){premium+=50;}else if(vehicleUsage.
                equalsIgnoreCase("Pleasure")){premium+=10;}else if(vehicleUsage.equalsIgnoreCase("Commute")){premium+=20;}else{premium+=0;}

        if(vehicleUsage.equalsIgnoreCase("Commute")){

            System.out.println("Days Driven To Work And/Or School");
            int daysToDrive=scan.nextInt();
            System.out.println("Miles Driven To Work And/Or School");
             milesToWorkOrSchool=scan.nextInt();

            premium=premium+(5*daysToDrive)+(milesToWorkOrSchool);
        }
        System.out.println("How old are you?");
        int age=scan.nextInt();
        if(age<16){System.out.println("Invalid data!"); System.exit(0);}else
        if(age<18){premium*=20;}else
        if(age<=21){premium*=6;}else
        if(age<25){premium*=2;}

        System.out.println("How many years you've been driving?");
        int experience=scan.nextInt();

        if(experience<0||age-experience<=16){System.out.println("Invalid data!");System.exit(0);}else{

            premium=premium-(experience*5);
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        String acc=scan.next();

        if(acc.equalsIgnoreCase("yes")){
            System.out.println("How many?");
            int  accint =scan.nextInt();
            premium=premium+(-(premium*0.2)*accint);

        }
        System.out.println("Have you had continuous insurance for the past 12 months?");
        String insurance=scan.next();
        if(insurance.equalsIgnoreCase("no")){premium*=2;}

        System.out.println("What is the highest level of education you have completed?");
        education=scan.next();
        if(education.equalsIgnoreCase("PhD")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters"))
        {premium=premium*0.95;}else
        if(education.equalsIgnoreCase("Doctors")){premium=premium*0.9;}else{premium=premium*1.05;}

        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);






    }
}





