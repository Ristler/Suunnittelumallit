package State;


public class NoviceLevelState extends State {
    int xp = 5;
    private Character player;



    public NoviceLevelState(Machine machine) {
        super(machine);
        this.player = this.getMachine().readyState.returnPlayer();

    }


    @Override
    void menuAction() {
        System.out.println("Welcome to the novice level!");
        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                trainAction();
                break;
            case 2:
                this.getMachine().setState(getMachine().readyState);
                return;
        }
    }

    @Override
    void trainAction() {
        System.out.println("Welcome to the novice level.");

        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Lift trees " +
                    "\n2. Exit");

            int choice;

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    player.addExp(xp);
                    System.out.println("You just lifted some trees off the ground!\nXP gained: "+xp+"\nYour total experience: "+player.getExp());
                    break;
                case 2:
                    return;

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
