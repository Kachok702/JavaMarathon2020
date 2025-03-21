package day16;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("Test.txt"));
    }

    public static void printResult(File file) {
        File file1 = new File(String.valueOf(file));

        try (Scanner scanner = new Scanner(file1)) {
            double result1 = 0;
            String[] line = scanner.nextLine().split(" ");
            int count = 0;

            for (String number : line) {
                result1 += Double.parseDouble(number);
                count++;
            }

            result1 /= count;
            String result2 = String.format("%.3f", result1);
            System.out.println(result1 + " --> " + result2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
