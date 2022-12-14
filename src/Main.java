import creatures.Animal;
import creatures.Human;
import creatures.Pet;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Pet("Terrier", 5.0);
        dog.feed();
        for(int i=0;i<4;i++) {
            dog.takeForWalk();
        }
        dog.feed();
        dog.takeForWalk();
        Car tesla = new Car("Tesla", "Model 3", 2018, 10000.0);
        Car tesla2 = new Car("Tesla", "Model 3", 2018, 10000.0);
        Human me = new Human("Patryk", "Nowak", 1980, 1100.0);
        Human he = new Human("Adam", "Malysz", 1970, 2000.0);
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
        onePlus.turnOn();
        me.getCar().turnOn();
        he.pet = dog;
        me.cash = 1000.0;
        dog.sell(he, me, 200.0);
        dog.sell(he, me, 200.0);
        onePlus.installAnApp("https://unsplash.com/photos/aqM730y624E/download?force=true");

    }
}