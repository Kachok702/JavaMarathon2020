package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        String text = "";
        int x = number.nextInt();
        if ((x >= 1) & (x <= 4)) {
            text = "Малоэтажный дом";
        } else if ((x >= 5) & (x <= 8)) {
            text = "Среднеэтажный дом";
        } else if (x >= 9) {
            text = "Многоэтажный дом";
        } else if (x <= 0) {
            text = "Ошибка ввода";
        }
        System.out.println(text);
        number.close();
    }
}