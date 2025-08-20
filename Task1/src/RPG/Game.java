package RPG;

import RPG.Maps.*;

public class Game {

    private Map map;

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("Loading map....");
        game.createMap();
        game.map.display();
    }
    public void createMap() {
        int randomChoice = (int)(Math.random() * 2);
        if(randomChoice == 0) {
            map = new CityMap();
        } else if(randomChoice == 1) {
            map = new WildernessMap();
        }
    }
}