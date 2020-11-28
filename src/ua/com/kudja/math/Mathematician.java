package ua.com.kudja.math;

import java.util.ArrayList;

public class Mathematician {

    // Метод возведения в степень
    int[] squareNums(int[] first) {
        int[] second = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            second[i] = first[i] * first[i];
        }
        return second;

    }

    // Метод исключения положительных цифр
    ArrayList<Integer> removePositive(ArrayList<Integer> removing) {

        for (int i = 0; i < removing.size(); i++) {
            if (removing.get(i) >= 0) {
                removing.remove(i);
            }
        }


        return removing;

    }

    // Метод фильтрации годов
    ArrayList<Integer> filterYears(ArrayList<Integer> years) {
        for (int i = 0; i < years.size(); ++i) {
            if (years.get(i) % 4 != 0 || years.get(i) % 100 == 0 && years.get(i) % 400 != 0) {
                years.remove(i);
            }
        }

        return years;
    }

}

