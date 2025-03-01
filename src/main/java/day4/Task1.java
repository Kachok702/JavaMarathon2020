package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] massiv = new int[n];

        for (int i = 0; i < n; i++) {
            final int max = 10;
            massiv[i] = (int) (Math.random() * (max + 1));
        }
        System.out.println(Arrays.toString(massiv));
        System.out.println("Длина массива: " + massiv.length);

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (massiv[i] > 8) {
                j++;
            }
                    }
        System.out.println("Количество чисел больше 8: " + j);

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (massiv[i] == 1) {
                k++;
            }
                   }
        System.out.println("Количество чисел равных 1: " + k);

        int ch = 0;
        for (int i = 0; i < n; i++) {
            if (massiv[i] % 2 == 0 | massiv[i] == 0) {
                ch++;
            }
                   }
        System.out.println("Количеcтво четных чисел: " + ch);

        int nech = 0;
        for (int i = 0; i < n; i++) {
            if (massiv[i] % 2 != 0) {
                nech++;
            }
                   }
        System.out.println("Количеcтво нечетных чисел: " + nech);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + massiv[i];
                  }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
