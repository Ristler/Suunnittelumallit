package mediator;

import javafx.scene.control.TextArea;

public class User  {
    private final ChatRoom mediator;
    private String username;
    private TextArea chatBoxTextArea;

    public User(String username, ChatRoom mediator, TextArea textArea) {
        this.username = username;
        this.mediator = mediator;
        this.chatBoxTextArea = textArea;
        
    }
    public String getUsername() {
        return username;
    }
    public void sendMessage(String msg) {
        mediator.sendMessage(this, msg);
    }
    public void receiveMessage(User user, String msg) {
        chatBoxTextArea.appendText(user.getUsername() + ": " + msg + "\n");
    }
}
