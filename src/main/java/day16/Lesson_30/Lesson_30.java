package day16.Lesson_30;

public class Lesson_30 {
    public static void main(String[] args) {
        float aFloat = (float) 13.2;
        long aLong = 1231231231L;

// Явное приведение типов
        int aInt = (int) aLong;
        System.out.println(aInt);

// Неявное приведение типов
        int bInt = 123;
        long bLong = bInt;
        System.out.println(bLong);

//        int a = 2147483647;
//        float b = a;            // от типа int к типу float
//        System.out.println(b);  // 2.14748365E9

        double aDouble = 123.45;
        int cInt = (int) aDouble;
        System.out.println(cInt);
        cInt = (int) Math.round(aDouble);
        System.out.println(Math.round(aDouble));
        System.out.println(cInt);

        // Урок 31: Классы-обертки примитивных типов данных


    }


}
