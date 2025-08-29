package RPG;

public abstract class Map {

    protected Tile[][] tiles;

    public void display() {

        for(int row = 0; row < tiles.length; row++) {
            for(int col = 0; col < tiles.length; col++ ) {
                System.out.print(tiles[row][col].getCharacter());
            }
            System.out.println();
        }
    }
    public abstract Tile createTile();
}
