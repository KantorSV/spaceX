package com.app.action;

import com.app.conroller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RemoveButtonAction implements EventHandler {

    private TableView tableView;

    public RemoveButtonAction(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        int id = tableView.getSelectionModel().getSelectedIndex();
        PersonControllerImpl.getInstance().delete(id);
        tableView.getItems().remove(id);
    }
}
