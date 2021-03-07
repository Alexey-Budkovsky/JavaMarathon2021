package day11.task2;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    //Конструктор
    public Magician() {
        this.health = MAXIMUMHEALTH;
        this.physDef = MINIMUMHEALTH;
        this.magicDef = 0.8;
        this.physAtt = 5;
        this.magicAtt = 20;
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
    public void magicalAttack(Hero hero) {
        int magicalAttack = (int) (hero.getHealth() + this.magicAtt * hero.getMagicDef() - this.magicAtt);
        if (magicalAttack > 100) magicalAttack = MAXIMUMHEALTH;
        if (magicalAttack < 0) magicalAttack = MINIMUMHEALTH;
        hero.setHealth(magicalAttack);
        System.out.println(hero);
    }

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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
