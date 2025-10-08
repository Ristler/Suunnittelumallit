package flyweight.Tiles;
import flyweight.Tile;
import flyweight.TileGraphicFactory;
import flyweight.TileType;

public class WaterTile extends Tile {
    public WaterTile() {
        this.character = 'W';
        this.type = "water";
        this.tileImage = TileGraphicFactory.getTileImage(TileType.BUILDING);

    }
}
