import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Terrier", 5.0);
        dog.feed();
        for(int i=0;i<4;i++) {
            dog.takeForWalk();
        }
        dog.feed();
        dog.takeForWalk();
        Car tesla = new Car("Tesla", "Model 3", 2018, 10000.0);
        Car tesla2 = new Car("Tesla", "Model 3", 2018, 10000.0);
        Human me = new Human("Patryk", "Nowak", 1980, 1100.0);
        Phone onePlus = new Phone("One Plus", "7 Pro", 2018);
        me.getSalaryInfo();
        me.getSalaryInfo();
        me.setSalary(2000.0);
        me.setSalary(3000.0);
        me.getSalaryInfo();
        me.setCar(tesla);
        me.getCar();
        System.out.println(tesla.equals(tesla2));
        System.out.println(dog);
        System.out.println(tesla);
        System.out.println(tesla2);
        System.out.println(me);
        System.out.println(onePlus);
    }
}