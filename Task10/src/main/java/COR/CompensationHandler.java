package COR;

import java.util.Scanner;

public class CompensationHandler extends Handler {


    Scanner scanner = new Scanner(System.in);


    @Override
    public void process(Message message) {
        if(message.getType() == Message.MessageType.COMPENSATION_CLAIM) {
            System.out.println("[Compensation claims] We can process this.\n");
            System.out.println("Customer compensation claim: "+ message.getMessageContent()+
                    "\nBy user: "+ message.getEmail());
            System.out.println("Compensate(1) Don't compensate(2)");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Customer compensated!");
                    break;
                case 2:
                    System.out.println("Customer will not be compensated.");
            }


        } else {
            System.out.println("[Compensation claims] We can't process this, sending to next handler.");
            super.process(message);
        }
    }
}
