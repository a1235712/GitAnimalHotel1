import java.util.ArrayList;
import java.util.List;

public class Hamster extends Animal implements Pat {
    private final List<String> tricks;

    public Hamster(String name, int age, String birthday) {
        super(name, age, birthday);
        this.tricks = new ArrayList<>();
    }

    @Override
    public String getSound() {
        return "Squeak";
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
}
