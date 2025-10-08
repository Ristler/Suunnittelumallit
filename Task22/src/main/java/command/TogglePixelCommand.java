package command;

public class TogglePixelCommand implements Command{
    private PixelGrid pixelGrid;

    public TogglePixelCommand(PixelGrid pixelGrid) {
        this.pixelGrid = pixelGrid;
    }

    @Override
    public void execute() {
        pixelGrid.togglePixel();

    }
}
