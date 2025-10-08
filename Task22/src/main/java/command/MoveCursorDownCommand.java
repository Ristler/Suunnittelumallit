package command;

public class MoveCursorDownCommand implements Command{

    private PixelGrid pixelGrid;

    public MoveCursorDownCommand(PixelGrid pixelGrid) {
        this.pixelGrid = pixelGrid;
    }
    @Override
    public void execute() {
        pixelGrid.moveDown();
    }
}
