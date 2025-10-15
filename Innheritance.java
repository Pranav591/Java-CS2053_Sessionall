// Base class
class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }
    void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}
// Derived class
class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); // Call Vehicle constructor
        this.model = model;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call Vehicle's displayInfo
        System.out.println("Model: " + model);
    }
}
// Further derived class
class ElectricCar extends Car {
    int battery;

    ElectricCar(String brand, String model, int battery) {
        super(brand, model); // Call Car constructor
        this.battery = battery;
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // Call Car's displayInfo
        System.out.println("Battery: " + battery + " kWh");
    }
}
public class Innheritance {  
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar("Tesla", "Model 3", 75);
        myCar.displayInfo();
    }
}
