package Template;

public class Player {
    private int playerNumber = 0;
    private int playerScore;


    public Player(int playerNumber) {
        this.playerNumber = playerNumber;
        this.playerScore = 0;
    }
    public int getScore() {
        return playerScore;
    }
    public void setScore(int score) {
        playerScore = score;
    }
    public int getPlayer() {
        return playerNumber;
    }
}
