package RPG.Maps;

import RPG.Map;
import RPG.Tile;
import RPG.Tiles.*;

public class WildernessMap extends Map {

    public WildernessMap() {
        this.tiles = new Tile[25][25];

        for(int row = 0; row < tiles.length; row++) {

            for(int col = 0; col < tiles.length; col++) {
                this.tiles[row][col] = createTile();
            }
        }
    }

    public Tile createTile() {
        int randomTile;
        Tile newTile = null;
        randomTile = (int) (Math.random() * 3);

        if(randomTile == 0) {
            newTile = new SwampTile();
        }
        else if(randomTile == 1) {
            newTile = new WaterTile();
        }
        else if(randomTile == 2) {
            newTile = new ForestTile();
        }
        return newTile;
    }
}