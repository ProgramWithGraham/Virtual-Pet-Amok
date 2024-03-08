package pets_amok;

public class OrganicDog extends Organic implements Dog {
    protected int wasteInCage;
    protected int cageCleanliness;

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
        this.petHealth += 5;
        this.happinessLevel += 5;
        this.boredomLevel -= 5;
        this.wasteInCage -= 10;
    }

    public void cleanCage() { // Cleans Cages, resetting Waste and CageCleanliness
        this.petHealth += 5;
        this.happinessLevel += 5;
        this.wasteInCage = -5; // set at -5 so that when tick hits, level will start at 0
        this.cageCleanliness = 105; // set to 105 so that when tick hits, this will start at 100
    }

    public void soilCage() { // variables hit when Tick is hit
        this.wasteInCage += 5;
        this.cageCleanliness -= 5;
    }

    @Override
    public void tick() {
        super.tick();
        soilCage();
        if (this.cageCleanliness - this.wasteInCage <= 15) {
            this.petHealth -= 25;
        }
    }
}
