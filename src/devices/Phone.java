package devices;

public class Phone {
    public final String producer;
    public final String model;
    public final Integer yearOfProduction;
    public double screenSize;
    public Integer storage;

    public Phone(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction =yearOfProduction;

    }
    public String toString() {
        return producer+" "+model+", "+yearOfProduction;
    }
}
