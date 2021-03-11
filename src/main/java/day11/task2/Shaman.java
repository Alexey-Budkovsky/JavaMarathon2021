package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {
    // Поля
    static final int HEAL_TEAMMATE = 30;
    static final int HEAL_HIMSELF = 50;
    int magicAtt = 15;

    //Конструктор
    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
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
    public void magicalAttack(Hero hero) {
        int magicalAttack = (int) (hero.health + magicAtt * hero.magicDef - magicAtt);
        if (magicalAttack > 100) magicalAttack = MAXIMUMHEALTH;
        if (magicalAttack < 0) magicalAttack = MINIMUMHEALTH;
        hero.health = magicalAttack;
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
