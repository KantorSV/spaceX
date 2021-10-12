package com.app.action;

import com.app.controller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class LoadButtonAction  implements EventHandler {
    private TableView tableView;

    public LoadButtonAction(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        PersonControllerImpl.getInstance().deleteAll();
        tableView.getItems().clear();
        PersonControllerImpl.getInstance().loadFromFile();
        ArrayList persons = PersonControllerImpl.getInstance().readAll();
        for(int i=0;i<persons.size();i++){
            Person person = (Person) persons.get(i);
            tableView.getItems().add(person);
        }

        //System.out.println("PersonControllerImpl.getInstance().read(0)="+PersonControllerImpl.getInstance().read(0));
        //System.out.println("PersonControllerImpl.getInstance().read(1)="+PersonControllerImpl.getInstance().read(1));
    }
}
