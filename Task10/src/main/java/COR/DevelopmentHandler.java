package COR;

import java.util.ArrayList;

public class DevelopmentHandler extends Handler {
    private ArrayList<Message> developmentSuggestions = new ArrayList<Message>();

    @Override
    public void process(Message message) {
        if(message.getType() == Message.MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("[Development suggestions] We can process this.");
            developmentSuggestions.add(message);
            System.out.println("Development suggestion has been saved!");

        } else {
            System.out.println("[Development suggestions] We can't process this, sending to next handler.");            super.process(message);
        }
    }
    public void getDevelopmentSuggestions() {
        for(Message msg : developmentSuggestions) {
            System.out.println("Development suggestion: "+msg.getMessageContent()+
                    "\nBy user: "+ msg.getEmail());
        }
    }
}
