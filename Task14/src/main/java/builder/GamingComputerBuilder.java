package builder;

public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setCPU("i9 12000");
    }

    @Override
    public void buildRam() {
        computer.setRam(32);

    }

    @Override
    public void buildStorage() {
        computer.setStorage(2000);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGpu("Nvidia RTX 4090 24gb");
    }

    @Override
    public void buildOperationSystem() {
        computer.setOS("Windows 11 PRO");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
