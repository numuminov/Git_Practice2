package ScanWarmUp;


public class Vehicle {
    public static void main(String[] args) {

        System.out.println("Enter vehicle's year:");
        int vehicleYear=201;
        String result="";
        if(vehicleYear>2017&&vehicleYear<1995){if(vehicleYear>=2015){result="Your vehicle needs recalled";}else
        if(vehicleYear>=2004&&vehicleYear<=2006){result="Your vehicle needs recalled";}else
        if(vehicleYear>=2001&&vehicleYear<=2002){result="Your vehicle needs recalled";}else
        if(vehicleYear>=1995&&vehicleYear<=1998){result="Your vehicle needs recalled";}else
        {result="Your vehicle is fine, enjoy!";}







        }else{result="Your vehicle is fine, enjoy!";}
        System.out.println(result);


    }

}


