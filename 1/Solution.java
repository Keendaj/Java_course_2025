class Vehicle {
    protected String brand = "Unknown";
    protected int maxSpeed;
    
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Vehicle constructor called");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Max Speed: " + maxSpeed + " km/h");
    }
    
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(int maxSpeed, int doors) {
        super(maxSpeed);
        this.doors = doors;
        this.brand = "Toyota";
    }
    
    public void showCarDetails() {
        System.out.println("Car brand from superclass: " + super.brand);
        System.out.println("Number of doors: " + this.doors);
        
        super.displayInfo();
        displayInfo();
    }

    @Override
    public void displayInfo() {
        System.out.println("Overrided");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Car specific engine procedures completed");
    }
}

/**
 * Старт моего проекта
 * @author Dmitriy Shevtsov
 * @version 1.0
 * @since 2025
 */
public class Solution {

    /**
     * @param args
     * @return void
     * @see Показывает примеры работы с super. 
     */
    public static void main(String[] args) {
        Car car = new Car(200, 4);
        car.showCarDetails();
        System.out.println("---");
        car.startEngine();
    }
}