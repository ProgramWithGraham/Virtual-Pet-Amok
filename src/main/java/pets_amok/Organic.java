package pets_amok;

public class Organic extends VirtualPet implements OrganicDogs, OrganicCats {

    int wasteInLitterBox = 15;
    int litterBoxCleanliness = 85;
    int wasteInCage = 15;
    int cageCleanliness = 85;

    public Organic(String petName, String petDescription) {
        super(petName, petDescription);

    }

    @Override
    public void litterBoxCleanliness() {
    }

    @Override
    public void wasteInLitterBox() {
    }

    @Override
    public void cageCleanliness() {
    }

    @Override
    public void wasteInCage() {
    }

    @Override
    public int happiness() {
        return 80;
    }

}
