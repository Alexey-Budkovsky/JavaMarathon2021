package day11.task2;

public class Paladin extends Hero implements Healer {
    // Поля для "лечения"
    static final int HEAL_TEAMMATE = 10;
    static final int HEAL_HIMSELF = 25;

    //Конструктор
    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    // Методы
    @Override
    public void healHimself() {
        int healHimself = health + HEAL_HIMSELF;
        if (healHimself > 100) healHimself = MAXIMUMHEALTH;
        if (healHimself < 0) healHimself = MINIMUMHEALTH;
        health = healHimself;
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        int healTeammate = hero.health + HEAL_TEAMMATE;
        if (healTeammate > 100) healTeammate = MAXIMUMHEALTH;
        if (healTeammate < 0) healTeammate = MINIMUMHEALTH;
        hero.health = healTeammate;
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + this.health +
                '}';
    }

}
