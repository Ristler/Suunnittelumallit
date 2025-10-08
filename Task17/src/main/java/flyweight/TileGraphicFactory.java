package flyweight;
import java.util.EnumMap;
import java.util.Map;

public class TileGraphicFactory {

    private static final Map<TileType, TileImage> images = new EnumMap<>(TileType.class);

    public static TileImage getTileImage(TileType type) {
        TileImage image = images.get(type);

        if(image == null) {
            switch(type) {
                case SWAMP:
                    image = new TileImage("/assets/swampttile.jpg", "swamp");
                    break;
                case WATER:
                    image = new TileImage("/assets/watertile.jpg", "water");
                    break;
                case ROAD:
                    image = new TileImage("/assets/roadtile.jpg", "road");
                    break;
                case FOREST:
                    image = new TileImage("/assets/foresttile.jpg", "forest");
                    break;

                case BUILDING:
                    image = new TileImage("/assets/buildingtile.jpg", "swamp");
                    break;
            }
            images.put(type, image);

        }
        return image;
    }

}
