package main;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Car> transport = new DynamicArray<>();
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Car());

        for (int i = 0; i < 4; i++) {
            ((Car)transport.get(i)).drive();
        }
    }
}

class Car {

    void drive() {
        System.out.println("Driving car");
    }
}

class Plane {

    void plane() {
        System.out.println("Flying in the plane");
    }
}
