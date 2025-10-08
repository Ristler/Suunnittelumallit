package flyweight;

import flyweight.Tile;
import javafx.scene.canvas.GraphicsContext;

public abstract class Map {

    protected Tile[][] tiles;

    public void display(GraphicsContext graphics) {

        for(int row = 0; row < tiles.length; row++) {
            for(int col = 0; col < tiles.length; col++ ) {
                Tile tile = tiles[row][col];
                if(tile.tileImage != null) {
                    graphics.drawImage(
                            tile.tileImage.getImage(),
                            col * 32,
                            row * 32,
                            32,
                            32
                    );
                }
            }
        }
    }
    public Tile[][] getTiles() {
        return tiles;
    }
    public abstract Tile createTile();
}
