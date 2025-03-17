package day16;



import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        printResult(new File("Test.txt"));


    }

    public static void printResult(File file) {
        File x = new File(String.valueOf(file));
        try {
            Scanner scanner = new Scanner(x);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            double middle = 0;
            int count = 0;

            for (String number : numbers) {
                count++;
                middle += Integer.parseInt(number);
            }
            middle = (double) middle / count;
            double middle2 = middle;
            String s = String.format("%.3f", middle2);
            System.out.print(middle + " --> " + s);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
