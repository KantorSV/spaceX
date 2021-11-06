package com.app.client;

import com.chat.tcp.common.ChatConnector;
import com.chat.tcp.common.ChatMessage;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.net.Socket;

public class ServerConnector extends ChatConnector {
    private TextArea textArea;

    public ServerConnector(Socket socket) {
        super(socket);
    }

    public void setTextArea(TextArea textArea){
        this.textArea=textArea;
    }

    @Override
    public void processChatMessage(ChatMessage chatMessage) {
        System.out.println("Got message from server: "+chatMessage);
        String result = Utils.createText(chatMessage);
        textArea.appendText("\n"+result);
    }
}
