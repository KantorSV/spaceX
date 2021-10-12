package com.app.action;

import com.app.conroller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.awt.*;

public class EditButtonAction implements EventHandler {

    private TextField nameTextField;
    private TextField ageTextField;
    private  TextField phoneTextField;
    private TableView tableView;

    public EditButtonAction(TextField nameTextField, TextField ageTextField, TextField phoneTextField, TableView tableView) {
        this.nameTextField = nameTextField;
        this.ageTextField = ageTextField;
        this.phoneTextField = phoneTextField;
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        String name = nameTextField.getText();
        int age = Integer.parseInt(ageTextField.getText());
        String phone = phoneTextField.getText();

        Person candidate = new Person(name, age, phone);
        int id = tableView.getSelectionModel().getSelectedIndex();

        PersonControllerImpl.getInstance().update(id, candidate);

        tableView.getItems().remove(id);
        tableView.getItems().add(candidate);

    }
}
