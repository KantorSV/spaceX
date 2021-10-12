package com.app.action;

import com.app.conroller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CreateButtonAction implements EventHandler {

    private TextField nameTextField;
    private TextField ageTextField;
    private TextField phoneTextField;
    private TableView tableView;

    public CreateButtonAction(TextField nameTextField, TextField ageTextField, TextField phoneTextField, TableView tableView) {
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
        Person person = new Person(name, age, phone);

        nameTextField.setText("");
        ageTextField.setText("");
        phoneTextField.setText("");

        tableView.getItems().add(person);

        PersonControllerImpl personControllerImpl = PersonControllerImpl.getInstance();
        personControllerImpl.create(person);


    }
}
