package pets_amok;

public class OrganicCats extends Organic implements Cats {

    private int wasteInLitterBox;
    private int litterBoxCleanliness;

    public OrganicCats(String petName, String petDescription, int hungerLevel, int thirstLevel, int happinessLevel,
            int petHealth, int boredomLevel, int wasteInLitterBox, int litterBoxCleanliness) {
        super(petName, petDescription, happinessLevel, petHealth, boredomLevel, hungerLevel, thirstLevel);
        this.wasteInLitterBox = 15;
        this.litterBoxCleanliness = 80;
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
        setHappinessLevel(getHappinessLevel() + 5);
        setPetHealth(getPetHealth() + 5);

    }

    public void wasteInLitterBox() {
        wasteInLitterBox += 5;
        litterBoxCleanliness -= 5;
        setHappinessLevel(getHappinessLevel() - 5);
        setPetHealth(getPetHealth() - 5);
    }

    @Override
    public void tick() {
        this.hungerLevel -= 2;
        this.thirstLevel -= 2;
        setBoredomLevel(getBoredomLevel() - 2);
        setHappinessLevel(getHappinessLevel() - 1);
        if (hungerLevel - thirstLevel >= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }

        }
        wasteInLitterBox();
        if (litterBoxCleanliness - wasteInLitterBox <= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }
}
