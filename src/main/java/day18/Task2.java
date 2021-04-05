package day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
//        Random ran = new Random();
//        int randomNum = ran.nextInt();
//        System.out.println(randomNum);
//        count7(randomNum);
        count7(1170785711);

        System.out.println(count7(1177785711));


    }

    public static int count7(int num) {
        if (num == 0)
            return 0;
        else if (num % 10 == 7)
            return 1 + count7(num / 10);
        else
            return 0 + count7(num / 10);
    }

}
