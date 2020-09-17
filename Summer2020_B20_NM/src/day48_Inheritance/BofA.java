package day48_Inheritance;

public class BofA {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Muhtar","Abduveli");
        obj.setAccountHolder(obj.firstName+" "+obj.lastName);
        obj.setAccountNumber(123123123);
        obj.setBalance(50);
        obj.availableBalance();
        obj.deposit(500);

        obj.availableBalance();
        obj.withdraw(700);

        obj.withdraw(0);

        obj.withdraw(300);

        obj.availableBalance();

        System.out.println(obj);
    }
}
