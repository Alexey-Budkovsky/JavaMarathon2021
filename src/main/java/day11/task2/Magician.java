package day11.task2;

public class Magician extends Hero implements MagicAttack {
    //Магическая атака
    int magicAtt = 20;

    //Конструктор
    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 0.8;
    }

    // Методы
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
