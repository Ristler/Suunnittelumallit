package State;

import java.util.Random;

public class ExpertLevelState extends State {
    private Character player;

    private Random random = new Random();
    private int healthAdd = 20;
    private int currentHealth;
    int xp = 20;

    public ExpertLevelState(Machine machine) {
        super(machine);
        this.player =  this.getMachine().readyState.returnPlayer();
    }

    @Override
    void menuAction() {

        this.addOption("Meditate");
        this.addOption("Fight");
        System.out.println("Welcome to the expert level!");


        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                trainAction();
                break;

            case 2:
                fightAction();

            case 3:
                meditateAction();

            case 4:
                this.getMachine().setState(getMachine().readyState);
                break;
        }
    }

    @Override
    void trainAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Practice throwing punches " +
                    "\n2. Go back");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); // discard invalid input
            }
            int choice = scanner.nextInt(); // read validated int


            switch(choice) {

                case 1:
                    player.addExp(xp);
                    System.out.println("Woah, you pack quite a punch!\nXP gained: "+xp+"\nYour total experience: "+player.getExp());
                    break;
                case 2:
                    return;
            }
        }
    }

    @Override
    void meditateAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Go for a spiritual walk \n2. Go back");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
            }
            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    if(player.getHealth() == 100) {
                        System.out.println("You are already refreshed!");
                    } else {
                        player.addHealth(healthAdd);
                        System.out.println("You are refreshed and somehow a little bit wiser?\nHealth gained: " +
                                healthAdd + "\nYour total health: " + player.getHealth());
                    }
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Invalid option! Please choose 1 or 2.");
                    break;
            }
        }
    }
    @Override
    void fightAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Enter fight match " +
                    "\n2. Go back");

            int choice;

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
            }
            choice = scanner.nextInt();

            currentHealth = player.getHealth();

            switch(choice) {
                case 1:
                    if(currentHealth > 0) {
                        int damage = random.nextInt(currentHealth + 1);
                        player.addExp(xp);
                        player.decHealth(damage);
                        System.out.println("That was one hell of a match.\n" +
                                "\nXP gained: " + xp +
                                "\nYour total experience: " + player.getExp()+
                                "\nHealth: "+ player.getHealth()+
                                "\nDamage taken: "+ damage);
                    } else {
                        System.out.println("You do not have enough health to participate in a fight match.\nGo meditate!");
                    }
                    break;
                case 2:
                    menuAction();
                    return;

                default:
                    System.out.println("Something weird happened..");
                    break;
            }
        }
    }
}
