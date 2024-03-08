package pets_amok;

import java.util.*;

public class VirtualPetShelter {

    private ArrayList<VirtualPet> pets = new ArrayList<VirtualPet>();

    public VirtualPetShelter() {
    }

    public Collection<VirtualPet> getAllPets() {
        return this.pets;
    }

    public ArrayList<VirtualPet> getPets() {
        return this.pets;
    }

    public void setPets(ArrayList<VirtualPet> pets) {
        this.pets = pets;
    }

    public void addPet(VirtualPet addedPet) { // add addition pets
        this.pets.add(addedPet);
    }

    public void feedOrganic() { // feed only Organic type pets
        for (VirtualPet pet : pets) {
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.giveFood();
            }
        }
    }

    public void giveOrganicWater() { // give Water to only Organic pets
        for (VirtualPet pet : pets) {
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.giveWater();
            }
        }
    }

    // Play with a selected pet and only have their stats improved before tick,
    // other pets will only get hit by tick with no improvements
    public void playWithSelectedPet(String petName) {
        int counter = 0;
        while (counter < pets.size()) {
            VirtualPet selectedPet = pets.get(counter);
            String thisSelectedPet = selectedPet.getPetName();
            if (thisSelectedPet.equalsIgnoreCase(petName))
                selectedPet.playWithPet();
            counter++;
        }
    }

    public void listPets() { // Shows a list of current pets with description
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + " " + pet.getPetDescription());
        }
    }

    public void removePet(String petToRemove) { // Remove a single named pet
        int counter = 0;
        while (counter < pets.size()) {
            VirtualPet petAtThisIndex = pets.get(counter);
            String thisPet = petAtThisIndex.getPetName();
            if (thisPet.equalsIgnoreCase(petToRemove)) {
                pets.remove(counter);
                counter--;
            }
            counter++;
        }
    }

    public void giveRoboPetsOil() { // give only Robo pets oil
        for (VirtualPet pet : pets) {
            if (pet instanceof Robo) {
                Robo roboPet = (Robo) pet;
                roboPet.giveOil();
            }
        }
    }

    public void fixRoboPetsMaintenance() { // give only Robo pets maintenance
        for (VirtualPet pet : pets) {
            if (pet instanceof Robo) {
                Robo roboPet = (Robo) pet;
                roboPet.improveMaintenance();
            }
        }
    }

    public void cleanCages() { // Clean dog Cages to 105, but will go to 100 after tick
        for (VirtualPet pet : pets) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicPet = (OrganicDog) pet;
                organicPet.cleanCage();
            }
        }
    }

    public void cleanLitterBox() { // Clean litter boxes to 105, but will go to 100 after tick
        OrganicCat.cleanLitterBox();
    }

    public void walkAllDogs() { // Walk only Robo and Organic dogs
        for (VirtualPet pet : pets) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).goForWalk();
            } else if (pet instanceof RoboDog) {
                ((RoboDog) pet).goForWalk();
            }
        }
    }

    public void tickAllPets() { // All types hit their respective ticks
        for (VirtualPet pet : pets) {
            if (pet instanceof Organic) {
                ((Organic) pet).tick();
            } else if (pet instanceof Robo) {
                ((Robo) pet).tick();
            }
        }
    }

    public void showPets() { // Shows pets by type with name, description and stats
        for (VirtualPet pet : pets) {
            if (pet instanceof OrganicCat) {
                System.out.println(" Organic Cats");
                System.out.println(pet.getPetName() + " :" + pet.getPetDescription() + " : Health " + pet.getPetHealth()
                        + " Happiness: " + pet.getHappinessLevel() + " Boredom: " + pet.getBoredomLevel()
                        + " Hunger: " + ((Organic) pet).getHungerLevel()
                        + " Thirst: " + ((Organic) pet).getThirstLevel()
                        + " Litter Box cleanliness: " + ((OrganicCat) pet).getLitterBoxCleanliness());
            } else if (pet instanceof OrganicDog) {
                System.out.println(" Organic Dog");
                System.out.println(pet.getPetName() + ":" + pet.getPetDescription() + ": Health " + pet.getPetHealth()
                        + " Happiness: " + pet.getHappinessLevel() + " Boredom: " + pet.getBoredomLevel()
                        + " Hunger: " + ((Organic) pet).getHungerLevel()
                        + " Thirst: " + ((Organic) pet).getThirstLevel()
                        + " Waste in Cages: " + ((OrganicDog) pet).getWasteInCage()
                        + " Cage cleanliness " + ((OrganicDog) pet).getCageCleanliness());
            } else if (pet instanceof Robo) {
                System.out.println(" Robo Pets");
                System.out.println(pet.getPetName() + " :" + pet.getPetDescription() + " : Health " + pet.getPetHealth()
                        + " Happiness: " + pet.getHappinessLevel() + " Boredom: " + pet.getBoredomLevel()
                        + " Maintenance: " + ((Robo) pet).getMaintenance()
                        + " Oil level: " + ((Robo) pet).getOilLevel());
            }
        }
    }
}
