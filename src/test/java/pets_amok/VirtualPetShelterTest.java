package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter omgPets;

    @BeforeEach
    public void setup() {
        omgPets = new VirtualPetShelter();
        OrganicDog superPet = new OrganicDog("Krypto", "The Super Dog");
        RoboDog superPet2 = new RoboDog("Tommy", "Green Power Dog");
        OrganicCat superPet3 = new OrganicCat("Kimberly", "Pink Power Dog");
        RoboCat superPet4 = new RoboCat("Billy", "Blue Power Cat");

        omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        omgPets.addPet(superPet3);
        omgPets.addPet(superPet4);
    }

    @Test
    public void testFeedOrganic() {

        omgPets.feedOrganic();
        Organic organicPet = (Organic) omgPets.getPets().get(0);

        assertEquals(50, organicPet.getHungerLevel());
    }

    @Test
    public void testGiveOrganicWater() {

        omgPets.giveOrganicWater();
        Organic organicPet = (Organic) omgPets.getPets().get(0);

        assertEquals(50, organicPet.getThirstLevel());
    }

    @Test
    public void testGiveRoboPetsOil() {

        omgPets.giveRoboPetsOil();
        Robo roboPet = (Robo) omgPets.getPets().get(1);

        assertEquals(90, roboPet.getOilLevel());

    }

    @Test
    public void testFixRoboPetsMaintenance() {

        omgPets.fixRoboPetsMaintenance();
        Robo roboPet = (Robo) omgPets.getPets().get(1);

        assertEquals(90, roboPet.getMaintenance());
    }

    @Test
    public void testCleanCages() {

        omgPets.cleanCages();
        OrganicDog organicPet = (OrganicDog) omgPets.getPets().get(0);

        assertEquals(100, organicPet.getCageCleanliness());
    }

    @Test
    public void testCleanLitterBox() {

        omgPets.cleanLitterBox();
        OrganicCat organicPet = (OrganicCat) omgPets.getPets().get(2);

        assertEquals(100, organicPet.getLitterBoxCleanliness());
    }

}