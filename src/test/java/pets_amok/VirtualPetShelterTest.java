package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter omgPets;

    @BeforeEach
    public void setup() {
        VirtualPetShelter omgPets = new VirtualPetShelter();
       // OrganicDogs superPet = new OrganicDogs("Krypto", "The Super dog", 0);
        RoboDogs superPet2 = new RoboDogs("Tommy", "Green Power dog", 0);
        OrganicCats superPet3 = new OrganicCats("Kimberly", "Pink Power cat", 0);
        RoboCats superPet4 = new RoboCats("Billy", "Blue Power Cat", 0);

       // omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        omgPets.addPet(superPet3);
        omgPets.addPet(superPet4);
    }

    @Test
    public void feedOrganic() {

        omgPets.feedOrganic();

        // assertEquals(85, Organic.getPets().get(0).getHungerLevel());
    }

    @Test
    public void giveOrganicWater() {
        omgPets.giveOrganicWater();
        // assertEquals(85, omgPets.getPets().get(0).getThirstLevel());
    }

    public void giveRobPetsOil() {

    }

    public void fixRoboPetsMaintenance() {

    }

    public void cleanCages() {

    }

    public void cleanLitterBox() {

    }

    public void walkAllDogs() {

    }

}