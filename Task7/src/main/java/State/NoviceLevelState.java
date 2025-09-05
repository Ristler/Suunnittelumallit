package State;

import java.util.Scanner;

public class NoviceLevelState extends State {
    int xp = 50;
    private Character player = this.getMachine().readyState.returnPlayer();


    public NoviceLevelState(Machine machine) {
        super(machine);
    }


    @Override
    void menuAction() {
        System.out.println("Welcome to the novice level!");


        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                this.getMachine().operate("train");
                break;
            case 2:
                this.getMachine().setState(getMachine().readyState);
                this.getMachine().operate("menu");
                break;
        }
    }

    @Override
    void trainAction() {
        System.out.println("Welcome to the novice level.");

        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Lift trees " +
                    "\n2. Exit");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    player.setExp(xp);
                    System.out.println("You just lifted some trees off the ground!\nXP gained: "+xp+"\nYour total experience: "+player.getExp());
                        this.getMachine().readyState.loadLevels();
                    break;
                case 2:
                    //this.menuAction();
                    this.getMachine().operate("menu");
            }

        }
    }

    @Override
    void meditateAction() {
        System.out.println("Not available in novice level.");
    }

    @Override
    void fightAction() {
        System.out.println("Not available in novice level.");
    }
}
