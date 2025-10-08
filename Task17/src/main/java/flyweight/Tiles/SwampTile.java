package flyweight.Tiles;
import flyweight.Tile;
import flyweight.TileGraphicFactory;
import flyweight.TileType;

public class SwampTile extends Tile {
    public SwampTile() {
        this.character = 'S';
        this.type = "swamp";
        this.tileImage = TileGraphicFactory.getTileImage(TileType.SWAMP);

    }
}
