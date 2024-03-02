package pets_amok;

public abstract class Organic extends VirtualPet {
    protected int hungerLevel;
    protected int thirstLevel;

    public Organic(String petName, String petDescription, int happinessLevel,
            int petHealth, int boredomLevel, int hungerLevel, int thirstLevel) {
        super(petName, petDescription);
        this.hungerLevel = 40;
        this.thirstLevel = 40;

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
        setBoredomLevel(getBoredomLevel() + 5);
        setHappinessLevel(getHappinessLevel() + 5);
        return this.hungerLevel;
    }

    public int giveWater() {
        this.thirstLevel += 10;
        setBoredomLevel(getBoredomLevel() + 5);
        setHappinessLevel(getHappinessLevel() + 5);
        return this.thirstLevel;
    }

}
