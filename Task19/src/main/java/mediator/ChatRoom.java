package mediator;

import javafx.collections.ObservableList;

import java.util.List;

public interface ChatRoom {
    void sendMessage(User sender, String message);
    void sendMessageToUser(User sender, User recipient, String message);
    ObservableList<User> getUsers();
    void addUser(User user);
}
