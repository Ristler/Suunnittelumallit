package mediator;

public interface ChatRoom {
    void sendMessage(User sender, String message);
    void addUser(User user);
}
