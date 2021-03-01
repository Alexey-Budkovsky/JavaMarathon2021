package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(101 - 90) + 90);
        Player player2 = new Player(random.nextInt(101 - 90) + 90);
        Player player3 = new Player(random.nextInt(101 - 90) + 90);
        Player player4 = new Player(random.nextInt(101 - 90) + 90);
        Player player5 = new Player(random.nextInt(101 - 90) + 90);
        Player player6 = new Player(random.nextInt(101 - 90) + 90);
        Player player7 = new Player(random.nextInt(101 - 90) + 90);
//        Player player8 = new Player(random.nextInt(101 - 90) + 90);

//        System.out.println(Player.getCountPlayers());


        for (int i = 0; i < random.nextInt(101 - 90) + 90; i++) {
            player1.run();
            if (player1.getStamina() == 0) break; // Исправил. Видео решения ещё не смотрел
        }

        //Проверка
//        System.out.println(player1.getStamina());

//        for (int i = 0; i < random.nextInt(101 - 90) + 90; i++) {
//            player2.run();
//            if (player2.getStamina() == 0) break;
//        }
//        for (int i = 0; i < random.nextInt(101 - 90) + 90; i++) {
//            player3.run();
//            if (player3.getStamina() == 0) break;
//        }
//        for (int i = 0; i < random.nextInt(101 - 90) + 90; i++) {
//            player4.run();
//            if (player4.getStamina() == 0) break;
//        }
//        for (int i = 0; i < random.nextInt(101 - 90) + 90; i++) {
//            player5.run();
//            if (player5.getStamina() == 0) break;
//        }
//        for (int i = 0; i < random.nextInt(101 - 90) + 90; i++) {
//            player6.run();
//            if (player6.getStamina() == 0) break;
//        }

        Player.info();

    }
}
