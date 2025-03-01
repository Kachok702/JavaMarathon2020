package day4;


import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        int max = 10000;
        for (int i = 0; i < massiv.length; i++)
            massiv[i] = (int) (Math.random() * (max + 1));
        System.out.println(Arrays.toString(massiv));

        int maxim = 0;
        for (int i : massiv) {
            if (i > maxim) {
                maxim = i;
            }
        }
        System.out.println("Наибольший элемент массива: " + maxim);

        int minamal = 10000;
        for (int i : massiv) {
            if (i < minamal)
                minamal = i;
        }
        System.out.println("Наименьший элемент массива: " + minamal);

        int numberHaveZero = 0;
        for (int i : massiv) {
            if ((i % 10 == 0) | (i == 0)) {
                numberHaveZero++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающих на 0: " + numberHaveZero);

        int sumLastZero = 0;
        for (int i : massiv) {
            if ((i % 10 == 0) | (i == 0)) {
                sumLastZero = sumLastZero + i;
            }
        }
        System.out.println("Сумма элементов массива, оканчивающих на 0: " + sumLastZero);
    }
}
