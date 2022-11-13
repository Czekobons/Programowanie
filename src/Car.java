public class Car {
    public final String producer;
    public final String model;
    public Integer yearOfProduction;
    public String color;
    public Double power;

    public Car(String producer, String model, Integer yearOfProduction)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
}
