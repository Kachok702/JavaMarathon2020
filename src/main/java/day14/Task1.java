package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("Test.txt"));
    }

    public static void printSumDigits(File file) {
        File inputFile = new File(String.valueOf(file));
        try {
            Scanner scanner = new Scanner(inputFile);

            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            if (numberString.length != 10) {
                throw new NumberNotTen();
            }

            int summa = 0;
            for (String number : numberString) {
                summa += Integer.parseInt(number);
            }

            System.out.println(summa);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberNotTen e) {
            System.out.println("Некорректный входной файл");
        }
    }
}