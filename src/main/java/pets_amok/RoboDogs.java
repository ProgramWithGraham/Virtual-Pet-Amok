package pets_amok;

public class RoboDogs extends Robo implements Dogs {

    public RoboDogs(String petName, String petDescription, int happinessLevel,
            int petHealth, int boredomLevel, int maintenance, int oilLevel) {
        super(petName, petDescription, happinessLevel, petHealth, boredomLevel, maintenance, oilLevel);

    }

    public void goForWalk() {
        setHappinessLevel(getHappinessLevel() + 5);
    }

    @Override
    public void cageCleanliness() {
        System.out.println("Silly goose, RoboDogs don't use the bathroom");
    }

    @Override
    public void happiness() {
    }

    @Override
    public void showPetStatus() {
    }
}