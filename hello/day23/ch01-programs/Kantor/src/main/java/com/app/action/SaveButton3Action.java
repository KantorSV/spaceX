package com.app.action;

import com.app.conroller.PersonControllerImpl;
import javafx.event.Event;
import javafx.event.EventHandler;

public class SaveButton3Action implements EventHandler {


    @Override
    public void handle(Event event) {
        PersonControllerImpl.getInstance().saveToFile3();
    }
}
