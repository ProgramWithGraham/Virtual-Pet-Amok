package pets_amok;

public class Organic extends VirtualPet implements OrganicDogs, OrganicCats {

    int wasteInLitterBox = 15;
    int litterBoxCleanliness = 85;
    int wasteInCage = 15;
    int cageCleanliness = 85;

    public Organic(String petName, String petDescription, int petHealth) {
        super(petName, petDescription, petHealth);

    }

    public int getWasteInLitterBox() {
        return this.wasteInLitterBox;
    }

    public void setWasteInLitterBox(int wasteInLitterBox) {
        this.wasteInLitterBox = wasteInLitterBox;
    }

    public int getLitterBoxCleanliness() {
        return this.litterBoxCleanliness;
    }

    public void setLitterBoxCleanliness(int litterBoxCleanliness) {
        this.litterBoxCleanliness = litterBoxCleanliness;
    }

    public int getWasteInCage() {
        return this.wasteInCage;
    }

    public void setWasteInCage(int wasteInCage) {
        this.wasteInCage = wasteInCage;
    }

    public int getCageCleanliness() {
        return this.cageCleanliness;
    }

    public void setCageCleanliness(int cageCleanliness) {
        this.cageCleanliness = cageCleanliness;
    }

    @Override
    public void litterBoxCleanliness() {
        litterBoxCleanliness += 5;

    }

    @Override
    public void wasteInLitterBox() {
        wasteInLitterBox += 5;
        litterBoxCleanliness -= 5;
    }

    @Override
    public void cageCleanliness() {
        cageCleanliness += 5;
    }

    @Override
    public void wasteInCage() {
        wasteInCage += 5;
        cageCleanliness -= 5;
    }

    @Override
    public void happiness() {
    }

}
