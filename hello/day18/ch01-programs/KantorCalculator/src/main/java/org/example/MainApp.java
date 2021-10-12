package org.example;

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();

        Button b000 = new Button("000");
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

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");


        TextField textField = new TextField();

        gridPane.add(textField, 0, 0, 5, 1);

        gridPane.add(b000, 4, 4);
        gridPane.add(b0, 0, 4);
        gridPane.add(b1, 0, 3);
        gridPane.add(b2, 1, 3);
        gridPane.add(b3, 2, 3);
        gridPane.add(b4, 0, 2);
        gridPane.add(b5, 1, 2);
        gridPane.add(b6, 2, 2);
        gridPane.add(b7, 0, 1);
        gridPane.add(b8, 1, 1);
        gridPane.add(b9, 2, 1);
        gridPane.add(bDot, 1, 4);
        gridPane.add(resButton, 2, 4);

        gridPane.add(addButton, 5, 1);
        gridPane.add(subtractButton, 5, 2);
        gridPane.add(multiplyButton, 5, 3);
        gridPane.add(divideButton, 5, 4);

        MyNumberListener myNumberListener = new MyNumberListener();
        myNumberListener.setTextField(textField);

        b0.setOnAction(myNumberListener);
        b000.setOnAction(myNumberListener);
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
        resButton.setOnAction(myNumberListener);
        addButton.setOnAction(myNumberListener);
        subtractButton.setOnAction(myNumberListener);
        multiplyButton.setOnAction(myNumberListener);
        divideButton.setOnAction(myNumberListener);

        ResultListener resultListener = new ResultListener();
        resultListener.setTextField(textField);
        resButton.setOnAction(resultListener);

        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("KANTOR Electronics");
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
