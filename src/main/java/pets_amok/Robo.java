package pets_amok;

public abstract class Robo extends VirtualPet {
    private int maintenance;
    private int oilLevel;

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
        this.oilLevel += 10;
        setBoredomLevel(getBoredomLevel() - 5);
        setHappinessLevel(getHappinessLevel() + 5);
        setPetHealth(getPetHealth() + 3);
        return this.oilLevel;
    }

    public int improveMaintenance() {
        this.maintenance += 10;
        setBoredomLevel(getBoredomLevel() - 5);
        setHappinessLevel(getHappinessLevel() + 5);
        setPetHealth(getPetHealth() + 3);
        return this.maintenance;
    }

    @Override
    public void tick() {
        super.tick();
        this.oilLevel -= 2;
        this.maintenance -= 2;
        if (oilLevel <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
        if (maintenance <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }
}
