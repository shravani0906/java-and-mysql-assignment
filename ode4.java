

class Calculator {
    void add(int a, int b) {
        System.out.println("Add: " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtract: " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiply: " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Divide: " + (a / b));
    }
}

public class code4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 5);
        c.sub(10, 5);
        c.mul(10, 5);
        c.div(10, 5);
    }
}
