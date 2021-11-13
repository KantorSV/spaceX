package org.example;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyNumberListener implements EventHandler {

    private TextField textField;

    @Override
    public void handle(Event event) {
        Button button = (Button) event.getSource();
        String textButton = button.getText();
        String currentText = textField.getText();
        textField.setText(currentText + textButton);

    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }
}
