package edu.course.lab01;

import java.util.Arrays;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isPrime(int number) {
        if (number <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }

        return true;
    }


    public static boolean isPolindrom(int number) {
        if (number < 0) {
            return false;
        }
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed  * 10 + lastDigit;
            number /= 10;

        }

        if (original == reversed) {
            return true;
        }
        return false;
    }

    public static double Average(int[] number) {

        if (number == null || number.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int nun : number) {
            sum += nun;
        }
        return sum / number.length;

    }

}
