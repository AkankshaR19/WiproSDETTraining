package day3;

class Car {
    private boolean engineOn;
    private int speed;
    private int fuelLevel;
    public void startEngine() {
        engineOn = true;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setFuelLevel(int fuel) {
        fuelLevel = fuel;
    }
    public void display() {
        System.out.println("Engine Status: " + engineOn);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuelLevel);
    }
}
public class Car1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.setSpeed(60);
        car.setFuelLevel(80);
        car.display();
    }
}