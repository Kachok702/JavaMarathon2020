package day13;

import java.util.Date;

public class Message {        // Сообщение
    private User sender;   // отправитель
    private User receiver;  // получатель
   private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "FROM: " + this.sender + "\n" +
                "TO: " + receiver + "\n" +
                "ON: " + date + "\n" +
                text + "\n";
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
