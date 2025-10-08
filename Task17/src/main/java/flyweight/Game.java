package flyweight;

import flyweight.Maps.CityMap;
import flyweight.Maps.WildernessMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application {

    private static final int TILE_SIZE = 32;

    @Override
    public void start(Stage primaryStage) {
        WildernessMap map = new WildernessMap();

        int rows = map.getTiles().length;
        int cols = map.getTiles()[0].length;

        Canvas canvas = new Canvas(cols * TILE_SIZE, rows * TILE_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        map.display(gc);

        Pane root = new Pane(canvas);
        Scene scene = new Scene(root);
        primaryStage.setTitle("RPG Map with Flyweight Tiles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}