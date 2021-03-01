package day8;

public class Task1 {
    public static void main(String[] args) {
//        Конкатинация
        String stringPlus = "";

        long start1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            if (i == 20000) stringPlus += i + ".";
            else stringPlus += i + " ";
        }
        System.out.println(stringPlus);

        long finish1 = System.currentTimeMillis();
        long timeConcatenation = finish1 - start1;

        System.out.println();
        System.out.println();

//        StringBuilder
        StringBuilder stringBuild = new StringBuilder();

        long start2 = System.currentTimeMillis();

        for (int j = 0; j <= 20000; j++) {
            if (j == 20000) stringBuild.append(j).append(".");
            else stringBuild.append(j).append(" ");
        }
        System.out.println(stringBuild);

        long finish2 = System.currentTimeMillis();
        long timeStringBuilding = finish2 - start2;

        System.out.println();
        System.out.println();

        System.out.println("Конкатинация. Затраченное время, мс: " + timeConcatenation);
        System.out.println("StringBuilder. Затраченное время, мс: " + timeStringBuilding);
    }
}
