public class Donkey extends Animal implements BurdenAnimal {
    private final int carryingCapacity;

    public Donkey(String name, int age, String birthday, int carryingCapacity) {
        super(name, age, birthday);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String getSound() {
        return "Hee-haw";
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
