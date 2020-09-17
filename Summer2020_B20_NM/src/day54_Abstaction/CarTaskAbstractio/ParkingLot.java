package day54_Abstaction.CarTaskAbstractio;

public class ParkingLot {
    public static void main(String[] args) {
        BMW bmw1 = new BMW();
        bmw1.start();

        Tesla tesla1 =new Tesla();
        tesla1.start();

        Toyota toyota1= new Toyota();
        toyota1.start();

        Jeep jeep1=new Jeep();
        jeep1.start();

    }
}
