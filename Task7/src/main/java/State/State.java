package State;

import java.util.ArrayList;

public abstract class State {
    private Machine machine;
    private ArrayList<String> options;
    private ReadyState readyState;



    public State(Machine machine) {

        this.machine = machine;
        this.options = new ArrayList<String>();

        options.add("Train");
        //options.add("Meditate");
        //options.add("Fight");
        options.add("Change level");
    }
    public Machine getMachine() {
        return machine;
    }
    public ArrayList<String> getOptions() {
        return options;

    }


    abstract void menuAction();
    abstract void trainAction();
    abstract void meditateAction();
    abstract void fightAction();
}
