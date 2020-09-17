package day47_Encapsulation;

/*
                    name
					age
					gender
					date of birth
					private ssn
					private ID
					private address
 */

import java.time.LocalDate;

public class Person_Shortcut {

    public String name;
    public int age;
    public char gender;
    public LocalDate DOB;
    private int ID;
    private long ssn;
    private String address;

    public Person_Shortcut(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }
    /*

    public Person_Shortcut(String name, int age, char gender, LocalDate DOB) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.DOB = DOB;
    }

     */

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public long getSsn() {
        return ssn;
    }

    public String getAddress() {
        return address;
    }



}