package org.example;

import com.app.client.ServerConnector;
import com.app.client.Utils;
import com.chat.tcp.common.ChatMessage;
import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.InetAddress;
import java.net.Socket;


public class MainApp extends Application {

    private String userName;
    private ServerConnector connector;

    //  1 window
    @Override
    public void start(final Stage stage) throws Exception {
        final VBox root = new VBox();
        final Scene scene = new Scene(root);

        Label usernameLabel = new Label("Username");
        final TextField usernameField = new TextField();

        Label hostLabel = new Label("Host");
        final TextField hostField = new TextField("138.68.149.71");

        Label portLabel = new Label("Port");
        final TextField portField = new TextField("1234");

        final Button connectButton = new Button("Connect");

        //  2 window

        final TextArea messagesArea = new TextArea();
        messagesArea.setEditable(false);
        final TextField userMessageField = new TextField();
        final Button sendButton = new Button("Send");

        connectButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {

                    String host = hostField.getText();
                    int port = Integer.parseInt(portField.getText());
                    userName = usernameField.getText();
                    Socket socket = new Socket(InetAddress.getByName(host), port);

                    root.getChildren().clear();
                    root.getChildren().addAll(messagesArea, userMessageField, sendButton);

                    connector = new ServerConnector(socket);
                    connector.setTextArea(messagesArea);
                    connector.startWorking();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String userMessage = userMessageField.getText();
                ChatMessage chatMessage = Utils.createMessage(userMessage, userName);
                connector.writeMessage(chatMessage);
                userMessageField.setText("");

            }
        });

        root.getChildren().addAll(usernameLabel, usernameField);
        root.getChildren().addAll(hostLabel, hostField);
        root.getChildren().addAll(portLabel, portField);
        root.getChildren().addAll(connectButton);

        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
