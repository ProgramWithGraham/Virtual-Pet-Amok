package pets_amok;

public class RoboDog extends Robo implements Dog {

    public RoboDog(String petName, String petDescription) {
        super(petName, petDescription);
    }

    public void goForWalk() {
        this.petHealth += 5;
        this.happinessLevel += 5;
        this.boredomLevel -= 5;
    }
}