package pets_amok;

public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int petHealth;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int happinessLevel;

    public VirtualPet(String petName, String petDescription, int petHealth, int happinessLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = 85;
        this.boredomLevel = 75;
        this.happinessLevel = 85;
    }

    public VirtualPet(String petName, String petDescription, int petHealth, int happinessLevel, int hungerLevel,
            int thirstLevel,
            int boredomLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = petHealth;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
        this.happinessLevel = happinessLevel;
    }

    public void printUserInstructions() {
        System.out.println(" ");
        System.out.println("Please enter a number input from the following options:");
        System.out.println(" 1. Give your pets some Food");
        System.out.println(" 2. Give your pets some Water");
        System.out.println(" 3. Play with your a selected virtual pet");
        System.out.println(" 4. Adopt a pet");
        System.out.println(" 5. Admit a pet");
        System.out.println(" 6. End the program");
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetHealth() {
        return petHealth;
    }

    public void setPetHealth(int petHealth) {
        this.petHealth = petHealth;
    }

    public String getPetDescription() {
        return this.petDescription;
    }

    public void setPetDescription(String petDescription) {
        this.petDescription = petDescription;
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

    public int getBoredomLevel() {
        return this.boredomLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public int giveFood() {
        this.hungerLevel += 10;
        return this.hungerLevel;
    }

    public int giveWater() {
        this.thirstLevel += 10;
        return this.thirstLevel;
    }

    public int playFetch() {
        this.boredomLevel += 10;
        this.happinessLevel += 10;
        return this.boredomLevel + this.happinessLevel;

    }

    @Override
    public String toString() {
        String petDetails = this.petName + ", " + this.petDescription + " - stats are:  " + "Hunger: "
                + this.hungerLevel + "  Thirst: " + this.thirstLevel + "  Boredom: " + this.boredomLevel;
        return petDetails;
    }

    public abstract void happiness();

    public void tick() {
        this.hungerLevel -= 2;
        this.thirstLevel -= 2;
        this.boredomLevel -= 2;
        // increase this calling objects thirst, hunger, boredom
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

}
