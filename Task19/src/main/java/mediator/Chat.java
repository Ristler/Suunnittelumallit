package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements ChatRoom {
    private List<User> users;

    public Chat() {
        this.users = new ArrayList<User>();
    }
    public void addUser(User user) {
        users.add(user);
    }
    @Override
    public void sendMessage(User sender, String message) {
        System.out.println("I am here");
        for (User user : users) {
                user.receiveMessage(sender, message);
        }
    }
}
