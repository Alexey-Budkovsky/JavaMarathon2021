package day13;

import java.util.Date;

public class Message {
    //Поля
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    //Конструктор
    //Конструктор должен принимать 3 аргумента - отправителя, получателя и текст сообщения.
    //Также, конструктор должен назначать полю date текущее время (то есть время создания объекта Message).
    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = new Date();
    }

    //Геттеры на все поля
    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "\n FROM: \'" + sender + "\'\n" +
                " TO: \'" + receiver + "\'\n" +
                " ON: \'" + date + "\'\n \'"
                + text + "\'";

    }
}