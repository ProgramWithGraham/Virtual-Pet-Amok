package pets_amok;

public class RoboDog extends Robo implements Dog {

    public RoboDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public void goForWalk() {
        setHappinessLevel(getHappinessLevel() + 5);
        setBoredomLevel(getBoredomLevel() - 5);
        setPetHealth(getPetHealth() + 5);
    }

    @Override
    public void cageCleanliness() {
        System.out.println("Silly goose, RoboDogs don't use the bathroom");
    }

}