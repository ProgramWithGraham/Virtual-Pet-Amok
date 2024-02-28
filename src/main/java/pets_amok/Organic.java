package pets_amok;

public abstract class Organic extends VirtualPet {
    private int hungerLevel;
    private int thirstLevel;

    public Organic(String petName, String petDescription, int hungerLevel, int thirstLevel) {
        super(petName, petDescription,petHealth );
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;

    }

    public int getHungerLevel() {
        return this.hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getThirstLevel() {
        return this.thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int giveFood() {
        this.hungerLevel += 10;
        return this.hungerLevel;
    }

    public int giveWater() {
        this.thirstLevel += 10;
        return this.thirstLevel;
    }

    
    @Override
    public void tick() {
        this.hungerLevel -= 2;
        this.thirstLevel -= 2;
        // this.BoredomLevel -= 2;
        if (hungerLevel - thirstLevel >= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }

        }
    }
}
