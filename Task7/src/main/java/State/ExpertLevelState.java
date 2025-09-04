package State;

public class ExpertLevelState extends State {

    public ExpertLevelState(Machine machine) {
        super(machine);
    }

    @Override
    void menuAction() {
        System.out.println("Not available");
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
