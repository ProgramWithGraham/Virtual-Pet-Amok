package pets_amok;

public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int petHealth;
    private int boredomLevel;
    private int happinessLevel;

    public VirtualPet(String petName, String petDescription, int petHealth, int boredomLevel, int happinessLevel) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = 85;
        this.boredomLevel = 75;
        this.happinessLevel = 85;
    }

    // public VirtualPet(String petName, String petDescription, int petHealth, int boredomLevel, int happinessLevel) {
    //     this.petName = petName;
    //     this.petDescription = petDescription;
    //     this.petHealth = petHealth;
    //     this.boredomLevel = boredomLevel;
    //     this.happinessLevel = happinessLevel;
    // }

    public void printUserInstructions() {
        System.out.println(" ");
        System.out.println("Please enter a number input from the following options:");
        System.out.println(" 1. Give your Organic pets some Food");
        System.out.println(" 2. Give your Organic pets some Water");
        System.out.println(" 3. Give your Robo pets some oil");
        System.out.println(" 4. Give your Robo pets some Water");
        System.out.println(" 5. Play with your a selected virtual pet");
        System.out.println(" 6. Adopt a pet");
        System.out.println(" 7. Admit a pet");
        System.out.println(" 8. Clean dog crates");
        System.out.println(" 9. Clean cat litter boxes");
        System.out.println(" 0. End the program");
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

    public int getBoredomLevel() {
        return this.boredomLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public int playFetch() {
        this.boredomLevel += 10;
        this.happinessLevel += 10;
        return this.boredomLevel + this.happinessLevel;

    }

    @Override
    public String toString() {
        String petDetails = this.petName + ", " + this.petDescription + " - stats are:  " + "  Boredom: "
                + this.boredomLevel;
        return petDetails;
    }

    public abstract void happiness();

    public abstract void tick();

    // public void tick() {
    // this.boredomLevel -= 2;
    // // // increase this calling objects thirst, hunger, boredom
    // }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

}
