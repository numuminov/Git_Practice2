package day47_Encapsulation;

public class Warmup {
    /*
    WarmUp tasks:
    create costum class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
     */


    public String bankName="Bank of America";
    public String firstName;
    public String lastName;

    private String acccountHolder;
    private long  acccounNumber;
    private double balance;

    public String getAcccountHolder() {
        return acccountHolder;
    }

    public void setAcccountHolder(String acccountHolder) {
        this.acccountHolder = acccountHolder;
    }

    public long getAcccounNumber() {
        return acccounNumber;
    }

    public void setAcccounNumber(long acccounNumber) {
        this.acccounNumber = acccounNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Warmup(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }
    public double deposit(double a){
        return a+getBalance();
    }
    public double withdraw(double b){
        return getBalance()-b;
    }



}
