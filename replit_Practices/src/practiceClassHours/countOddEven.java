package practiceClassHours;

public class countOddEven {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9,10,11};
        /*

        int even =0;
        int odd =0;

        for (int each: num){

            if(each%2==0){even++;
        }else{odd++;}}
        System.out.println(even);
        System.out.println(odd);

         */
        int counteven=0;
        int countodd=0;
        for(int each : num){

            if(each%2!=0){countodd++;}else{counteven++;}
        }
        System.out.println("in array we have "+countodd+" odd numbers and "+ counteven+" even numbers");
    }
}
