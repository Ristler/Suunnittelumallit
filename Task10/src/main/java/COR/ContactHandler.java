package COR;

public class ContactHandler extends Handler {
    @Override
    public void process(Message message) {
        if(message.getType() == Message.MessageType.CONTACT_REQUEST) {
            System.out.println("[Contact requests] We can process this");
            System.out.println("Contact request by user "+ message.getEmail() + " has been forwarded to contact support.");
        } else {
            System.out.println("[Contact requests] We can't process this, sending to next handler.");
            super.process(message);
        }
    }
}
