package replit;

public class html {
    public static void main(String[] args) {
        String html= "the whole time was raining";
        do{
            System.out.println(html.charAt(0));
            html=html.substring(5);
        }while (!html.isEmpty());

    }
}
