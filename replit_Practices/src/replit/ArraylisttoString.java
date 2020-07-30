package replit;

import java.util.ArrayList;

public class ArraylisttoString {
    public static void main(String[] args) {
        String[] r1 ={"a","b"};
        String[] r2 ={"a","b"};

        ArrayList<String> combined = new ArrayList<>();
        String result= "";
        for (String each : r1) {
            combined.add(each);}

        for (String each : r2) {
            combined.add(each);}
        for(int i=0;i<=combined.size()-1;i++){
            result+=combined.get(i);
        }


        System.out.println(result);
    }
}