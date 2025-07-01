

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car has started");
    }
}

class Audi extends Car {
    void drive() {
        System.out.println("Audi is driving smoothly");
    }
}

 class multiin {
    public static void main(String[] args) {
        Audi myAudi = new Audi();
        myAudi.move();
        myAudi.start();
        myAudi.drive();
    }
}
