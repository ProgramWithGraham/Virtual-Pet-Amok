package pets_amok;

public class OrganicCats extends VirtualPet implements Cat {

    int wasteInLitterBox = 15;
    int litterBoxCleanliness = 85;

    public OrganicCats(String petName, String petDescription, int petHealth) {
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
   
    @Override
    public void litterBoxCleanliness() {
        litterBoxCleanliness += 5;

    }

    @Override
    public void wasteInLitterBox() {
        wasteInLitterBox += 5;
        litterBoxCleanliness -= 5;
    }

}
