package pets_amok;

public abstract class Robo extends VirtualPet {
    protected int maintenance;
    protected int oilLevel;

    public Robo(String petName, String petDescription) {
        super(petName, petDescription);
        this.maintenance = 80;
        this.oilLevel = 80;
    }

    public int getOilLevel() {
        return this.oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }

    public int getMaintenance() {
        return this.maintenance;
    }

    public void setMaintenance(int maintenance) {
        this.maintenance = maintenance;
    }

    public int giveOil() {
        this.petHealth += 5;
        this.happinessLevel += 5;
        this.boredomLevel -= 5;
        this.oilLevel += 10;
        return this.oilLevel;
    }

    public int improveMaintenance() {
        this.petHealth += 5;
        this.happinessLevel += 5;
        this.boredomLevel -= 5;
        this.maintenance += 10;
        return this.maintenance;
    }

    @Override
    public void tick() {
        super.tick();
        this.oilLevel -= 2;
        this.maintenance -= 2;
        if (this.oilLevel <= 30) {
            this.petHealth -= 25;
            if (getPetHealth() < 65) {
                this.happinessLevel -= 10;
            }
        }

        if (this.maintenance <= 30) {
            this.petHealth -= 25;
            if (getPetHealth() < 65) {
                this.happinessLevel -= 10;
            }
        }
    }
}
