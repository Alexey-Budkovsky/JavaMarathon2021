package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    //Конструктор
    public Warrior() {
        this.physAtt = 30;
        this.physDef = 0.8;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
