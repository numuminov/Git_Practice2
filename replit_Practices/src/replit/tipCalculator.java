package replit;
import java.util.Scanner;
public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Split:");
        String yesOrNot =scan.next();
        String endMark ="";

        double totalTip=0;




        if(yesOrNot.equalsIgnoreCase("yes")){
            System.out.println("Number of people:");
            int numOfPeople =scan.nextInt();

            System.out.println("Check amount:");
            double check=scan.nextDouble();

            System.out.println("Service Quality:");
            String qual =scan.next();

            for(int i=1;i<=numOfPeople;i++){endMark=endMark+"&";}

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

                    totalTip=check*0.20;
                    break;

                case "excellent":

                    totalTip=check*0.25;
                    break;
            }

            double pay=check+totalTip;
            double totalPerPerson=pay/numOfPeople;
            double tipPerPerson=totalTip/numOfPeople;

            System.out.println("Number of people entered: "+endMark);
            System.out.println("Total to pay: "+pay);
            System.out.println("Total tip: "+ totalTip);
            System.out.println("Total per person: "+tipPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);


















        }else{System.out.println("Bye");}






    }
}

