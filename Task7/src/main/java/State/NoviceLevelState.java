package State;

import java.util.Scanner;

public class NoviceLevelState extends State {
    private Scanner scanner = new Scanner(System.in);
    private Boolean running = true;

    public NoviceLevelState(Machine machine) {
        super(machine);
    }


    @Override
    void menuAction() {
        System.out.println("Welcome to the novice level!");


        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                System.out.println("Training...");
                this.getMachine().operate("train");
                trainAction();
                break;
            case 2:
                this.getMachine().setState(getMachine().readyState);
                this.getMachine().operate("menu");
                break;
        }
    }

    @Override
    void trainAction() {
        System.out.println("Welcome to train your player! This is the novice level.");

        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Lift weights " +
                    "\n2. Exit");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    this.getMachine().readyState.returnPlayer().setExp(50);
                    System.out.println("You just lifted some trees off the ground!");

                        this.getMachine().readyState.loadLevels();


                    break;
                case 2:
                    this.menuAction();
            }

        }
    }

    @Override
    void meditateAction() {

    }

    @Override
    void fightAction() {

    }
}
