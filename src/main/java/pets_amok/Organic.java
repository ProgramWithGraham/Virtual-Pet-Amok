package pets_amok;

public abstract class Organic extends VirtualPet {
    protected int hungerLevel;
    protected int thirstLevel;

    public Organic(String petName, String petDescription) {
        super(petName, petDescription);
        this.hungerLevel = 50;
        this.thirstLevel = 50;
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
        this.boredomLevel += 5;
        this.happinessLevel += 5;
        this.petHealth += 5;
        return this.hungerLevel;
    }

    public int giveWater() {
        this.thirstLevel += 10;
        this.boredomLevel += 5;
        this.happinessLevel += 5;
        this.petHealth += 5;
        return this.thirstLevel;
    }

    public void tick() {
        super.tick();
        this.hungerLevel -= 2;
        this.thirstLevel -= 2;
        if (this.hungerLevel <= 70) {
            this.petHealth -= 25;
            if (getPetHealth() < 65) {
                this.happinessLevel -= 10;
            }
        }

        if (this.thirstLevel <= 30) {
            this.petHealth -= 25;
            if (getPetHealth() < 65) {
                this.happinessLevel -= 10;
            }
        }
    }
}
