package State;

import java.util.ArrayList;

public class Character {
    private String name;
    private int experience;
    private int health;
    private int level;
    private ArrayList<String> levels;

    public Character(String name) {
        this.name = name;
        this.experience = 0;
        this.health = 0;
        this.level = 0;
        this.levels = new ArrayList<>();

        //Starting level everyone should have.
        levels.add("Novice level");

    }
    public void levelUp() {
        level++;
    }
    public int getPlayerLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
    public int getExp() {
        return experience;
    }
    public int getHealth() {
        return health;
    }
    public void addExp(int amount) {
        experience += amount;
        if(experience >= 100) {
            experience -= 100;
            levelUp();
        }
    }
    public void decHealth(int healthDec) {
        health -= healthDec;
    }
    public void addHealth(int healthAdd) {
            health += healthAdd;
    }
    public void addLevel(String level) {
        if(!levels.contains(level)) {
            levels.add(level);

        }
    }
    public ArrayList getLevels() {
        return levels;
    }
}
