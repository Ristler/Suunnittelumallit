package builder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }
    public void constructorComputer() {
        builder.buildProcessor();
        builder.buildGraphicsCard();
        builder.buildOperationSystem();
        builder.buildStorage();
        builder.buildRam();

    }
}
