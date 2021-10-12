package org.example;

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StackPane centerPanel = new StackPane();
        GridPane gridPane = new GridPane();

        centerPanel.getChildren().add(gridPane);


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
        Button bRes = new Button("=");

        Button bAdd = new Button("+");
        Button bSubtract = new Button("-");
        Button bMultiply = new Button("*");
        Button bDivide = new Button("/");

        TextField textField = new TextField();
        gridPane.add(textField, 0, 0, 5, 1);

        gridPane.add(b7, 0, 1);
        gridPane.add(b8, 1, 1);
        gridPane.add(b9, 2, 1);
        gridPane.add(b4, 0, 2);
        gridPane.add(b5, 1, 2);
        gridPane.add(b6, 2, 2);
        gridPane.add(b1, 0, 3);
        gridPane.add(b2, 1, 3);
        gridPane.add(b3, 2, 3);

        gridPane.add(b0, 0, 4);
        gridPane.add(bDot, 1, 4);
        gridPane.add(bRes, 2, 4);

        gridPane.add(bAdd, 3, 1);
        gridPane.add(bSubtract, 3, 2);
        gridPane.add(bMultiply, 3, 3);
        gridPane.add(bDivide, 3, 4);

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
        bRes.setOnAction(myNumberListener);
        bAdd.setOnAction(myNumberListener);
        bSubtract.setOnAction(myNumberListener);
        bMultiply.setOnAction(myNumberListener);
        bDivide.setOnAction(myNumberListener);

        ResultListener resultListener = new ResultListener();
        resultListener.setTextField(textField);
        bRes.setOnAction(resultListener);

        Scene scene = new Scene(centerPanel);
        //scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("Kan-1987");
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
