package State;

import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
    private static Scanner scanner = new Scanner(System.in);
    private State state;

    //VAIHDA PRIVATE, JA TEE GETTER EHK
    protected ReadyState readyState = new ReadyState(this);

    //private boolean running;

    public Machine() {
        state = readyState;
    }
    public void operate(String menuLocation) {

        while(true) {
            if(state == null) {
                System.out.println("Machine out of order");
                return;
            }

            switch(menuLocation) {
                case "menu":
                    state.menuAction();
                    break;

                case "train":
                    state.trainAction();
                    break;
            }
        }
    }
    public int readUserChoice(ArrayList<String> choices, String menu) {
        // print options
        if (menu.equals("starting")) {
            System.out.println(" \nAvailable levels: \n");
        } else if (menu.equals("level")) {
            System.out.println(" \nSelect game mode: \n");
        }
        for (int i = 1; i <= choices.size(); i++) {
            System.out.println(i + ". " + choices.get(i - 1));
        }
        // read user input
        return scanner.nextInt();

    }

    public void setState(State state) {
        this.state = state;
    }
}
