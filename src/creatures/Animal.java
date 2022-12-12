package creatures;

import Other.Sellable;

public abstract class Animal implements Sellable, Feedable {
    final String species;
    private Double weight;
    boolean isAlive;

    final Double DEFAULT_FOODWEIGHT = 1.0;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
        isAlive = true;
    }
    public void feed() {
        feed(DEFAULT_FOODWEIGHT);
    }

    @Override
    public void feed(Double foodWeight) {
        if(isAlive) {
            weight+=foodWeight;
            System.out.println("Thanks for food.");
        }
        else {
            System.out.println("Good job that you remember about it but it is a little bit too late.");
        }
    }

    public void takeForWalk() {
        if(weight > 2) {
            weight-=2;
            System.out.println("Nice walk, thanks.");
        } else if (weight >0 && weight <= 2) {
            weight-=2;
            System.out.println("First feed me than take me for walk. I'm logging out from this world.");
            if(weight < 0) {
                weight = 0.0;
            }
            isAlive=false;
        } else  {
            System.out.println("You are crazy, I'm already dead!");
        }
    }
    public String toString() {
        return species+" weight "+weight+". Alive: "+isAlive;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.pet != this) {
            System.out.println("You can't sell animal that you not own.");
        }
        else if(buyer.getCash() < price) {
            System.out.println("You don't have enough money to complete this transaction!");

        }
        else if(seller.equals(buyer)) {
            System.out.println("This transaction must be beetwen 2 diffrent persons.");
        }
        else {
            System.out.println("Transaction started...");
            buyer.addCash(-price);
            System.out.println("Transfering money...");
            seller.addCash(price);
            buyer.pet = this;
            seller.pet = null;
            System.out.println("Transaction completed.");
        }
    }
}
