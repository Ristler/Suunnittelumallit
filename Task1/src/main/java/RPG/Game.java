package RPG;
import RPG.Maps.*;

public class Game {
    Map map;

    //MAIN TÄHÄN?
    public void main() {
        System.out.println("Luodaan mappia....");
        createMap();
        map.display();
    }

    public void createMap() {
        int randomChoice = (int)(Math.random() * 2);
        if(randomChoice == 0) {
            map = new CityMap();
        } else if(randomChoice == 1) {
            map = new WildernessMap();
        }
        System.out.println("Random choice: "+ map);
    }
}