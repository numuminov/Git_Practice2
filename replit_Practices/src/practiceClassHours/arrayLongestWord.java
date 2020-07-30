package practiceClassHours;

public class arrayLongestWord {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nicolas", "Amir", "Nurjannet"};
        /*
        int longest= arr[0].length();

        for(String each: arr){
            if(each.length()>longest){longest=each.length();}
        }

        for(String each: arr){
            if(each.length()==longest){
                System.out.println(each);
            }
        }

         */

        int longest= arr[0].length();
        for(String each: arr){
            if(each.length()>longest){
                longest=each.length();

            }

        }
        System.out.println(longest);

        for(String each: arr){
            if(each.length()==longest){
                System.out.println(each);
            }
        }
    }
}
