package practice.Arrays;

public class assignmentUniqW {
    public static void main(String[] args) {
        String[] words ={"c#","c#","Java","Pyton","Piton","C++"};

        for(int j=0; j<=words.length-1;j++){

            String b =words[j];
            int count = 0;
            for(int i=0;i<=words.length-1;i++) {
                String a = words[i];
                if (b.equals(a)) {
                    count++;
                }}


                if (count ==1){
                    System.out.println(b);}
            }

        }










    }


