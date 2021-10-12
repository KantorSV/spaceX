package com.app.action;

import com.app.conroller.PersonControllerImpl;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RemoveAllButtonAction implements EventHandler {

    private TableView tableView;

    public RemoveAllButtonAction(TableView tableView) {
        this.tableView = tableView;
    }

    @Override
    public void handle(Event event) {
        PersonControllerImpl.getInstance().deleteAll();
        tableView.getItems().clear();

    }
}
