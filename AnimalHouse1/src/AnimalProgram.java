import java.util.*;

public class AnimalProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Animal Program Menu");
            System.out.println("1. Add an animal");
            System.out.println("2. List all animals");
            System.out.println("3. Teach an animal a new command");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Select the type of animal to add:");
                    System.out.println("1. Cat");
                    System.out.println("2. Dog");
                    System.out.println("3. Donkey");
                    System.out.println("4. Horse");
                    System.out.println("5. Camel");
                    System.out.println("6. Hamster");

                    int animalChoice = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    switch (animalChoice) {
                        case 1:
                            System.out.println("Enter the cat's name:");
                            String catName = scanner.nextLine();
                            System.out.println("Enter the cat's age:");
                            int catAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            System.out.println("Enter the cat's breed:");
                            String catBreed = scanner.nextLine();
                            System.out.println("Enter the cat's birthday:");
                            String catBirthday = scanner.nextLine();
                            Cat cat = new Cat(catName, catAge, catBreed, catBirthday);
                            animals.add(cat);
                            System.out.println("Cat added successfully");
                            break;
                        case 2:
                            System.out.println("Enter the dog's name:");
                            String dogName = scanner.nextLine();
                            System.out.println("Enter the dog's age:");
                            int dogAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            System.out.println("Enter the dog's breed:");
                            String dogBreed = scanner.nextLine();
                            System.out.println("Enter the dog's birthday:");
                            String dogBirthday = scanner.nextLine();

                            Dog dog = new Dog(dogName,dogAge, dogBreed,dogBirthday);

                            animals.add(dog);
                            System.out.println("Dog added successfully");
                            break;
                        case 3:
                            System.out.println("Enter the donkey's name:");
                            String donkeyName = scanner.nextLine();
                            System.out.println("Enter the donkey's age:");
                            int donkeyAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            System.out.println("Enter the donkey's birthday:");
                            String donkeyBirthday = scanner.nextLine();
                            System.out.println("Enter the donkey's carryCapacity:");
                            int donkeyCarryCapacity = scanner.nextInt();
                            Donkey donkey = new Donkey(donkeyName, donkeyAge, donkeyBirthday, donkeyCarryCapacity);
                            animals.add(donkey);
                            System.out.println("Donkey added successfully");
                            break;
                        case 4:
                            System.out.println("Enter the horse's name:");
                            String horseName = scanner.nextLine();
                            System.out.println("Enter the horse's age:");
                            int horseAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            System.out.println("Enter the horse's birthday:");
                            String horseBirthday = scanner.nextLine();
                            int horseCarringCapacity = scanner.nextInt();
                            scanner.nextLine();
                            Horse horse = new Horse(horseName, horseAge, horseBirthday, horseCarringCapacity );
                            animals.add(horse);
                            System.out.println("Horse added successfully");
                            break;
                        case 5:
                            System.out.println("Enter the camel's name:");
                            String camelName = scanner.nextLine();
                            System.out.println("Enter the camel's age:");
                            int camelAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character
                            System.out.println("Enter the camel's birthday:");
                            String camelBirthday = scanner.nextLine();
                            System.out.println("Enter the camel's carringCapacity:");
                            int camelCarringCapacity = scanner.nextInt();
                            Camel camel = new Camel(camelName, camelAge, camelBirthday, camelCarringCapacity);
                            animals.add(camel);
                            System.out.println("Camel added successfully");
                            break;
                        case 6:
                            System.out.println("Enter the hamster's name:");
                            String hamsterName = scanner.nextLine();
                            System.out.println("Enter the hamster's age:");
                            int hamsterAge = scanner.nextInt();
                            scanner.nextLine(); // consume the newline character

                            System.out.println("Enter the hamster's birthday:");
                            String hamsterBirthday = scanner.nextLine();
                            Hamster hamster = new Hamster(hamsterName, hamsterAge, hamsterBirthday);
                            animals.add(hamster);
                            System.out.println("Hamster added successfully");
                            break;
                        default:
                            System.out.println("Invalid animal choice");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("List of animals:");
                    for (Animal animal : animals) {
                        System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + ")");
                    }
                    break;
                case 3:
                    System.out.println("Select the animal to teach a new command:");
                    for (int i = 0; i < animals.size(); i++) {
                        System.out.println((i + 1) + ". " + animals.get(i).getName() + " (" + animals.get(i).getClass().getSimpleName() + ")");
                    }
                    int animalIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // consume the newline character
                    if (animalIndex < 0 || animalIndex >= animals.size()) {
                        System.out.println("Invalid animal choice");
                        break;
                    }
                    Animal animal = animals.get(animalIndex);
                    if (!(animal instanceof Teachable)) {
                        System.out.println("Selected animal cannot be taught");
                        break;
                    }
                    System.out.println("Enter the new command to teach " + animal.getName() + ":");
                    String command = scanner.nextLine();
                    Teachable teachable = (Teachable) animal;
                    teachable.teach(command);
                    System.out.println("New command added successfully");
                    break;
                case 4:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

//In this example, I added a menu system that allows the user to select different options for interacting with the program.
// The main menu includes options for adding an animal, listing all animals, teaching an animal a new command, and exiting
// the program.
// When the user selects the "Add an animal" option, the program presents a sub-menu with options for each type of
//  animal. The user can select an animal type and then enter the details for the new animal, which is then added to
// the list of animals.
// When the user selects the "List all animals" option, the program prints a list of all animals in the list,
// including their names and types.
// When the user selects the "Teach an animal a new command" option, the program presents a list of all animals
// and allows the user to select an animal to teach. If the selected animal is teachable, the user can enter a
// new command to teach the animal, which is then added to the animal's list of commands.
// I hope this helps! Let me know if you have any further questions.


