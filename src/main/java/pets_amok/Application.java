package pets_amok;

import java.util.*;

public class Application {

    public static void main(String[] args) throws Exception {
        Scanner animals = new Scanner(System.in);
        VirtualPetShelter omgPets = new VirtualPetShelter();

        System.out.println(
                "\n Welcome to the grand ole world of Virtual Pets. Your goal is to keep your pets satisfied with Food, Water and Play. The higher the number the better your pet is doing. \n");
        Organic superPet = new Organic("Krypto", "The Super dog", 0);
        Robo superPet2 = new Robo("Tommy", "Green Power dog", 0);

        omgPets.addPet(superPet);
        omgPets.addPet(superPet2);
        // omgPets.addPet(superPet3);
        // omgPets.addPet(superPet4);
        // omgPets.addPet(superPet5);
        // omgPets.addPet(superPet6);

        omgPets.showPets();
        superPet.printUserInstructions();
        while (true) {
            int userInput = animals.nextInt();
            if (userInput == 1) { // This is used to increase the Hunger level for all pets
                omgPets.feedAll();
                System.out.println("\nYou have given all pets some food.\n");
            } else if (userInput == 2) { // This is used to increase the Thirst level for all pets
                omgPets.giveAllWater();
                System.out.println("\nYou have given all pets some water.\n");
            } else if (userInput == 3) { // This is used to increase the boredom level for only the selected pet
                omgPets.findPet();
                animals.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to play with");
                String chooseAPet = animals.nextLine();
                omgPets.playWithSelectedPet(chooseAPet);
                System.out.println("\nYou have played with " + chooseAPet + "\n");
            } else if (userInput == 4) { // This is to remove a pet from the shelter
                omgPets.findPet();
                animals.nextLine();
                System.out.println("\nPlease type the pet name from the above list that you want to adopt");
                String petToRemove = animals.nextLine();
                System.out.println("You have adopted " + " " + petToRemove + "\n");
                omgPets.removePet(petToRemove);
            } else if (userInput == 5) { // This is to add a new pet per user's choice pet name and description
                animals.nextLine();
                System.out.println("\nWhat name do you want your new pet to have?");
                String namingThePet = animals.nextLine();
                System.out.println("What is your description of your pet in three words?");
                String describeThePet = animals.nextLine();
                System.out.println(" You have admitted a pet.");
                // Organic newPet = new Organic(namingThePet, describeThePet);
                // omgPets.addPet(newPet);
                System.out.println("");
            } else if (userInput == 6) { // End the program
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
