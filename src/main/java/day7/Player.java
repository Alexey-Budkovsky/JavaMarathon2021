package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    // Конструктор
    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) countPlayers = 6;
    }

    // Геттеры
    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    // Методы
    public void run() {
        stamina--;
        if (stamina == 0) countPlayers--;
        if (stamina < 0) stamina = MIN_STAMINA;

    }

    public static void info() {
        String caseWord = "";
        switch (countPlayers) {
            case 1:
            case 6:
                caseWord = "свободных мест";
                break;
            case 5:
                caseWord = "свободное место";
                break;
            default:
                caseWord = "свободных места";
        }

        if (countPlayers < 6)
            System.out.printf("Команды неполные. На поле еще есть %d %s.\n", 6 - countPlayers, caseWord);
        else System.out.printf("На поле нет %s.\n", caseWord);
    }
}
