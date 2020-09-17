package day47_Encapsulation;

public class CapitalOne {
    public String employeeName;
    public int employeeAge;
    public String jobTitle;

    private String ID;
    private double salary;
    private String address;

    public static String companyName;

    static {companyName="CapitalOne";}

    public CapitalOne(String employeeName,int employeeAge, String jobTitle){
        this.employeeName=employeeName;
        this.employeeAge=employeeAge;
        this.jobTitle=jobTitle;

    }
    public void setID(String ID){
        this.ID=ID;

    }
    public void setSalary(double salary){
        this.salary=salary;

    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getID(){
        return ID;
    }
    public double getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }
    public String toString(){
        return  "Name: "+employeeName+" Age: "+employeeAge+" Job Title: "+
                jobTitle+" ID: "+getID()+" Salary: "+getSalary()+" adress: "+getAddress();
    }

}
