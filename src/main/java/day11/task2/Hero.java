package day11.task2;

public abstract class Hero {
    public static final int MAXIMUMHEALTH = 100;
    public static final int MINIMUMHEALTH = 0;
    private int health;
    private double physDef;
    private double magicDef;
    private int physAtt;
    private int magicAtt;


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

}
