package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root);

        Label portLabel = new Label("Port");
        Label hostLabel = new Label("Host");
        Label nameLabel = new Label("Name");

        TextField portField = new TextField("enter your port");
        TextField hostField = new TextField("enter your host");
        TextField nameField = new TextField("enter your name");

        Button connectButton = new Button("CONNECT");

        stage.setTitle("CHAT");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
