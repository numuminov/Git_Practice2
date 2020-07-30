package replit;

public class max {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8,};

        int max= nums[0];

        for (int i=0;i<=nums.length;i++){

            if(i>max)

                max=i;}

        System.out.println(max);
        int r=findMax(nums);
        System.out.println(r);

    }

    public static int findMax(int[] arr){
        int max=arr[0];
        for(int each: arr){

            if(each>max){
                max=each;
            }
        }


        return max;
    }
    public static double findMax(double[] arr){
        double max=arr[0];
        for(double each: arr){

            if(each>max){
                max=each;
            }
        }


        return max;
    }
}

