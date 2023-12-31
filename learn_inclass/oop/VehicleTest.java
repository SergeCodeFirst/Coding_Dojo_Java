package oop;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("red");
        Vehicle car = new Vehicle("green");
        Vehicle stroller = new Vehicle();

        stroller.setNumberOfWheels(4);
        stroller.setColor("black");
        int sWheels = stroller.getNumberOfWheels();
        String sColor = stroller.getColor();

        bike.setNumberOfWheels(2);
        // bike.setColor("red");
        int bikeWheels = bike.getNumberOfWheels();
        String bikeColor = bike.getColor();
        
        car.setNumberOfWheels(4);
        // car.setColor("green");
        int carWheels = car.getNumberOfWheels(); 
        String carColor = car.getColor();

        System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
        System.out.println("Stroller object - Wheels: " + sWheels + ", Color: " + sColor);
    }
}
