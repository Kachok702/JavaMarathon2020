package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (i <= 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0) {
                i++;
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
            i++;
        }
    }
}

