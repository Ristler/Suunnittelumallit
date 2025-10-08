package flyweight.Tiles;

import flyweight.Tile;
import flyweight.TileGraphicFactory;
import flyweight.TileType;

public class BuildingTile extends Tile {

    public BuildingTile() {
        this.character = 'B';
        this.type = "building";
        this.tileImage = TileGraphicFactory.getTileImage(TileType.BUILDING);
    }
}
