package flyweight.Tiles;
import flyweight.Tile;
import flyweight.TileGraphicFactory;
import flyweight.TileType;

public class ForestTile extends Tile {

    public ForestTile() {
        this.character = 'F';
        this.type = "forest";
        this.tileImage = TileGraphicFactory.getTileImage(TileType.FOREST);

    }
}
