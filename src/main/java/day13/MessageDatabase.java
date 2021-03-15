package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    //Поля
    public static List<Message> messages = new ArrayList<>();

    //Методы
    //Этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
    //Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void addNewMessage(User u1, User u2, String text) {
        Message mes = new Message(u1, u2, text);
        messages.add(mes);
    }

    //Возвращает список всех сообщений в “базе данных”.
    public static List<Message> getMessages() {
        return messages;
    }

    //Этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2.
    public static void showDialog(User u1, User u2) {
        for (Message m :
                messages) {
            if (m.getSender() == u1 && m.getReceiver() == u2)
                System.out.printf("%s: %s\n", u1.getUsername(), m.getText());
            else if (m.getSender() == u2 && m.getReceiver() == u1)
                System.out.printf("%s: %s\n", u2.getUsername(), m.getText());
            else continue;
        }

    }

}
