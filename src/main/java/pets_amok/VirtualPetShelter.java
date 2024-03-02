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

    public void addPet(VirtualPet addedPet) {
        this.pets.add(addedPet);
    }

    public void feedOrganic() {
        for (VirtualPet pet : pets)
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.giveFood();
            }
    }

    public void giveOrganicWater() {
        for (VirtualPet pet : pets)
            if (pet instanceof Organic) {
                Organic organicPet = (Organic) pet;
                organicPet.giveWater();
            }
    }

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

    public void listPets() {
        for (VirtualPet pet : pets) {
            System.out.println(pet.getPetName() + " " + pet.getPetDescription());
        }
    }

    public void removePet(String petToRemove) {
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

    public void giveRoboPetsOil() {
        for (VirtualPet pet : pets)
            if (pet instanceof Robo) {
                Robo organicPet = (Robo) pet;
                organicPet.giveOil();
            }
    }

    public void fixRoboPetsMaintenance() {
        for (VirtualPet pet : pets)
            if (pet instanceof Robo) {
                Robo organicPet = (Robo) pet;
                organicPet.improveMaintenance();
            }
    }

    public void cleanCages() {
        for (VirtualPet pet : pets)
            if (pet instanceof OrganicDog) {
                OrganicDog organicPet = (OrganicDog) pet;
                organicPet.cageCleanliness();
            }
    }

    public void cleanLitterBox() {
        OrganicCat.cleanLitterBox();
    }

    public void walkAllDogs() {
        for (VirtualPet pet : pets) {
            if (pet instanceof OrganicDog) {
                ((OrganicDog) pet).goForWalk();
            } else if (pet instanceof RoboDog) {
                ((RoboDog) pet).goForWalk();
            }
        }
    }

    public void tickAllPets() {
        for (VirtualPet pet : pets)
            if (pet instanceof Organic) {
                ((Organic) pet).tick();
            } else if (pet instanceof Robo) {
                ((Robo) pet).tick();
            }
    }

    public void showPets() {
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
