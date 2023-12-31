package oop;

public class Vehicle {
    private int numberOfWheels;
    private String color;

    public Vehicle(){
        this("black", 3);
    }
    
    public Vehicle(String color){
        this.color = color;
    }

    public Vehicle(String color, int numberOfWheels){
        this.color = color;
        this.numberOfWheels = numberOfWheels;
    }

    // getter
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    // setter
    public void setNumberOfWheels(int number) {
        numberOfWheels = number;
    }
    // getter
    public String getColor() {
        return color;
    }
    // setter
    public void setColor(String color) {
        this.color = color;        // 1
    }
}
