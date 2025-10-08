package command;

public class GenerateCodeCommand implements Command{
    private PixelGrid pixelGrid;

    public GenerateCodeCommand(PixelGrid pixelGrid) {
        this.pixelGrid = pixelGrid;
    }
    @Override
    public void execute() {
        pixelGrid.generateCode();

    }
}
