public class Horse extends Animal implements BurdenAnimal {
    private final int carryingCapacity;

    public Horse(String name, int age, String birthday, int carryingCapacity) {
        super(name, age, birthday);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String getSound() {
        return "Neigh";
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
