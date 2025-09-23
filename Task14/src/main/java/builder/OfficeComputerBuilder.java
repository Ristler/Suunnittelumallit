package builder;

public class OfficeComputerBuilder implements ComputerBuilder {
    private Computer computer;


    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setCPU("i3 12000");
    }

    @Override
    public void buildRam() {
        computer.setRam(8);

    }

    @Override
    public void buildStorage() {
        computer.setStorage(512);
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGpu("Integrated graphics");
    }

    @Override
    public void buildOperationSystem() {
        computer.setOS("Windows 11 home");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
