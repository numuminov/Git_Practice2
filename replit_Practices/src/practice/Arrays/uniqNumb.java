package practice.Arrays;

public class uniqNumb {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6,5,3,7,8,8,7,9};

        for(int j=0;j<=arr.length-1;j++) {
            int b = arr[j];


            int count = 0;

            for (int i = 0; i <= arr.length - 1; i++) {
                int a = arr[i];
                if (b == a) {
                    count++;
                }


            }
            if (count== 1) {
                System.out.println(b);
            }

        }
    }
}
