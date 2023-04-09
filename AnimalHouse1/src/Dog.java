import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements Teachable, Pat {
    private final String breed;
    private final List<String> commands;

    private final List<String> tricks;

    public Dog(String name, int age, String birthday, String breed) {
        super(name, age, birthday);
        this.breed = breed;
        this.commands = new ArrayList<>();

        this.tricks = new ArrayList<>();
    }

    @Override
    public String getSound() {
        return "Woof";
    }

    @Override
    public void teach(String command) {
        commands.add(command);
    }

    @Override
    public List<String> getCommands() {
        return commands;
    }

    @Override
    public void pat() {
        System.out.println(getName() + " is being patted.");
    }

    @Override
    public void learnTrick(String trick) {
        tricks.add(trick);
    }

    @Override
    public List<String> getTricks() {
        return tricks;
    }



    public String getBreed() {
        return breed;
    }
}
