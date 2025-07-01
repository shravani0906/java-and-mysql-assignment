

class Vehicle {
    // Method 1: No parameter
    public void move() {
        System.out.println("Vehicle is moving");
    }

    // Method 2: One int parameter
    public void move(int speed) {
        System.out.println("Vehicle is moving at speed: " + speed + " km/h");
    }

    // Method 3: Two parameters (int and String)
    public void move(int speed, String direction) {
        System.out.println("Vehicle is moving at " + speed + " km/h towards " + direction);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        v.move();                        // Calls move()
        v.move(60);                      // Calls move(int speed)
        v.move(80, "north direction");   // Calls move(int speed, String direction)
    }
}
