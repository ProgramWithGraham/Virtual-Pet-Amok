package pets_amok;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner animals = new Scanner(System.in);
        VirtualPetShelter omgPets = new VirtualPetShelter();

        System.out.println(
                "\n Welcome to the grand ole world of Virtual Pets. Your goal is to keep your pets satisfied. The higher the number the better your pet is doing. \n");

        OrganicDog superPet = new OrganicDog("Krypto", "The Super Dog");
        OrganicCat superPet2 = new OrganicCat("Kimberly", "Pink Power Cat");
        RoboCat superPet3 = new RoboCat("Billy", "Blue Power Cat");
        RoboDog superPet4 = new RoboDog("Tommy", "Green Power Dog");

        omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        omgPets.addPet(superPet3);
        omgPets.addPet(superPet4);

        omgPets.showPets();
        superPet.printUserInstructions();
        while (true) {
            int userInput = animals.nextInt();
            if (userInput == 1) { // This is used to increases the Hunger and Happiness for Organic pets
                omgPets.feedOrganic();
                System.out.println("\nYou have given your Organic pets some food.\n");
            } else if (userInput == 2) { // This is used to increases the Thirst and Happiness for Organic pets
                omgPets.giveOrganicWater();
                System.out.println("\nYou have given your Organic pets some water.\n");
            } else if (userInput == 3) { // This is used to increase the oil level for Robo pets
                omgPets.giveRoboPetsOil();
                System.out.println("\nYou have given your Robo pets some oil.\n");
            } else if (userInput == 4) { // This is used to increase the Maintenance levels for Robo pets
                omgPets.fixRoboPetsMaintenance();
                System.out.println("\nYou have fixed up your Robo pets and increased Maintenance levels.\n");
            } else if (userInput == 5) { // This is used to increase the boredom level for only the selected pet
                omgPets.listPets();
                animals.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to play with");
                String chooseAPet = animals.nextLine();
                omgPets.playWithSelectedPet(chooseAPet);
                System.out.println("\nYou have played with " + chooseAPet + "\n");
            } else if (userInput == 6) { // This is to remove a pet from the shelter
                omgPets.listPets();
                animals.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to adopt");
                String petToRemove = animals.nextLine();
                System.out.println("You have adopted " + " " + petToRemove + "\n");
                omgPets.removePet(petToRemove);
            } else if (userInput == 7) { // This is to add a new pet per user's choice pet name and description
                animals.nextLine();
                System.out.println("\nWhat type of Pet are you admitting? Please only enter Robo or Organic");
                userInput = animals.nextInt();
                animals.nextLine();
                System.out.println("\nWhat name do you want your new pet to have?");
                String namingThePet = animals.nextLine();
                System.out.println("What is your description of your pet in three words?");
                String describeThePet = animals.nextLine();
                if (userInput == 1) {
                    VirtualPet organicDog = new OrganicDog(namingThePet, describeThePet);
                    omgPets.addPet(organicDog);
                } else if (userInput == 2) {
                    VirtualPet organicCat = new OrganicCat(namingThePet, describeThePet);
                    omgPets.addPet(organicCat);
                } else if (userInput == 3) {
                    VirtualPet roboDog = new RoboDog(namingThePet, describeThePet);
                    omgPets.addPet(roboDog);
                } else if (userInput == 4) {
                    VirtualPet roboCat = new RoboCat(namingThePet, describeThePet);
                    omgPets.addPet(roboCat);
                    System.out.println(" You have admitted a pet.");
                    System.out.println("");
                }
            } else if (userInput == 8) { // This is used to decrease the waste in cages
                omgPets.cleanCages();
                System.out.println("\nYou have cleaned up all of the waste in the dog cages.\n");
            } else if (userInput == 9) { // This is used to decrease the waste in the litter boxes
                omgPets.cleanLitterBox();
                System.out.println("\nYou have cleaned up all the waste in the litter boxes.\n");
            } else if (userInput == 10) { // This is used to increase the Happiness and Health, but decrease Boredom
                                          // for Robo and Organic dogs
                System.out.println("\nYou have walked all the dogs.\n");
                omgPets.walkAllDogs();
            } else if (userInput == 0) { // End the program
                System.out.println("");
                System.out.println(" Baby Come Back, I just can't live without you!\n");
                System.out.println("");
                System.out.println("            /~~~~~~~~\\                           _");
                System.out.println("    ##\\__/ @)      ~~~~~~~~\\                     \\ \\ ) )");
                System.out.println("    |              /~~\\~~~~~                ((    |  \\");
                System.out.println("     \\    /           |                          /   |");
                System.out.println("      (~~~   /         \\____________/~~~~~~~~~~~~   /");
                System.out.println("       ~~~~|~                                     /");
                System.out.println("           :                                      |");
                System.out.println("            \\                                     |");
                System.out.println("            |                               /      \\");
                System.out.println("             \\  \\_         :         \\     /~~~\\|");
                System.out.println("             /   :~~~~~|   :~~~~~~~~~~|   :     :   :");
                System.out.println("            /    :    /    :         /    :    /    :");
                System.out.println("        (~~~     )(~~~     )     (~~~     )(~~~     )");
                System.out.println("         ~~~~~~~~  ~~~~~~~~       ~~~~~~~~  ~~~~~~~~");
                System.out.println("          STOMP     STOMP          STOMP     STOMP");
                System.out.println("");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            }
            omgPets.tickAllPets();
            omgPets.showPets();
            superPet.printUserInstructions();
        }
        animals.close();
    }
}
