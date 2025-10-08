package command;

public class PixelGrid {

    private boolean[][] pixels;
    private int row;
    private int col;


    public PixelGrid() {
        pixels = new boolean[8][8];
        this.row = 0;
        this.col = 0;
    }
    public void moveUp() {
        if(row > 0) {
            row--;
        }
    }
    public void moveDown() {
        if(row < 7) {
            row++;
        }
    }
    public void moveLeft() {
        if(col > 0) {
            col--;
        }
    }
    public void moveRight() {
        if(col < 7) {
            col++;
        }
    }
    public void generateCode() {
        System.out.println("int[][] pixelArt = {");

        for (int row = 0; row < pixels.length; row++) {
            System.out.print("    {");
            for (int col = 0; col < pixels[row].length; col++) {
                System.out.print(pixels[row][col] ? "1" : "0");
                if (col < pixels[row].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (row < pixels.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("};");
    }
    public void togglePixel() {
        pixels[row][col] = !pixels[row][col];
    }
    public boolean[][] getPixels() {
        return pixels;
    }
    public int getRow() { return row; }
    public int getCol() { return col; }
}
