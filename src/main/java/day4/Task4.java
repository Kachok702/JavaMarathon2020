package day4;

import java.util.Arrays;


public class Task4 {
    public static void main(String[] args) {
int massiv [] = new int[100];
int max = 10000;

        for (int i = 0; i < massiv.length; i++){
            massiv[i] = (int) (Math.random()*(max + 1));
                    }
        System.out.println(Arrays.toString(massiv));
        int summa = 0;
        int bolshaSumma = 0;
        int Index = 0;
        for ( int i = 2; i < massiv.length; i++){
           summa = massiv[i - 2] + massiv[i - 1] + massiv[i];
           if (bolshaSumma < summa) {
               bolshaSumma = summa;
               Index = i - 2;
           }
        }
        System.out.println(bolshaSumma);
        System.out.println(Index);
    }
}
