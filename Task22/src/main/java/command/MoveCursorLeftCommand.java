package command;

public class MoveCursorLeftCommand implements Command {
    private PixelGrid pixelGrid;

    public MoveCursorLeftCommand(PixelGrid pixelGrid) {
        this.pixelGrid = pixelGrid;
    }

    @Override
    public void execute() {
        pixelGrid.moveLeft();

    }
}
