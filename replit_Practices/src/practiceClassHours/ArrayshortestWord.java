package practiceClassHours;

public class ArrayshortestWord {
    public static void main(String[] args) {


        String[] arr = {"Anam", "Nicolas", "Amir", "Nurjannet"};
/*
        int shortest=arr[0].length();
        for(String each: arr){
            if(each.length()<shortest){shortest=each.length();
            }


        }System.out.println(shortest);

for(String each: arr){
    if(each.length()==shortest){
        System.out.println(each);
    }
}

 */
        /*
        int shortest= arr[0].length();

        for(String each: arr){
            if(each.length()<shortest){shortest=each.length();}
        }
        System.out.println(shortest);

        for(String each: arr){
            if(each.length()==shortest){
                System.out.println(each);
            }

        }

         */

        int shortest =arr[0].length();
        for(String each: arr){
            if(each.length()<shortest){shortest=each.length();}


        }
        for(String each: arr){if(each.length()==shortest){System.out.print(each);


        }}






    }
}