package practice6_10;

public class replit6_21 {
    public static void main(String[] args) {
        double version = 1.5;
        String  CodName= "";
        if (version>=1.5 && version<=9.0){if (version<=1.6){CodName="Cupcake";}else if(version<=2.1){CodName="Eclair";}
        else if(version<=2.2){CodName="Froyo";}else if(version<=2.3){CodName="Gingerbred";}else if(version<=3.1){CodName="Honeycomb";}
        else if(version<=4.0){CodName= "Ice Cream Sandwich";}else if(version>=4.1&&version<=4.3){CodName= "Jelly Bean";}
    else if(version>=4.4&&version<=4.4){CodName ="KitKat";}else if(version>=5.0&&version<=5.1){CodName= "Lollipop";}
    else if(version>=8.0&&version<=8.1){CodName= "Oreo";}else{CodName="Pie";}    }

        else{CodName = "Sorry, I don't know this version!";}
        System.out.println(CodName);

        int num1= 5;
        int num2= 6;
        int r =(num1>num2)? num1: num2;
        System.out.println(r);

    }
}
