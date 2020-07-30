package Scan_classes;
import java.util.Scanner;


public class Birthday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tugilgan yilingizni kiritig");
        int yil = input.nextInt();

        int yosh = 2020-yil ;
        String result ="";
        if(yosh==10) result = "10 yoshga kirganiz bilan tabriklaymiz Rahimahon";
        else if(yosh==43) result="Dadangiz 43 ga kirganlar shekilli" ;
        else if(yosh==13) result ="Bu Vasilahon";
        else if(yosh==2) result="Salom Safiyahon"; else result="Bunaqa odamni tanimaymiz";

        System.out.println(result);







    }


}
