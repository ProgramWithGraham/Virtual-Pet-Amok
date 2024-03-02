package pets_amok;

public abstract class VirtualPet {
    private String petName;
    private String petDescription;
    private int petHealth;
    private int happinessLevel;
    private int boredomLevel;

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHealth = 80;
        this.happinessLevel = 75;
        this.boredomLevel = 40;

    }

    public void printUserInstructions() {
        System.out.println(" ");
        System.out.println("Please enter a number input from the following options:");
        System.out.println(" 1. Give your Organic pets some Food");
        System.out.println(" 2. Give your Organic pets some Water");
        System.out.println(" 3. Give your Robo pets some oil");
        System.out.println(" 4. Repair your Robo pets and increase Maintenance level");
        System.out.println(" 5. Play with your a selected virtual pet");
        System.out.println(" 6. Adopt a pet");
        System.out.println(" 7. Admit a pet");
        System.out.println(" 8. Clean dog crates");
        System.out.println(" 9. Clean cat litter boxes");
        System.out.println(" 10. Walk all Dogs, both Robo and Organic");
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

    public void playWithPet() {
        this.boredomLevel += 10;
        this.happinessLevel += 10;
        this.petHealth += 5;
    }


    public abstract void tick();

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

}
