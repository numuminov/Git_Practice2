package replit;
import java.util.Scanner;


public class copPrice {

    public static void main(String[] args) {
        double price = 0;
        String storageType, screenType, cpu;
        int ram = 0 ;

        double ScrSzPrice=0;

        int cpuPrice=0;

        int StorageTypePrice=0;

        int ScreenResprice=0;


        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Select screen size:");
        String screenSize =scan.next();

        System.out.println("Select CPU type:");
        cpu=scan.next();

        System.out.println("Select RAM size:");
        ram = scan.nextInt();

        System.out.println("Select storage type:");
        storageType=scan.next();

        System.out.println("Enter memory size:");
        int memory=scan.nextInt();

        System.out.println("Enter screen resolution:");
        screenType=scan.next();

        switch(screenSize){
            case "13.3":
                ScrSzPrice=200;
                break;

            case "15":
                ScrSzPrice=300;
                break;

            case "17.3":
                ScrSzPrice=400;
                break;    }

        switch (cpu){
            case "i3":
                cpuPrice=150;
                break;

            case "i5":
                cpuPrice=250;
                break;

            case "i7":
                cpuPrice=350;
                break;    }

        int ramPrice=(ram/4)*50;

        if(storageType.equals("SSD"))
        {StorageTypePrice=(memory/500)*100;}else{StorageTypePrice=(memory/500)*50;}

        if(screenType.equals("4K")){ScreenResprice=200;}else{ScreenResprice=100;}


        price= ScrSzPrice+cpuPrice+ ramPrice +StorageTypePrice+ScreenResprice;

        System.out.println("Laptop price is: $"+price);








    }
}
