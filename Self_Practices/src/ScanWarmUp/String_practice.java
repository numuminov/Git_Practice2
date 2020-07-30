package ScanWarmUp;

public class String_practice {
    public static void main(String[] args) {
        String word = "i am student";
        String word2= word.toUpperCase();


        char w1= word.charAt(5);
        System.out.println(w1);

        int w2 =word.length();
        System.out.println(w2);

        System.out.println(word.concat(" at school"));

        System.out.println(word.toUpperCase());
        System.out.println(word2.concat(word2.toLowerCase()));

        System.out.println(word.trim());


        String word3= word2.substring(0,1).toUpperCase();
        String w3remaining=word2.
                substring(1,word2.length()).toLowerCase();
        System.out.println(word3.concat(w3remaining));

        word2=word2.toLowerCase().replace
                ("student", "teacher");
        System.out.println(word2);



    }
}
