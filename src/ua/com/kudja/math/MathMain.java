package ua.com.kudja.math;

import ua.com.kudja.math.Mathematician;

import java.util.ArrayList;
import java.util.Arrays;

public class MathMain {
    public static void main(String[] args) {

        // Возводим в степень
        Mathematician probe = new Mathematician();
        int[] massiv = {1, 2, 3, 4};
        System.out.println("Первичный массив: " + Arrays.toString(massiv));
        probe.squareNums(massiv);
        System.out.println("Результат: " + Arrays.toString(probe.squareNums(massiv)));

        //  Убираем положительные цифры
        Mathematician probe2 = new Mathematician();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        negative.add(100);
        negative.add(-15);
        negative.add(-148);
        negative.add(152);
        negative.add(-48);

        System.out.println("Первичный массив: " + negative);

        probe2.removePositive(negative);
        System.out.println("Результат: " + probe2.removePositive(negative));

        //  Выбираем высокосные годы
        Mathematician probe3 = new Mathematician();
        ArrayList<Integer> visokos = new ArrayList<Integer>();
        visokos.add(2020);
        visokos.add(1944);
        visokos.add(2016);
        visokos.add(1978);
        visokos.add(2000);

        System.out.println("Первичный массив: " + visokos);

        probe3.filterYears(visokos);
        System.out.println("Результат: " + probe3.filterYears(visokos));
    }
}
