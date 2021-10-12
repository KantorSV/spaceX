package com.app.action;

import com.app.conroller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class LoadButton3Action implements EventHandler {
    private TableView tableView;

    public LoadButton3Action(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        PersonControllerImpl.getInstance().deleteAll();
        tableView.getItems().clear();
        PersonControllerImpl.getInstance().loadFromFile3();
        ArrayList persons = PersonControllerImpl.getInstance().readAll();
        for (int i = 0;i < persons.size();i++){
            Person person = (Person) persons.get(i);
            tableView.getItems().add(person);
        }

    }
}
