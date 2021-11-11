package org.example;

import com.app.ChatMessage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {

    @FXML
    private TextField messageField;
    @FXML
    private TextArea textArea;

    @FXML
    private void buttonSend(ActionEvent event) {
        String message = messageField.getText();
        messageField.setText("");
        long timestamp = System.currentTimeMillis();
        String userName = Utils.userName;

        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setUserName(userName);
        chatMessage.setText(message);
        chatMessage.setTimeStamp(timestamp);
        try {
            OutputStream out = Utils.socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(chatMessage);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Utils.textArea=textArea;
    }


}
