package org.example;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

import com.app.ServerThread;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.xml.soap.Text;

public class FXMLController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField nameField;
    @FXML
    private TextField portField;
    @FXML
    private TextField hostField;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            String userName = nameField.getText();
            Utils.userName = userName;
            String host = hostField.getText();
            int port = Integer.parseInt(portField.getText());
            Socket socket = new Socket(InetAddress.getByName(host), port);
            Utils.socket = socket;
            ServerThread serverThread = new ServerThread(socket);
            serverThread.start();


            Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene2.fxml"));

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch(Exception ex){
            Utils.showError(ex);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
