package classAndObjectInJava;

public class EmployeeMain {
    public static void main(String[] args) {
        // create a object first
        EmployeeClass emp1 = new EmployeeClass();
        emp1.e_id = 100;
        emp1.e_name = "rohit";
        emp1.e_position = "sweper";
        emp1.e_salary = 5000;

        emp1.display();
        
        EmployeeClass emp2 = new EmployeeClass();
        emp2.e_id = 101;
        emp2.e_name = "jagasia";
        emp2.e_position = "technician";
        emp2.e_salary = 15000;

        emp2.display();
    }
}
