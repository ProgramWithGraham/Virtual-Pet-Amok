package pets_amok;

public class OrganicCats extends Organic implements Cats {

    int wasteInLitterBox = 15;
    int litterBoxCleanliness = 85;

    public OrganicCats(String petName, String petDescription, int petHealth) {
        super(petName, petDescription, 0);

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

    
    public void litterBoxCleanliness() {
        wasteInLitterBox -= 5;
        litterBoxCleanliness += 5;

    }

    public void wasteInLitterBox() {
        wasteInLitterBox += 5;
        litterBoxCleanliness -= 5;
    }

}
