package day13;

import java.util.ArrayList;
import java.util.List;
import static day13.MessageDatabase.*;

public class User{
    //Поля
    private String username;
    //В этом списке должны храниться те пользователи, на которых подписан пользователь
    private List<User> subscriptions;

    //Конструктор
    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    //Геттеры
    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    //Методы
    //подписывает пользователя на пользователя user
    public void subscribe(User user) {
        subscriptions.add(user);
    }

    //возвращает True, если пользователь подписан на пользователя user и False, если не подписан
    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user))
            return true;
        else
            return false;
    }

    //возвращает True, если пользователь user является другом
    //и False, если пользователь user не является другом
    public boolean isFriend(User user) {
        if (user.isSubscribed(this) && isSubscribed(user))
            return true;
        else
            return false;
    }

    //Отправляет сообщение с текстом text пользователю user.
    //Здесь должен использоваться статический метод из MessageDatabase
    public void sendMessage(User user, String text) {
        addNewMessage(this,user,text);
    }

    //toString
    //Возвращает строковое представление пользователя (имя пользователя)
    @Override
    public String toString() {
        return username;
    }
}
