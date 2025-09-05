package State;

public class ReadyState extends State {
    private boolean gameStarted = false;
    private Character player;


    public ReadyState(Machine machine) {
        super(machine);
    }

    public Character returnPlayer() {
        return player;
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

        System.out.println("Name: "+ player.getName()+
                "\nExperience: "+player.getExp()+
                "\nHealth: "+ player.getHealth()+
                "\nLevel: "+ player.getPlayerLevel());

        loadLevels();

        switch (this.getMachine().readUserChoice(player.getLevels(), "starting")) {

            case 1:
                System.out.println("Novice level selected.");
                this.getMachine().setState(new NoviceLevelState(this.getMachine()));
                break;
            case 2:
                if(player.getPlayerLevel() >= 1) {
                    System.out.println("Intermediate level selected.");
                    this.getMachine().setState(new IntermediateLevelState(this.getMachine()));

                }
                break;
            case 3:
                if(player.getPlayerLevel() >= 2) {
                    System.out.println("Expert level selected.");
                    this.getMachine().setState(new ExpertLevelState(this.getMachine()));
                }
                break;

            case 4:
                if(player.getPlayerLevel() >= 3) {
                    System.out.println("Master level selected.");
                    this.getMachine().setState(new MasterLevelState(this.getMachine()));
                }
                break;
            default:
                System.out.println("No such option available.");
                break;
        }
    }
    public void loadLevels() {
        if(player.getPlayerLevel() >= 1) {
            player.addLevel("Intermediate level");
        }
        if (player.getPlayerLevel() >= 2) {
            player.addLevel("Expert level");
        }
        if(player.getPlayerLevel() >= 3) {
            player.addLevel("Master level");
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
