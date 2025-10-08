package command;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUI extends Application {

    private MoveCursorUpCommand moveUp;
    private MoveCursorDownCommand moveDown;
    private MoveCursorLeftCommand moveLeft;
    private MoveCursorRightCommand moveRight;
    private TogglePixelCommand togglePixel;
    private GenerateCodeCommand generateCode;
    private PixelGrid pixelGrid;

    private static final int TILE_SIZE = 40; // size of one pixel
    private static final int GRID_SIZE = 8;  // 8x8 grid

    @Override
    public void start(Stage primaryStage) {
        pixelGrid = new PixelGrid();
        moveUp = new MoveCursorUpCommand(pixelGrid);
        moveDown = new MoveCursorDownCommand(pixelGrid);
        moveLeft = new MoveCursorLeftCommand(pixelGrid);
        moveRight = new MoveCursorRightCommand(pixelGrid);
        togglePixel = new TogglePixelCommand(pixelGrid);
        generateCode = new GenerateCodeCommand(pixelGrid);

        Canvas canvas = new Canvas(GRID_SIZE * TILE_SIZE, GRID_SIZE * TILE_SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawGrid(gc);

        Button generateButton = new Button("Generate Code");
        generateButton.setOnAction(e -> generateCode.execute());

        // VBox to stack canvas and button
        VBox root = new VBox(10, canvas, generateButton); // 10px spacing
        root.setAlignment(Pos.CENTER); //
        generateButton.setFocusTraversable(false);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.show();



        scene.setOnKeyPressed(event -> {
            switch(event.getCode()) {
                case UP -> moveUp.execute();
                case DOWN -> moveDown.execute();
                case LEFT -> moveLeft.execute();
                case RIGHT -> moveRight.execute();
                case ENTER -> togglePixel.execute();
            }
            redrawGrid(gc);
        });
    }

    private void redrawGrid(GraphicsContext gc) {
        gc.clearRect(0, 0, GRID_SIZE * TILE_SIZE, GRID_SIZE * TILE_SIZE);

        boolean[][] pixels = pixelGrid.getPixels();

        for(int row = 0; row < pixels.length; row++) {
            for(int col = 0; col < pixels[row].length; col++) {
                // draw pixel
                if(pixels[row][col]) {
                    gc.setFill(Color.BLACK);
                } else {
                    gc.setFill(Color.WHITE);
                }
                gc.fillRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);

                // draw grid lines
                gc.setStroke(Color.GRAY);
                gc.strokeRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);

                // highlight cursor
                if(row == pixelGrid.getRow() && col == pixelGrid.getCol()) {
                    gc.setStroke(Color.RED);
                    gc.setLineWidth(3);
                    gc.strokeRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);
                    gc.setLineWidth(1);
                }
            }
        }
    }


    private void drawGrid(GraphicsContext gc) {
        gc.clearRect(0, 0, GRID_SIZE * TILE_SIZE, GRID_SIZE * TILE_SIZE);

        gc.setLineWidth(1);
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                gc.strokeRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
