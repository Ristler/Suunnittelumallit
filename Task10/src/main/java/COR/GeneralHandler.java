package COR;

public class GeneralHandler extends Handler {
    @Override
    public void process(Message message) {
        if(message.getType() == Message.MessageType.GENERAL_FEEDBACK) {
            System.out.println("[General feedback] We can process this.");
            System.out.println("Feedback by user "+ message.getEmail() +
                    ":\n" + message.getMessageContent());
            System.out.println("[General feedback] Thanks for the feedback!");
        } else {
            System.out.println("[General feedback] We can't process this, sending to next handler.");
            super.process(message);
        }
    }
}
