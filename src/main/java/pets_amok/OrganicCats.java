package pets_amok;

public class OrganicCats extends Organic implements Cats {

    private int wasteInLitterBox;
    private int litterBoxCleanliness;

    public OrganicCats(String petName, String petDescription, int hungerLevel, int thirstLevel, int happinessLevel,
            int petHealth, int boredomLevel, int wasteInLitterBox, int litterBoxCleanliness) {
        super(petName, petDescription, happinessLevel, petHealth, boredomLevel, hungerLevel, thirstLevel);
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
        this.wasteInLitterBox += 2;
        this.litterBoxCleanliness -= 2;
        if (litterBoxCleanliness - wasteInLitterBox <= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }
}
