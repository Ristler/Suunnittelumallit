package flyweight.Tiles;
import flyweight.Tile;
import flyweight.TileGraphicFactory;
import flyweight.TileType;

public class RoadTile extends Tile {

    public RoadTile() {
        this.character = 'R';
        this.type = "road";
        this.tileImage = TileGraphicFactory.getTileImage(TileType.ROAD);

    }
}
