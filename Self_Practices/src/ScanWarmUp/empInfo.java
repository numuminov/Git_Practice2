package ScanWarmUp;
import java.util.Scanner;

public class empInfo {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        System.out.println("enter company name");
        String company = info.next();
        System.out.println("Enter first name");
        String firstname = info.next();
        System.out.println("Enter last name");
        String lstname = info.next();
        System.out.println("job title");
        String job =info.next();
        System.out.println("Salary");
        String salary = info.next();
        System.out.println(firstname+" "+lstname);
        System.out.println(company+ " "+ job);
        System.out.println("incom"+salary);


    }
}
