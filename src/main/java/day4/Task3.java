package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
int [][] massiv = new int[3][5];
int max = 10;
        for (int i = 0; i < massiv.length;i++) {
            for (int j = 0; j < massiv[0].length; j++) {
                massiv[i][j] = (int) (Math.random() * (max + 1));
            }
        }
        System.out.println(Arrays.deepToString(massiv));


        int result = 0;
        int Index = 0;
        for (int i = 0; i < massiv.length;i++) {
            int summa = 0;
            for (int j = 0; j < massiv[i].length; j++) {
                summa = summa + massiv[i][j];
                if (result <= summa) {
                    result = summa;
                    Index = i;
                }

            }

        }
        System.out.println(Index);}

    }

