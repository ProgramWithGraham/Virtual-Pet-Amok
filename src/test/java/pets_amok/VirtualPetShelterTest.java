package pets_amok;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {
    private VirtualPetShelter omgPets;

    @BeforeEach
    public void setup() {
        omgPets = new VirtualPetShelter();
        //VirtualPet superPet = new VirtualPet("Krypto", "The Super dog");
       // omgPets.addPet(superPet);
    }

    @Test
    public void testFeedAll() {
        omgPets.feedAll();
        assertEquals(85, omgPets.getPets().get(0).getHungerLevel());
    }

    @Test
    public void testGiveAllWater() {
        omgPets.giveAllWater();
        assertEquals(85, omgPets.getPets().get(0).getThirstLevel());
    }

    @Test
    public void testTickAllPets() {
        omgPets.tickAllPets();
        assertEquals(73, omgPets.getPets().get(0).getHungerLevel());
        assertEquals(73, omgPets.getPets().get(0).getThirstLevel());
        assertEquals(73, omgPets.getPets().get(0).getBoredomLevel());
    }

}