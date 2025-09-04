package State;

public class IntermediateLevelState extends State {

    public IntermediateLevelState(Machine machine) {
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
