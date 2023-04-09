import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    private final String name;
    private final int age;
    private final String birthday;

    public Animal(String name, int age, String birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    public abstract String getSound();
}

