public class Car {
    public final String producer;
    public final String model;
    public Integer yearOfProduction;
    public Double value;
    public String color;
    public Double power;

    public Car(String producer, String model, Integer yearOfProduction, Double value)
    {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    public Object clone() {
        Car aclone = new Car(this.producer, this.model, this.yearOfProduction, this.value);
        return aclone;
    }
}
