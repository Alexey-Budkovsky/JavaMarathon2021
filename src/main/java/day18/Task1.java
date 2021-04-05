package day18;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {15, -6, 18, 11, -5, 77, 6};


        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println(recursionSum(numbers, numbers.length));


    }

    public static int recursionSum(int[] arr, int arrIndex) {
        if (arrIndex == 1)
            return arr[0];
        else
            return arr[arrIndex - 1] + recursionSum(arr, arrIndex - 1);
    }



}
