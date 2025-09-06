package Template;

import java.util.ArrayList;
import java.util.Random;

public class DiceGame extends Game {

    ArrayList<Player> players = new ArrayList<Player>();
    int allPlayers = 0;
    boolean finished = false;
    int index = 0;
    Random random = new Random();


    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("Hello, starting the dice game..");
        allPlayers = numberOfPlayers;

        for (int i = 1; i <= numberOfPlayers; i++) {
            Player player = new Player(i);
            players.add(player);
        }
    }
    @Override
    public void playSingleTurn(int player) {
        int diceThrow = random.nextInt(1, 7);
        players.get(index).setScore(diceThrow);
        index++;
        player++;

        if(index == allPlayers) {
            finished = true;
        }
            System.out.println("Player: "+ player +
                    "\nThrew the dice.." +
                    "\nDice face: "+ diceThrow);
        }

    @Override
    public void displayWinner() {
        Player winner = null;
        int maxScore = -1;

        for(Player player : players) {
            if(player.getScore() > maxScore) {
                maxScore = player.getScore();
                winner = player;
            }
        }
        assert winner != null;
        System.out.println("The winner is player: "+ winner.getPlayer());

    }
    @Override
    public boolean endOfGame() {
        return finished;
    }
}
