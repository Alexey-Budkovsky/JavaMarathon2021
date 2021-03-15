package day13;

import static day13.MessageDatabase.*;

public class Task1 {
    public static void main(String[] args) {
        //Необходимо создать трех пользователей
        User user1 = new User("Михаил");
        User user2 = new User("Алексей");
        User user3 = new User("Сергей");

        //Отправить 2 сообщения от пользователя 1 пользователю 2
        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Что нового?");

        //Отправить 3 сообщения от пользователя 2 пользователю 1
        user2.sendMessage(user1, "Привет, " + user1.getUsername() + "!");
        user2.sendMessage(user1, "Сижу, вот, программирую");
        user2.sendMessage(user1, "Пишу социальную сеть ;)");

        //Отправить 3 сообщения от пользователя 3 пользователю 1
        user3.sendMessage(user1, "Как дела?");
        user3.sendMessage(user1, "Кажется " + user2.getUsername() + " на кодера учится?");
        user3.sendMessage(user1, "Слышал что-нибудь?");

        //Отправить 3 сообщения от пользователя 1 пользователю 3
        user1.sendMessage(user3, "Ну, да");
        user1.sendMessage(user3, "Как раз недавно с ним списался");
        user1.sendMessage(user3, "Кодит социальную сеть");

        //Отправить 1 сообщение от пользователя 3 пользователю 1
        user3.sendMessage(user1, "Серьёзно! А какую сеть?");

        //Бонус
        user1.sendMessage(user3, "Ту в кторой мы сейчас с тобой общаемся =)");

        //Проверка
        System.out.println(getMessages());
        System.out.println();

        //Вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
        showDialog(user1, user3);


    }
}
