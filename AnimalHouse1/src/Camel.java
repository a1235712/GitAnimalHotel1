public class Camel extends Animal implements BurdenAnimal {
    private final int carryingCapacity;

    public Camel(String name, int age, String birthday, int carryingCapacity) {
        super(name, age, birthday);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String getSound() {
        return "Grunt";
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
