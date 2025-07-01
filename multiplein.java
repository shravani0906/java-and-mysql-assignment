

interface Engine {
    void startEngine();
}

interface MusicSystem {
    void playMusic();
}

// Class implementing multiple interfaces
class Car implements Engine, MusicSystem {
    public void startEngine() {
        System.out.println("Engine has started");
    }

    public void playMusic() {
        System.out.println("Playing music in the car");
    }

    void drive() {
        System.out.println("Car is driving");
    }
}

public class multiplein {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();  // from Engine interface
        myCar.playMusic();    // from MusicSystem interface
        myCar.drive();        // own method
    }
}
