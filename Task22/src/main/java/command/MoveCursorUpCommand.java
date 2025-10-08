package command;

public class MoveCursorUpCommand implements Command{
    private PixelGrid pixelGrid;

    public MoveCursorUpCommand(PixelGrid pixelGrid) {
        this.pixelGrid = pixelGrid;
    }
    @Override
    public void execute() {
        pixelGrid.moveUp();

    }
}
