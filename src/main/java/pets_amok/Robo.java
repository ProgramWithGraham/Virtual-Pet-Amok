package pets_amok;

public abstract class Robo extends VirtualPet {
    private int maintenance;
    private int oilLevel;

    public Robo(String petName, String petDescription, int happinessLevel,
            int petHealth, int boredomLevel, int maintenance, int oilLevel) {
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
        setBoredomLevel(getBoredomLevel() + 5);
        setHappinessLevel(getHappinessLevel() + 5);
        return this.oilLevel;
    }

    public int improveMaintenance() {
        this.maintenance += 10;
        setBoredomLevel(getBoredomLevel() + 5);
        setHappinessLevel(getHappinessLevel() + 5);
        return this.maintenance;
    }

    @Override
    public void tick() {
        this.oilLevel -= 2;
        this.maintenance -= 2;
        setBoredomLevel(getBoredomLevel() - 2);
        setHappinessLevel(getHappinessLevel() - 1);
        if (oilLevel - maintenance >= 15) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }
}
