package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class zombi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.



    for (int i = 0; i <= inhabitants.length - 2; i++) {
        if (inhabitants[i] == 0) {
            inhabitants[i + 1] = inhabitants[i + 1] / 2;
        }
    }
    for (int i = inhabitants.length - 1; i >= 1; i--) {
        if (inhabitants[i] == 0) {
            inhabitants[i - 1] = inhabitants[i - 1] / 2;
        }
    }
    System.out.println(Arrays.toString(inhabitants));


}

            }











