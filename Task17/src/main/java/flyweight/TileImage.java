package flyweight;

import javafx.scene.image.Image;

public class TileImage implements Flyweight {

    private final Image image;
    private final String type;

    public TileImage(String imagePath, String type) {
        this.image = new Image(imagePath);
        this.type = type;
    }
    @Override
    public Image getImage() {
        return image;
    }
}
