package State;

import java.util.Random;

public class ExpertLevelState extends State {
    private Character player = this.getMachine().readyState.returnPlayer();

    private Random random = new Random();


    private int healthAdd = 20;
    private int currentHealth;
    int xp = 200;

    public ExpertLevelState(Machine machine) {
        super(machine);
    }

    @Override
    void menuAction() {

        this.addOption("Meditate");
        this.addOption("Fight");
        System.out.println("Welcome to the expert level!");


        switch (this.getMachine().readUserChoice(getOptions(), "level")) {
            case 1:
                this.getMachine().operate("train");
                break;

            case 2:
                this.getMachine().operate("fight");

            case 3:
                this.getMachine().operate("meditate");

            case 4:
                this.getMachine().setState(getMachine().readyState);
                this.getMachine().operate("menu");
                break;
        }
    }

    @Override
    void trainAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Practice throwing punches " +
                    "\n2. Go back");

            int choice = scanner.nextInt();

            switch(choice) {

                case 1:
                    player.setExp(xp);
                    System.out.println("Woah, you pack quite a punch!\nXP gained: "+xp+"\nYour total experience: "+player.getExp());
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
            System.out.println("1. Go for a spiritual walk " +
                    "\n2. Go back");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    if(player.getHealth() == 100) {
                        System.out.println("You are already refreshed!");
                    } else {
                        player.addHealth(healthAdd);
                        System.out.println("You are refreshed and somehow little bit wiser?\nHealth gained: "+healthAdd+"\nYour total health: "+player.getHealth());
                        break;
                    }
                case 2:
                    this.getMachine().operate("menu");
            }
        }
    }

    @Override
    void fightAction() {
        while(running) {
            System.out.println("Choose your option:");
            System.out.println("1. Enter fight match " +
                    "\n2. Go back");

            int choice = scanner.nextInt();
            currentHealth = player.getHealth();

            switch(choice) {
                case 1:
                    if(currentHealth > 0) {
                        int damage = random.nextInt(currentHealth + 1);
                        player.setExp(xp);
                        player.decHealth(damage);
                        System.out.println("That was one hell of a match.\n" +
                                "\nXP gained: " + xp +
                                "\nYour total experience: " + player.getExp()+
                                "\nHealth: "+ player.getHealth()+
                                "\nDamage taken: "+ damage);
                        this.getMachine().readyState.loadLevels();
                        break;
                    }else{
                        System.out.println("You do not have enough health to participate in a fight match.\nGo meditate!");
                    }

                case 2:
                    this.getMachine().operate("menu");
                    break;

                default:
                    System.out.println("Something weird happened..");



            }
        }
    }
}
