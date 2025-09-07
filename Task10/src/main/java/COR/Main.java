package COR;

public class Main {
    public static void main(String[] args) {

        Handler primaryHandler;

        Handler compensationHandler = new CompensationHandler();
        Handler contactHandler = new ContactHandler();
        Handler developmentHandler = new DevelopmentHandler();
        Handler generalHandler = new GeneralHandler();

        compensationHandler.setNextHandler(contactHandler);
        contactHandler.setNextHandler(developmentHandler);
        developmentHandler.setNextHandler(generalHandler);

        primaryHandler = compensationHandler;

        Message compensationMessage = new Message("I need a compensation!", "customer@help.com", Message.MessageType.COMPENSATION_CLAIM);
        Message contactMessage = new Message("I need you to contact me", "customer@help.com", Message.MessageType.CONTACT_REQUEST);
        Message developmentMessage = new Message("The app needs to be responsive, mobile ui is broken :(", "customer@help.com", Message.MessageType.DEVELOPMENT_SUGGESTION);
        Message generalMessage = new Message("Great app tysm", "customer@help.com", Message.MessageType.GENERAL_FEEDBACK);

        primaryHandler.process(generalMessage);



    }
}
