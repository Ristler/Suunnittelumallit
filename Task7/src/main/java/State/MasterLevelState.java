package State;

public class MasterLevelState extends State {

    public MasterLevelState(Machine machine) {
        super(machine);
    }

    @Override
    void menuAction() {
        System.out.println("You won the game!");
        System.exit(0);

    }

    @Override
    void trainAction() {

    }

    @Override
    void meditateAction() {

    }

    @Override
    void fightAction() {

    }
}
