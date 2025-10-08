package flyweight.Maps;

import flyweight.Map;
import flyweight.Tile;
import flyweight.Tiles.BuildingTile;
import flyweight.Tiles.ForestTile;
import flyweight.Tiles.RoadTile;

public class CityMap extends Map {

    public CityMap() {
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
                newTile = new RoadTile();
            }
            else if(randomTile == 1) {
                newTile = new ForestTile();
            }
            else if(randomTile == 2) {
                newTile = new BuildingTile();
            }
        return newTile;
    }
}
