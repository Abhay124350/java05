public class Employee{
    int emp_id;
    String emp_name;
    double emp_salary;
    static String emp_org = "tcs";

    public Employee(int emp_id, double emp_salary, String emp_name){
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
    }
    public void display(){
        System.out.println("Emp_id" + emp_id);
        System.out.println("Emp_name" + emp_name);
        System.out.println("Emp_salary" + emp_salary);

    }

}