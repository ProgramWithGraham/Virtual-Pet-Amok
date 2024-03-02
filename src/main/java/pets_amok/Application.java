package pets_amok;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner animals = new Scanner(System.in);
        VirtualPetShelter omgPets = new VirtualPetShelter();

        System.out.println(
                "\n Welcome to the grand ole world of Virtual Pets. Your goal is to keep your pets satisfied. The higher the number the better your pet is doing. \n");

        OrganicDogs superPet = new OrganicDogs("Krypto", "The Super Dog", 0, 0, 0, 0, 0, 0, 0);
        OrganicCats superPet2 = new OrganicCats("Kimberly", "Pink Power Cat", 0, 0, 0, 0, 0, 0, 0);
        RoboCats superPet3 = new RoboCats("Billy", "Blue Power Cat", 0, 0, 0, 0, 0);
        RoboDogs superPet4 = new RoboDogs("Tommy", "Green Power Dog", 0, 0, 0, 0, 0);

        omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        omgPets.addPet(superPet3);
        omgPets.addPet(superPet4);

        omgPets.showPets();
        superPet.printUserInstructions();
        while (true) {
            int userInput = animals.nextInt();
            if (userInput == 1) { // This is used to increase the Hunger level for all pets
                omgPets.feedOrganic();
                System.out.println("\nYou have given your Organic pets some food.\n");
            } else if (userInput == 2) { // This is used to increase the Thirst level for all pets
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
                System.out.println("\nWhat type of Pet are you admitting? ");
                if (userInput == 1) {
                    VirtualPet organicDog = new OrganicDogs(null, null, userInput, userInput, userInput, userInput, userInput, userInput, userInput);
                    omgPets.addPet(organicDog);
                } else if (userInput == 2){
                    VirtualPet organicCat = new OrganicCats(null, null, userInput, userInput, userInput, userInput, userInput, userInput, userInput);
                    omgPets.addPet(organicCat);
                } else if (userInput == 3) {
                    VirtualPet roboDog = new RoboDogs(null, null, userInput, userInput, userInput, userInput, userInput);
                    omgPets.addPet(roboDog);
                } else if (userInput == 4){
                    VirtualPet roboCat = new RoboCats(null, null, userInput, userInput, userInput, userInput, userInput);
                    omgPets.addPet(roboCat);
                System.out.println("\nWhat name do you want your new pet to have?");
                String namingThePet = animals.nextLine();
                System.out.println("What is your description of your pet in three words?");
                String describeThePet = animals.nextLine();
                System.out.println(" You have admitted a pet.");
                System.out.println("");

            } else if (userInput == 8) { // This is used to decrease the waste in cages
                omgPets.cleanCages();
                System.out.println("\nYou have cleaned up some of the waste in the dog cages.\n");
            } else if (userInput == 9) { // This is used to decrease the waste in the litter boxes
                omgPets.cleanLitterBox();
                System.out.println("\nYou have cleaned up some of the waste in the litter boxes.\n");
            } else if (userInput == 10) { // This is used to increase the Maintenance levels for Robo pets
                omgPets.walkAllDogs();
            } else if (userInput == 11) { // This is used to increase the Maintenance levels for Robo pets
                omgPets.playWithAll();
            } else if (userInput == 000) { // End the program
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
