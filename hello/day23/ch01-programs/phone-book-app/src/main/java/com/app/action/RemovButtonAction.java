package com.app.action;

import com.app.controller.PersonControllerImpl;
import com.app.model.Person;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RemovButtonAction implements EventHandler {
    private TableView tableView;

    public RemovButtonAction(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        int id = tableView.getSelectionModel().getSelectedIndex();
        tableView.getItems().remove(id);
        PersonControllerImpl.getInstance().delete(id);

    }
}
