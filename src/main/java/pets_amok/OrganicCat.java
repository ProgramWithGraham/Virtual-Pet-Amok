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
        litterBoxCleanliness -= 5;
        if (litterBoxCleanliness <= 50) {
            this.petHealth -= 25;
            if (getPetHealth() < 65) {
                this.happinessLevel -= 10;
            }
        }

        if (this.hungerLevel <= 30) {
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
