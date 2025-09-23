package builder;

public interface ComputerBuilder {

    void buildProcessor();
    void buildRam();
    void buildStorage();
    void buildGraphicsCard();
    void buildOperationSystem();
    Computer getComputer();
}
