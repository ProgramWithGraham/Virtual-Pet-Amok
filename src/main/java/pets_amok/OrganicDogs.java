package pets_amok;

public class OrganicDogs extends VirtualPet implements Dog {
    public OrganicDogs(String petName, String petDescription, int petHealth) {
        super(petName, petDescription, petHealth);

    int wasteInCage = 15;
    int cageCleanliness = 85;

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
