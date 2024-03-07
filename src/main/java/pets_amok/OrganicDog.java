package pets_amok;

public class OrganicDog extends Organic implements Dog {
    private int wasteInCage;
    private int cageCleanliness;

    public OrganicDog(String petName, String petDescription) {
        super(petName, petDescription);
        this.wasteInCage = 15;
        this.cageCleanliness = 80;
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

    public void goForWalk() {
        this.wasteInCage -= 10;
        setHappinessLevel(getHappinessLevel() + 5);
        setBoredomLevel(getBoredomLevel() - 5);
        setPetHealth(getPetHealth() + 5);
    }

    public void cleanCage() {
        setCageCleanliness(100);
        setHappinessLevel(getHappinessLevel() + 5);
        setPetHealth(getPetHealth() + 5);
    }

    public void soilCage() {
        this.wasteInCage += 5;
        this.cageCleanliness -= 5;
    }

    @Override
    public void tick() {
        super.tick();
        this.hungerLevel -= 2;
        this.thirstLevel -= 2;
        soilCage();
        if (this.cageCleanliness - this.wasteInCage <= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }

        if (this.hungerLevel <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }

        if (this.thirstLevel <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }
}
