package com.app.action;

import com.app.controller.PersonControllerImpl;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;

public class RemoveAllButtonAction implements EventHandler {
    private TableView tableView;

    public RemoveAllButtonAction(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        tableView.getItems().clear();
        PersonControllerImpl.getInstance().deleteAll();
    }
}
