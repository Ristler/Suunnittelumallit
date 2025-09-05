package State;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class State {
    private Machine machine;
    private ArrayList<String> options;
    private ReadyState readyState;


    protected Scanner scanner = new Scanner(System.in);
    protected Boolean running = true;


    public State(Machine machine) {

        this.machine = machine;
        this.options = new ArrayList<String>();

        options.add("Train");
        options.add("Change level");
    }
    public Machine getMachine() {
        return machine;
    }
    public ArrayList<String> getOptions() {
        return options;

    }
    public void addOption(String option) {
        if(!options.contains(option)) {
            options.add(1, option);
        }
    }
    public int getOptionsSize() {
        return options.size();
    }





    abstract void menuAction();
    abstract void trainAction();
    abstract void meditateAction();
    abstract void fightAction();
}
