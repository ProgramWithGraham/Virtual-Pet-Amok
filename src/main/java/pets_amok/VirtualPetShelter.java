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
                selectedPet.playFetch();
            counter++;
        }
    }

    public void playWithAll() {
        for (VirtualPet pet : pets) {
            pet.playFetch();
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

    public void giveRobPetsOil() {
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
            if (pet instanceof OrganicDogs) {
                OrganicDogs organicPet = (OrganicDogs) pet;
                organicPet.cageCleanliness();
            }
    }

    public void cleanLitterBox() {
        for (VirtualPet pet : pets)
            if (pet instanceof OrganicCats) {
                OrganicCats organicPet = (OrganicCats) pet;
                organicPet.litterBoxCleanliness();
            }
    }

    public void walkAllDogs() {
        for (VirtualPet pet : pets) {
            if (pet instanceof OrganicDogs) {
                ((OrganicDogs) pet).goForWalk();
            } else if (pet instanceof RoboDogs) {
                ((RoboDogs) pet).goForWalk();
            }
        }
    }

    public void tickAllPets() {
        for (VirtualPet pet : pets)
            pet.tick();
    }

    public void showPets() {
        for (VirtualPet pet : pets) {
            if (pet instanceof OrganicCats) {
                System.out.println(" Organic Cats");
                System.out.println(pet.getPetName() + " :" + pet.getPetDescription() + " : Health " + pet.getPetHealth()
                        + " Happiness: " + pet.getHappinessLevel() + " Boredom: " + pet.getBoredomLevel()
                        + " Hunger: " + ((Organic) pet).getHungerLevel()
                        + " Thirst: " + ((Organic) pet).getThirstLevel()
                        + " Waste in Litter Box: " + ((OrganicCats) pet).getWasteInLitterBox()
                        + " Litter Box cleanliness: " + ((OrganicCats) pet).getLitterBoxCleanliness());

            } else if (pet instanceof OrganicDogs) {
                System.out.println(" Organic Dog");
                System.out.println(pet.getPetName() + ":" + pet.getPetDescription() + ": Health " + pet.getPetHealth()
                        + " Happiness: " + pet.getHappinessLevel() + " Boredom: " + pet.getBoredomLevel()
                        + " Hunger: " + ((Organic) pet).getHungerLevel()
                        + " Thirst: " + ((Organic) pet).getThirstLevel()
                        + " Waste in Cages: " + ((OrganicDogs) pet).getWasteInCage()
                        + " Cage cleanliness " + ((OrganicDogs) pet).getCageCleanliness());

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
