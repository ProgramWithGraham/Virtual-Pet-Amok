package pets_amok;

public class OrganicCat extends Organic implements Cat {

    private static int litterBoxCleanliness;

    public OrganicCat(String petName, String petDescription) {
        super(petName, petDescription);
        litterBoxCleanliness = 80;
    }

    public int getLitterBoxCleanliness() {
        return litterBoxCleanliness;
    }

    public static void setLitterBoxCleanliness(int newLitterBoxCleanliness) {
        litterBoxCleanliness = newLitterBoxCleanliness;
    }

    public static void cleanLitterBox() {
        setLitterBoxCleanliness(100);
    }

    @Override
    public void tick() {
        super.tick();
        this.hungerLevel -= 2;
        this.thirstLevel -= 2;
        litterBoxCleanliness -= 5;
        if (litterBoxCleanliness <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
        if (hungerLevel <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
        if (thirstLevel <= 40) {
            setPetHealth(getPetHealth() - 25);
            if (getPetHealth() < 65) {
                setHappinessLevel(getHappinessLevel() - 10);
            }
        }
    }
}
