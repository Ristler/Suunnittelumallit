package State;

import java.util.ArrayList;
import java.util.Scanner;

public class Machine {
    private static Scanner scanner = new Scanner(System.in);
    private State state;

    //VAIHDA PRIVATE, JA TEE GETTER EHK
    protected ReadyState readyState = new ReadyState(this);


    public Machine() {
        state = readyState;
    }
    public void operate() {
        while (true) {
            if (state == null) {
                // should never happen
                System.out.println("Machine out of order");
                return;
            }
            state.menuAction();
        }
    }
    public int readUserChoice(ArrayList<String> choices, String menu) {
        if (menu.equals("starting")) {
            System.out.println("\nAvailable levels:\n");
        } else if (menu.equals("level")) {
            System.out.println("\nSelect option:\n");
        }

        for (int i = 1; i <= choices.size(); i++) {
            System.out.println(i + ". " + choices.get(i - 1));
        }
        int choice = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= choices.size()) {
                    break; // valid input
                } else {
                    System.out.println("Invalid choice. Enter a number between 1 and " + choices.size());
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
        return choice;
    }

    public void setState(State state) {
        this.state = state;
    }
}
