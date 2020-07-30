package practice6_10;

public class SalaryCalculator {
    public static void main(String[] args) {
        int rate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        int weeklyHours = 40;
        int totalsalary = rate*weeklyHours*48;
        double stateTax = totalsalary*stateTaxRate;
        double federalTax = totalsalary*federalTaxRate;




        System.out.println("your salary is: " + totalsalary + " USD");
        System.out.println("your total tax is: " + (stateTax+federalTax) +" USD");
        System.out.println( "your income after tax is: " + (totalsalary - (stateTax+federalTax)) + " USD");

    }
}
