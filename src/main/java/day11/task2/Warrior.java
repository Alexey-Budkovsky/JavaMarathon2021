package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    //Конструктор
    public Warrior() {
        this.health = MAXIMUMHEALTH;
        this.physDef = 0.8;
        this.magicDef = 0;
        this.physAtt = 30;
        this.magicAtt = MINIMUMHEALTH;
    }

    // Сеттеры
    public void setHealth(int health) {
        this.health = health;
    }

    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    // Геттеры
    public int getHealth() {
        return health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    // Методы
    @Override
    public void physicalAttack(Hero hero) {
        int physicalAttack = (int) (hero.getHealth() + this.physAtt * hero.getPhysDef() - this.physAtt);
        if (physicalAttack > 100) physicalAttack = MAXIMUMHEALTH;
        if (physicalAttack < 0) physicalAttack = MINIMUMHEALTH;
        hero.setHealth(physicalAttack);
        System.out.println(hero);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
