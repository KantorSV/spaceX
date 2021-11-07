package com.chat.tcp.common;

public class ChatMessage {

    private String message;
    private String userName;
    private long timeStamp;

    public ChatMessage(String message, String userName, long timeStamp) {
        this.message = message;
        this.userName = userName;
        this.timeStamp = timeStamp;
    }

    public ChatMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "message='" + message + '\'' +
                ", userName='" + userName + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
