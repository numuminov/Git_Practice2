package replit;

public class methodCleanString {
    public static void main(String[] args) {
        String e="ghbhy6547lmk";
        e= extractNum(e);
        System.out.println(e);

    }

    public static String extractNum(String s) {
        String result="";
        for(int i=0;i<=s.length()-1;i++){


            if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')

            result+=""+s.charAt(i);
        }

        return result;
    }
}
