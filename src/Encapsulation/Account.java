package Encapsulation;

public class Account {
    // here we will create a varibale with keyword Private because we have to
    // maintain encapsulation
    private int accno;

    // creating a method to set variable value
    void setAccno(int accno) {
        this.accno = accno; // here this refers to the class variable
    }

    // creating a method to get variable value
    int getAccno() {
        return accno;
    }

}
