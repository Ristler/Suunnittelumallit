package State;

import java.util.Scanner;


public class ReadyState extends State {
    private Scanner scanner = new Scanner(System.in);
    private boolean gameStarted = false;
    private Character player;


    public ReadyState(Machine machine) {
        super(machine);
    }

    public Character returnPlayer() {
        return player;
    }


    /// DOESNT WORK. NEEDS TO LIMIT
    public void loadLevels() {
        int xp = player.getExp();


        if(xp >= 100 && xp < 200) {
            player.addLevel("Intermediate level");
        } else if (xp >= 200 && xp < 300) {
            player.addLevel("Expert level");
        } else if(xp >= 300 && xp < 400) {
            player.addLevel("Master level");
        }
    }


    @Override
    void menuAction() {

        if(!gameStarted) {
            System.out.println("Greetings, enter your name:");
            String name = scanner.nextLine();
            player = new Character(name);
            gameStarted = true;
            System.out.println("Hello "+ player.getName() + ", welcome to the game!");
        }

        System.out.println("Name: "+ player.getName() + "\nExperience: "+ player.getExp()+"\n" +
                "Health: "+ player.getHealth());


        switch (this.getMachine().readUserChoice(player.getLevels(), "starting")) {

            case 1:
                System.out.println("Novice level selected.");
                this.getMachine().setState(new NoviceLevelState(this.getMachine()));
                break;
            case 2:
                if(player.getExp() >= 100) {
                    System.out.println("Intermediate level selected.");
                    this.getMachine().setState(new IntermediateLevelState(this.getMachine()));
                }

                break;
            case 3:
                if(player.getExp() >= 200) {
                    System.out.println("Expert level selected.");
                    this.getMachine().setState(new ExpertLevelState(this.getMachine()));
                }


            case 4:
                if(player.getExp() >= 300) {
                    System.out.println("Master level selected.");
                    this.getMachine().setState(new MasterLevelState(this.getMachine()));
                }

            default:
                System.out.println("No such option available.");
                break;
        }
    }
    @Override
    void trainAction() {
        System.out.println("Not available");

    }

    @Override
    void meditateAction() {
        System.out.println("Not available");

    }

    @Override
    void fightAction() {
        System.out.println("Not available");

    }
}
