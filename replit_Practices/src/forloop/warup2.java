package forloop;

import java.util.Scanner;

public class warup2 {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        houseType=scan.nextLine();
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms =scan.nextInt();
        System.out.println("Do you have a backyard?");
        backyard=scan.nextBoolean();
        if(houseType.equals("Condo")&&backyard){
            System.out.println("Backyard is not available for condo!");}
        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();

        System.out.println("How many spots");
        garageSpots=scan.nextInt();
        if(garageSpots>10){System.out.println("Pardon,  it's not a public parking!");}
            System.out.println("How close is metro station?");
            metroAccessibility=scan.nextFloat();
            System.out.println("How close is highway?");
            highwayAccessibility=scan.nextFloat();
            System.out.println("What's the rating of nearest school?");
                    schoolScore=scan.nextFloat();
            System.out.println("Does any of your family members smoking?");
            smoking=scan.nextBoolean();
            System.out.println("Market report has been generated ");
        int backyardInt =0;
        int garageInt=0;
        float MetroInt=0;
        float HighwayInt=0;
        float SchoolInt=0;
        int Smoke=0;
        int HouseInt=0;

        if(backyard&&!houseType.equals("Condo")){backyardInt=5000;}else{backyardInt=0;}

        if(houseType.equals("Condo")){HouseInt=50000;}else
        if(houseType.equals("Townhouse")){HouseInt=75000;}else
        if(houseType.equals("Single Family Home")){HouseInt=95000;}

        if(garageSpots<=10){garageInt=20000*garageSpots;}else{garageInt=garageSpots*10;}

        if(metroAccessibility<=1&&metroAccessibility>0){MetroInt=10000;}else
            if(metroAccessibility>1&&metroAccessibility<=3){MetroInt=5000;}else
            {MetroInt=0;}

        if(highwayAccessibility<=1&&highwayAccessibility>0){HighwayInt=15000;} else
        if(highwayAccessibility>1&&highwayAccessibility<=5){HighwayInt=8000;}else
        if(highwayAccessibility>5&&highwayAccessibility<=20){HighwayInt=4000;}

        else{MetroInt=0;}

        if(schoolScore<=10&&schoolScore>=8){SchoolInt=45000;} else
        if(schoolScore<8&&schoolScore>=4){SchoolInt=20000;}else{SchoolInt=5000;}
        if(smoking){Smoke=5000;}else{Smoke=0;}



        propertyPrice= (HouseInt+(30000*numberOfBedrooms)+backyardInt+garageInt+(int)MetroInt+
                (int)HighwayInt+(int)SchoolInt-Smoke);





















                    System.out.println("Your estimate matrket price is: "+propertyPrice+"$");




        }
}

