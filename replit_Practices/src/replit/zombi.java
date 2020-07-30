package replit;

public class zombi {
    public static void main(String[] args) {
        int count=0;
        int i=100;

        while (i>0){

            System.out.println("Day"+(count=count+1) +"["+i+"]");
            i=i/2;
        }
    }
}
