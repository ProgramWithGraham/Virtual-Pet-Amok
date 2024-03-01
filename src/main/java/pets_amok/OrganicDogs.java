package pets_amok;

public class OrganicDogs extends Organic implements Dogs {

    private int wasteInCage;
    private int cageCleanliness;

    public OrganicDogs(String petName, String petDescription, int hungerLevel, int thirstLevel, int happinessLevel,
            int petHealth, int boredomLevel, int wasteInCage, int cageCleanliness) {
        super(petName, petDescription, happinessLevel, petHealth, boredomLevel, hungerLevel, thirstLevel);
        this.wasteInCage = 25;
        this.cageCleanliness = 85;
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

    public int goForWalk() {
        this.wasteInCage -= 5;
        setHappinessLevel(getHappinessLevel() + 5);
        return this.wasteInCage;
    }

    @Override
    public void cageCleanliness() {
        wasteInCage -= 5;
        cageCleanliness += 5;

    }

    public void wasteInCage() {
        wasteInCage += 5;
        cageCleanliness -= 5;
    }

    @Override
    public void happiness() {
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
        this.wasteInCage += 2;
        this.cageCleanliness -= 2;
        if (cageCleanliness - wasteInCage <= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }

}
