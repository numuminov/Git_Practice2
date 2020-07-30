package practiceClassHours;

public class first3Letter {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nicolas", "Amir", "Nurjannet"};

        for (int i =0; i<=arr.length-1;i++){

            System.out.println(arr[i].substring(0,3));
        }
    }
}
