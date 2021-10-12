package com.app.action;

import com.app.controller.PersonControllerImpl;
import javafx.event.Event;
import javafx.event.EventHandler;

public class Save2ButtonAction  implements EventHandler {
    @Override
    public void handle(Event event) {
        PersonControllerImpl.getInstance().saveToFile2();
    }
}
