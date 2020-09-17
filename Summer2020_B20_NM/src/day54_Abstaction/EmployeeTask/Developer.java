package day54_Abstaction.EmployeeTask;

import java.time.LocalDate;

public class Developer extends Employee {
    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }
}
