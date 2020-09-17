package replit;

public class TvObject {
    public static void main(String[] args) {
        TV tv= new TV();

       int r= tv.volumeLevel;
        System.out.println(r);
        tv.channelDown();
        boolean onn=tv.isOn();
        System.out.println(onn);
        tv.turnOn();
        tv.turnOn();

        tv.volumeDown();
        tv.volumeDown();
        tv.volumeDown();
        TV tv2= new TV("Sony");
        tv2.setChannel(0);
        tv2.getChannel();
    }
}
