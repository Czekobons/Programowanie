package devices;

import creatures.Human;

public class Car extends Device{
    public Double value;
    public String color;
    public Double power;

    public Car(String producer, String model, Integer yearOfProduction, Double value)
    {
        super(producer, model, yearOfProduction);
        this.value = value;
    }
    public Object clone() {
        Car aclone = new Car(this.producer, this.model, this.yearOfProduction, this.value);
        return aclone;
    }
    public void turnOn() {
        System.out.println("I turn the key.");
        System.out.println("Enigine is running now.");
        isOn = true;
    }
    public String toString() {
        return producer+" "+model+", Produced in: "+yearOfProduction+" cost "+value;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
