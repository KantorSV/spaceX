package com.chat.tcp.common;


public interface Connector {

    public void writeMessage(ChatMessage chatMessage);

    public ChatMessage readMessage();

    public void startWorking();

}
