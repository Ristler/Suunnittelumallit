package State;

public class IntermediateLevelState extends State {

    private Character player;
    private int healthAdd = 5;
    int xp = 10;


    public IntermediateLevelState(Machine machine) {
        super(machine);
        this.player = this.getMachine().readyState.returnPlayer();
    }

    @Override
    void menuAction() {

        this.addOption("Meditate");
        System.out.println("Welcome to the intermediate level!");


        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                trainAction();
                break;

            case 2:
                meditateAction();
                break;

            case 3:
                this.getMachine().setState(getMachine().readyState);
                break;
        }
    }

    @Override
    void trainAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Lift rocks \n2. Go back");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); // discard invalid input
            }
            int choice = scanner.nextInt(); // read validated int

            switch(choice) {
                case 1:
                    player.addExp(xp);
                    System.out.println("You just lifted some heavy rocks!\nXP gained: " + xp +
                            "\nYour total experience: " + player.getExp());
                    break;
                case 2:
                    return; // go back to menu
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }


    @Override
    void meditateAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Go lay down in the forest\n2. Go back");

            int choice;

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    if(player.getHealth() == 100) {
                        System.out.println("You are already refreshed!");
                    } else {
                        player.addHealth(healthAdd);
                        System.out.println("You meditated and now feel refreshed!\nHealth gained: "+healthAdd+"\nYour total health: "+player.getHealth());
                    }
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }
        }
    }

    @Override
    void fightAction() {
        System.out.println("Not available in intermediate level.");

    }
}
