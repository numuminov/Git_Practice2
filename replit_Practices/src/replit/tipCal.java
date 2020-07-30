package replit;
/*
Write your code inside the method.
        Use the values given as method parameters.
        Assign final values.
        Then user should select service quality that will correspond to tip percent.
        Poor = 5%
        Fair = 10%
        Good = 15%
        Great = 20%
        Excellent = 25%
        The program should display the following information based on the user input:
        Split or No split
        Number of people entered: &&&&
        Service Quality:
        Total to pay:
        Total tip:
        Total per person:
        Tip per person:

 */


import java.util.Scanner;

public class tipCal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Split?");

        String split =scan.next();
        double totalTip =0;
        String endMark ="";

        if(split.equalsIgnoreCase("yes")){
            System.out.println("number of people");
            int people= scan.nextInt();
            System.out.println("check amount");
            double check =scan.nextDouble();
            System.out.println("service quality");
            String qual = scan.next();


            switch(qual.toLowerCase()){
            case "poor":
                totalTip=check*0.05;
                break;
                case "fair":
                    totalTip=check*0.10;
                    break;
                case "good":
                    totalTip=check*0.15;
                    break;
                case "great":
                    totalTip=check*0.2;
                    break;
                case "excellent":
                    totalTip=check*0.25;
                    break;
                default:
                    System.out.println("invalid quality");}
                    for(int i=1;i<=people;i++){endMark=endMark+"&";

                    }
                    double totalpay= check+totalTip;
                    double totalperper=totalpay/people;
                    double tipperper=totalTip/people;
            System.out.println("Number of people entered: " +endMark);
            System.out.println("Total to pay: " +totalpay);
            System.out.println("Total tip: " +totalTip);
            System.out.println("Total per person: " +totalperper);
            System.out.println("Tip per person: " +tipperper);







        }else{
            System.out.println("good bye");
        }


















    }}



