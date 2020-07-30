package replit;

public class wordcount {
    public static void main(String[] args) {
        String d= "fgrthyusbfbbhfgfghhhhhhh";
        String res="";
        for(int i=0;i<=d.length()-1;i++){
            String c=""+d.charAt(i);
            if(!res.contains(c)){res+=c;}


        }System.out.println(res);

        uniqueChars(d);
        System.out.println(d);

    }




                public static int wordCount(String words) {
                    int count = 1;
                    for (int i = 0; i <= words.length() - 1; i++) {
                        char ch = words.charAt(i);
                        if (ch == ' ') {
                            count++;
                        }

                    }


                    return count;

                }

    public static String uniqueChars(String str) {
        //TODO: write your below


        String res="";
        for(int i=0;i<=str.length()-1;i++){
            String c=""+str.charAt(i);
            if(!res.contains(c)){res+=c;}


        }



        return res;










}}


