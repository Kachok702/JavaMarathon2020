package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("Test.txt"));

    }

   public static void printSumDigits(File file) {

        File x = new File(String.valueOf(file));
        try {
            Scanner scanner = new Scanner(x);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10)
                throw new NumberNotTen();

            int sum = 0;

            for (String number : numbers)
                sum +=Integer.parseInt(number);
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberNotTen e) {
            System.out.println("Неверный файл");
        }
    }
}
