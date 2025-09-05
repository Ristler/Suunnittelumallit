package State;

import java.util.ArrayList;


public class IntermediateLevelState extends State {

    private Character player = this.getMachine().readyState.returnPlayer();
    private int healthAdd = 5;
    int xp = 100;


    public IntermediateLevelState(Machine machine) {
        super(machine);
    }

    @Override
    void menuAction() {

        this.addOption("Meditate");
        System.out.println("Welcome to the intermediate level!");


        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                this.getMachine().operate("train");
                break;

            case 2:
                this.getMachine().operate("meditate");

            case 3:
                this.getMachine().setState(getMachine().readyState);
                this.getMachine().operate("menu");
                break;
        }
    }

    @Override
    void trainAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Lift rocks " +
                    "\n2. Go back");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    player.setExp(xp);
                    System.out.println("You just lifted some heavy rocks!\nXP gained: "+xp+"\nYour total experience: "+player.getExp());
                    this.getMachine().readyState.loadLevels();
                    break;
                case 2:
                    this.getMachine().operate("menu");
            }
        }
    }


    @Override
    void meditateAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Go lay down in the forest " +
                    "\n2. Go back");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    if(player.getHealth() == 100) {
                        System.out.println("You are already refreshed!");
                    } else {
                        player.addHealth(healthAdd);
                        System.out.println("You meditated and now feel refreshed!\nHealth gained: "+healthAdd+"\nYour total health: "+player.getHealth());
                        break;
                    }
                case 2:
                    this.getMachine().operate("menu");
            }
        }
    }

    @Override
    void fightAction() {
        System.out.println("Not available in intermediate level.");

    }
}
