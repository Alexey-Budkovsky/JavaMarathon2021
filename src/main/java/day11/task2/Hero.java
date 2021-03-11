package day11.task2;

public abstract class Hero implements PhysAttack {
    //Поля
    public static final int MAXIMUMHEALTH = 100;
    public static final int MINIMUMHEALTH = 0;
    int health;
    int physAtt;
    double physDef;
    double magicDef;

    //Конструктор
    public Hero() {
        health = MAXIMUMHEALTH;
    }

    // Методы
    @Override
    public void physicalAttack(Hero hero) {
        int physicalAttack = (int) (hero.health + physAtt * hero.physDef - physAtt);
        if (physicalAttack > 100) physicalAttack = MAXIMUMHEALTH;
        if (physicalAttack < 0) physicalAttack = MINIMUMHEALTH;
        hero.health = physicalAttack;
        System.out.println(hero);
    }


}
