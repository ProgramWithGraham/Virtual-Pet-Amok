package pets_amok;

public class OrganicCats extends Organic implements Cats {

    private int wasteInLitterBox;
    private int litterBoxCleanliness;

    public OrganicCats(String petName, String petDescription, int petHealth) {
        super(petName);
        this.wasteInLitterBox = 15;
        this.litterBoxCleanliness = 85;
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

    @Override
    public void happiness() {
    }

    @Override
    public void tick() {
        this.wasteInLitterBox -= 2;
    }
}
