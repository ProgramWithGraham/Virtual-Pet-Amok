package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter omgPets;

    @BeforeEach
    public void setup() {
        VirtualPetShelter omgPets = new VirtualPetShelter();
        OrganicDogs superPet = new OrganicDogs("Krypto", "The Super Dog", 0, 0, 0, 0, 0, 0, 0);
        RoboDogs superPet2 = new RoboDogs("Tommy", "Green Power Dog", 0, 0, 0, 0, 0);
        OrganicCats superPet3 = new OrganicCats("Kimberly", "Pink Power Dog", 0, 0, 0, 0, 0, 0, 0);
        RoboCats superPet4 = new RoboCats("Billy", "Blue Power Cat", 0, 0, 0, 0, 0);

        omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        omgPets.addPet(superPet3);
        omgPets.addPet(superPet4);
    }

    @Test
    public void testFeedOrganic() {

        omgPets.feedOrganic();

        assertEquals(10, omgPets.getPets().get(0).getHungerLevel());
    }

    @Test
    public void testGiveOrganicWater() {
        omgPets.giveOrganicWater();
        assertEquals(10, omgPets.getPets().get(0).getThirstLevel());
    }

    public void testGiveRoboPetsOil() {
        omgPets.giveRoboPetsOil();
        assertEquals(10, omgPets.getPets().get(0).getOilLevel());

    }

    public void testFixRoboPetsMaintenance() {

    }

    public void testCleanCages() {

    }

    public void testCleanLitterBox() {

    }

    public void testWalkAllDogs() {

    }

}