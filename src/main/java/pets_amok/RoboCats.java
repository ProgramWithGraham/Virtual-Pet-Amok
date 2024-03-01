package pets_amok;

public class RoboCats extends Robo implements Cats {

    public RoboCats(String petName, String petDescription, int petHealth) {
super(petName, petDescription, petHealth, petHealth, petHealth);
    }

    @Override
    public void happiness() {
    }

    @Override
    public void showPetStatus() {
    }

}
