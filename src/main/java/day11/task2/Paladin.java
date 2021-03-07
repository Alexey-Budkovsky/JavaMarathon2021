package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack {
    protected int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;

    // Поля для "лечения"
    private int healTeammate;
    private int healHimself;

    //Конструктор
    public Paladin() {
        this.health = MAXIMUMHEALTH;
        this.physDef = 0.5;
        this.magicDef = 0.2;
        this.physAtt = 15;
        this.magicAtt = MINIMUMHEALTH;

        // Значения для "лечения"
        this.healTeammate = 10;
        this.healHimself = 25;
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
        if (healHimself < 0) healHimself  = MINIMUMHEALTH;
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
    public void physicalAttack(Hero hero) {
        int physicalAttack = (int) (hero.getHealth() + this.physAtt * hero.getPhysDef() - this.physAtt);
        if (physicalAttack > 100) physicalAttack = MAXIMUMHEALTH;
        if (physicalAttack < 0) physicalAttack = MINIMUMHEALTH;
        hero.setHealth(physicalAttack);
        System.out.println(hero);

    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + this.health +
                '}';
    }

}
