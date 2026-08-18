package Encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        // create a obj of class to run code
        Account credentials = new Account();
        credentials.setAccno(5000); // this is how we set a value to a private varible via method
        int amt = credentials.getAccno();
        System.out.println(amt);
    }
}
