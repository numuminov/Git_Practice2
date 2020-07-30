package practice6_10;

public class gradeOnScore {
    public static void main(String[] args) {
        int score = 96;

        if(score ==100 || score >= 90){
            System.out.println("Your grade is A");
        };
        if(score <90 && score>=80){
            System.out.println("your grade is B");};
        if (score >=70 && score <80) {
            System.out.println("your grade is C");
        };
        if (score >= 60 && score <70) {
            System.out.println("Your grade is D");
        };
        if (score <60) {
            System.out.println("your score is F");
        };

    }
}
