package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] massiv = new int[12][8];
        int max = 50;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = (int) (Math.random() * (max + 1));
            }
        }
        System.out.println(Arrays.deepToString(massiv));
        int Index = 0;
        int result = 0;
        int summa = 0;
        for (int i = 0; i < massiv.length; i++) {

            for (int j = 0; j < massiv[i].length; j++) {
                summa += massiv[i][j];
            }
            if (summa >= result) {
                result = summa;
                Index = i;
            }
            summa = 0;
        }
        System.out.println(Index);
    }


}

