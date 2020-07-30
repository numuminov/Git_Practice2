package replit;

public class merge {
    public static String mergeStrings(String one, String two) {
        String merged ="";
        String longerstring="";
        int shorterstringlength=0;

        if(one.length()>two.length()){
            longerstring=one;
            shorterstringlength=two.length();
        }else{longerstring=two;
        shorterstringlength=one.length();}

        for(int i=0;i<shorterstringlength;i++){
            merged+=""+one.charAt(i)+two.charAt(i);

        }
        merged+=longerstring.substring(shorterstringlength);


    return merged;
}


    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE


        for(int a: nums){

            int count=0;
            for(int b:nums){

                if(a==b){count++;}
            }
            if(count==1){
                System.out.println(a);
            }
        }


    }

    public static void main(String[] args) {
        String m=mergeStrings("12345","two");
        System.out.println(m);

        String [] arr={"ghyt","ghytreww","gtfrewq","iuy","ghy"};
        int []arr1={2,3,4,5,6,5,4,3,2,1,7};
        printUniqueNumbers(arr1);
    }




}

