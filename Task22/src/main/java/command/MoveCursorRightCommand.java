package command;

public class MoveCursorRightCommand implements Command{
    private PixelGrid pixelGrid;

    public MoveCursorRightCommand(PixelGrid pixelGrid) {
        this.pixelGrid = pixelGrid;
    }
    @Override
    public void execute() {
        pixelGrid.moveRight();

    }
}
