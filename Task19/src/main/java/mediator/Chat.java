package mediator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Chat implements ChatRoom {
    private ObservableList<User> users;

    public Chat() {
        this.users = FXCollections.observableArrayList();
    }
    @Override
    public void addUser(User user) {
        users.add(user);
    }
    @Override
    public ObservableList<User> getUsers() {
        return users;
    }
    @Override
    public void sendMessage(User sender, String message) {
        for (User user : users) {
                user.receiveMessage(sender, message);
        }
    }

    @Override
    public void sendMessageToUser(User sender, User recipient, String message) {
        recipient.receiveMessage(sender, message);
    }
}
