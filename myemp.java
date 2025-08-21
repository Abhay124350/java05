

public class myemp {
    static {
        System.out.println("i am in static block");
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(10, 1000, "abhay");
        emp1.display();

    }
}
