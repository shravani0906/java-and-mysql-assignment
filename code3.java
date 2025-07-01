

class Employee {
    int id;
    String name;
    int salary;

    Employee(int i, String n, int s) {
        id = i;
        name = n;
        salary = s;
    }

    void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class code3 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit", 25000);
        Employee e2 = new Employee(2, "Neha", 30000);
        e1.show();
        e2.show();
    }
}
