package builder;

public class Computer {
    private String graphicsCard;
    private String operationSystem;
    private String processor;
    private int ram;
    private int storage;


    public Computer() {
        this.graphicsCard = "";
        this.operationSystem = "";
        this.processor = "";
        this.ram = 0;
        this.storage = 0;
    }
    public void setGpu(String gpu) {
        graphicsCard = gpu;
    }
    public void setOS(String os) {
        operationSystem = os;
    }
    public void setCPU(String cpu) {
        processor = cpu;
    }
    public void setRam(int ramValue) {
        ram = ramValue;
    }
    public void setStorage(int storageValue) {
        storage = storageValue;
    }
    public String toString() {
        String computer = "Computer with selected parts:" +
                "\nGPU: "+ graphicsCard + "" +
                "\nOS: "+ operationSystem + "" +
                "\nCPU: "+ processor + "" +
                "\nRAM: "+ ram + " GB" +
                "\nSTORAGE: "+ storage + " GB";
        return computer;
    }
}
