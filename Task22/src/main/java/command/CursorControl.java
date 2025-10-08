package command;

public class CursorControl {
    private Command moveCursorDown;
    private Command moveCursorUp;
    private Command moveCursorLeft;
    private Command moveCursorRight;
    private Command togglePixel;
    private Command generateCode;

    public CursorControl(Command moveCursorDown, Command moveCursorUp, Command moveCursorLeft, Command moveCursorRight, Command togglePixel, Command generateCode) {
        this.moveCursorDown = moveCursorDown;
        this.moveCursorUp = moveCursorUp;
        this.moveCursorLeft = moveCursorLeft;
        this.moveCursorRight = moveCursorRight;
        this.togglePixel = togglePixel;
        this.generateCode = generateCode;
    }
    public void moveDown() {
        moveCursorDown.execute();
    }
    public void moveUp() {
        moveCursorUp.execute();
    }
    public void moveLeft() {
        moveCursorLeft.execute();
    }
    public void moveRight() {
        moveCursorRight.execute();
    }
    public void togglePixel() {
        togglePixel.execute();
    }
    public void generateCode() {
        generateCode.execute();
    }
}
