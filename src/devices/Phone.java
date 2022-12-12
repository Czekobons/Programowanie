package devices;

import creatures.Human;

public class Phone extends Device{

    public double screenSize;
    public Integer storage;
    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);

    }
    public void turnOn() {
        System.out.println("I'm pushing the button.");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Phone is turned on.");
        isOn = true;
    }
    public String toString() {
        return producer+" "+model+", "+yearOfProduction;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
