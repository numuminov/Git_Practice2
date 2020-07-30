package replit;
import java.util.*;

public class diving {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float[] score = new float[7];
            //WRITE YOUR CODE HERE
            for(int i=0;i<7;i++){
                System.out.println("Enter score for judge"+(i+1));
                score[i]=input.nextFloat();
            }
            System.out.println("Enter difficulty:");
            float diff=input.nextFloat();
            double total=0;
            double determine=0.6;
            float max=score[0];
            float min=score[0];
            float sum =0;
            for(float each:score){
                if(each>max){
                    max=each;
                }
                if(each<min){min=each;}
            }

            for(float each:score){
                if(each==max||each==min){continue;}
                sum+=each;
            }

            System.out.println(min+""+max+""+sum);

            total=sum*diff*determine;









            // FINAL OUTPUT
            System.out.printf("Total: %.2f", total);
        }
    }