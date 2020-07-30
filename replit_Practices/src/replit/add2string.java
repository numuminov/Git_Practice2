package replit;

public class add2string {
    public static void main(String[] args) {
        String a="qanday";
        String b="shunday";
        String c=at3(a,b);
        System.out.println(c);

    }

    public static String at3(String target,String word)

    {String result=target.substring(0,3)+word+target.substring(3);

        return result;
    }
}
