import java.util.List;

public interface Teachable {
    void teach(String command);

    List<String> getCommands();
}
