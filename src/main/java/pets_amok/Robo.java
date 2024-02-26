package pets_amok;

public class Robo extends VirtualPet implements RoboDogs, RoboCats {

    int oilLevel = 80;
    int maintenance = 90;

    public Robo(String petName, String petDescription) {
        super(petName, petDescription);
    }

    @Override
    public void oilLevel() {
    }

    @Override
    public void maintenance() {
    }

    @Override
    public int happiness() {
        return 85;
    }
}
