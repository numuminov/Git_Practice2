package datatime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates {
    public static void main(String[] args) {
        LocalDate i=LocalDate.of(2020,7,26);
        System.out.println(i);
        LocalDate Now =LocalDate.now();
        System.out.println(Now);
        boolean h= Now.isLeapYear();
        System.out.println(h);
        LocalDate myBirthday =LocalDate.of(1977,12,30);

        System.out.println(myBirthday);
        DateTimeFormatter m= DateTimeFormatter.ofPattern("EEE yy.MMM.dd");
        System.out.println(myBirthday.format(m));

    }
}
