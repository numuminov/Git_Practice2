package day47_Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        CapitalOne obj= new CapitalOne("Mike",42,"QA");
        CapitalOne obj2=new CapitalOne("John",33,"SDET");

        obj.setID("123");
        obj.setAddress("Virginia");
        obj.setSalary(100000);

        System.out.println(obj.employeeName);
        System.out.println(obj.employeeAge);
        System.out.println(obj.jobTitle);
        System.out.println(obj.companyName);

        System.out.println(obj.getID());
        System.out.println(obj.getAddress());
        System.out.println(obj.getSalary());

        System.out.println(obj);

    }
}
