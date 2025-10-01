package mediator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui extends Application {

    private static ChatRoom mediator;

    public static void setMediator(ChatRoom m) {
        mediator = m;
    }

    @Override
    public void start(Stage userCreation) throws Exception {
        VBox vBox = new VBox();
        TextField usernameField = new TextField();
        Button createUserButton = new Button("Create user");
        Button closeCreationButton = new Button("Close user creation");
        vBox.getChildren().addAll(usernameField, createUserButton, closeCreationButton);
        Scene createUser = new Scene(vBox, 200, 200);
        userCreation.setScene(createUser);
        userCreation.show();
        userCreation.setTitle("Create user");

        createUserButton.setOnAction(event -> {
            try {
                chatBox(usernameField.getText());
                usernameField.clear();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        closeCreationButton.setOnAction(event -> {
            try {
                userCreation.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void chatBox(String username) throws Exception {
        ComboBox<User> userDropDown = new ComboBox<>();
        userDropDown.setItems(mediator.getUsers());
        TextArea textArea = new TextArea();
        User user = new User(username, mediator, textArea);
        mediator.addUser(user);

        Stage chatBox = new Stage();
        chatBox.setTitle(user.getUsername());
        BorderPane borderPane = new BorderPane();

        TextField message = new TextField();
        Button sendButton = new Button();

        sendButton.setText("Send message to everyone");

        borderPane.setBottom(sendButton);
        borderPane.setCenter(message);
        borderPane.setTop(textArea);
        borderPane.setRight(userDropDown);

        Scene createUser = new Scene(borderPane, 300, 300);
        chatBox.setScene(createUser);
        chatBox.show();

        sendButton.setOnAction(event -> {
            try {
                User selectedUser = userDropDown.getValue();
                String msg = message.getText();

                if (msg.isEmpty()) return;

                if (selectedUser == null) {
                    user.sendMessage(msg);
                } else {
                    user.sendMessageToUser(msg, selectedUser);
                }
                message.clear();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        userDropDown.setOnAction(event -> {
            sendButton.setText("Send message to "+ userDropDown.getValue().getUsername());
        });
    }
}
