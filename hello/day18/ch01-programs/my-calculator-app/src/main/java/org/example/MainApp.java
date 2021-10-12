package org.example;

import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage)  {

        GridPane gridpane = new GridPane();

        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button bDot = new Button(".");
        Button resButton = new Button("=");


        TextField textField = new TextField();
        gridpane.add(textField, 0, 0, 4, 1);

        gridpane.add(b0, 0, 1);
        gridpane.add(b1, 1, 1);
        gridpane.add(b2, 2, 1);

        gridpane.add(b3, 0, 2);
        gridpane.add(b4, 1, 2);
        gridpane.add(b5, 2, 2);

        gridpane.add(b6, 0, 3);
        gridpane.add(b7, 1, 3);
        gridpane.add(b8, 2, 3);


        gridpane.add(b9, 0, 4);
        gridpane.add(bDot, 1, 4);
        gridpane.add(resButton, 2, 4);



        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");

        gridpane.add(addButton, 3, 1);
        gridpane.add(subtractButton, 3, 2);
        gridpane.add(multiplyButton, 3, 3);
        gridpane.add(divideButton, 3, 4);


        MyNumberListener myNumberListener = new MyNumberListener();
        myNumberListener.setTextField(textField);
        b0.setOnAction(myNumberListener);
        b1.setOnAction(myNumberListener);
        b2.setOnAction(myNumberListener);
        b3.setOnAction(myNumberListener);
        b4.setOnAction(myNumberListener);
        b5.setOnAction(myNumberListener);
        b6.setOnAction(myNumberListener);
        b7.setOnAction(myNumberListener);
        b8.setOnAction(myNumberListener);
        b9.setOnAction(myNumberListener);
        bDot.setOnAction(myNumberListener);


        addButton.setOnAction(myNumberListener);
        subtractButton.setOnAction(myNumberListener);
        multiplyButton.setOnAction(myNumberListener);
        divideButton.setOnAction(myNumberListener);

        ResultListener resultListener = new ResultListener();
        resultListener.setTextField(textField);
        resButton.setOnAction(resultListener);






        Scene scene = new Scene(gridpane);
        
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
