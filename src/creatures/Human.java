package creatures;

import devices.Car;
import devices.Device;

import java.util.Calendar;
import java.util.Date;

public class Human {
    public final String firstName;
    public final String lastName;
    public final int yearOfBirth;
    public Double weight;
    private Double salary;
    private Double lastSalary;
    public Double cash;
    public Animal pet;
    private Car car;

    public Device device;
    private Date salaryCheckDate;

    public Human(String firstName, String lastName, int yearOfBirth, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
        cash = 0.0;
    }
    public Double getSalaryInfo() {

        if(lastSalary == null) {
            lastSalary = salary;
        }
        if(salaryCheckDate == null) {
            System.out.println("Your salary wasn't checked.");
        }
        else {
            System.out.println("Your salary was last check " + salaryCheckDate+ " and it was worth "+lastSalary+".");
        }
        System.out.println("You earn now "+salary+" every month.");
        Calendar calendar = Calendar.getInstance();
        salaryCheckDate = calendar.getTime();
        return salary;
    }
    public void setSalary(Double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException();
        }
        lastSalary = salary;
        System.out.println("New data are sending to accounting system.");
        System.out.println("You need to take your annex to contract from Hania from HR as soon as possible.");
        System.out.println("Be aware that ZUS and US already know about your new salary, so please don't try to hide it.");
        this.salary = salary;
    }
    public Car getCar() {
        if(this.car != null) {
            return (Car) this.car.clone();
        }
        else {
            System.out.println("This object don't have a car");
            return null;
        }
    }
    public void setCar(Car car) {
        if(salary > car.value) {
            System.out.println("Congratulation, you bought car with cash.");
            this.car = (Car)car.clone();
        }
        else if(car.value/12 < salary) {
            System.out.println("You bought your car but you will have to pay your debt.");
            this.car = (Car)car.clone();
        }
        else {
            System.out.println("You have to sigin in to univeristy and find new job or get a rise if you want to buy this car.");
        }

    }
    public String toString() {
        return firstName+" "+lastName+", Year of Birth: "+yearOfBirth+", Salary: "+salary;
    }

    public Double getCash() {
        return cash;
    }
    public void addCash(Double cash) {
        cash += cash;
    }



}
