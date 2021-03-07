package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    // Поля для "лечения"
    private int healTeammate;
    private int healHimself;

    //Конструктор
    public Shaman() {
        this.health = MAXIMUMHEALTH;
        this.physDef = 20;
        this.magicDef = 20;
        this.physAtt = 10;
        this.magicAtt = 15;

        // Значения для "лечения"
        this.healTeammate = 30;
        this.healHimself = 50;
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
    public void healHimself() {
        int healHimself = this.health + this.healHimself;
        if (healHimself > 100) healHimself = MAXIMUMHEALTH;
        if (healHimself < 0) healHimself = MINIMUMHEALTH;
        this.health = healHimself;
        System.out.println(toString());
    }

    @Override
    public void healTeammate(Hero hero) {
        int healTeammate = hero.getHealth() + this.healTeammate;
        if (healTeammate > 100) healTeammate = MAXIMUMHEALTH;
        if (healTeammate < 0) healTeammate = MINIMUMHEALTH;
        hero.setHealth(healTeammate);
        System.out.println(hero);
    }

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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
