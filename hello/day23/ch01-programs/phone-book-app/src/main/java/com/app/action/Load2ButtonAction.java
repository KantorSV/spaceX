package com.app.action;

import com.app.controller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;

import java.util.ArrayList;


public class Load2ButtonAction implements EventHandler {
    private TableView tableView;

    public Load2ButtonAction(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        PersonControllerImpl.getInstance().deleteAll();
        tableView.getItems().clear();
        PersonControllerImpl.getInstance().loadFromFile2();
        ArrayList persons = PersonControllerImpl.getInstance().readAll();
        for(int i=0;i<persons.size();i++){
            Person person = (Person) persons.get(i);
            tableView.getItems().add(person);
        }
    }
}
