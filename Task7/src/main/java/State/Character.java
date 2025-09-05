package State;

import java.util.ArrayList;

public class Character {
    private String name;
    private int experience;
    private int health;
    private ArrayList<String> levels;

    public Character(String name) {
        this.name = name;
        this.experience = 0;
        this.health = 0;
        this.levels = new ArrayList<>();

        //Starting level everyone should have.
        levels.add("Novice level");

        //levels.add("Intermediate level");
        //levels.add("Master level");
        //levels.add("Expert level");
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
    public void setExp(int xpAmount) {
        experience += xpAmount;
    }
    public void decHealth(int healthDec) {
        health -= healthDec;
    }
    public void addHealth(int healthAdd) {
        if(health <= 100) {
            health += healthAdd;
        }
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
