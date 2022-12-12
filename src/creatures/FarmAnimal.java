package creatures;

public class FarmAnimal extends Animal implements Edbile{
    public FarmAnimal(String species, Double weight) {
        super(species, weight);
    }

    @Override
    public Boolean beEaten() {

        return true;
    }
}
