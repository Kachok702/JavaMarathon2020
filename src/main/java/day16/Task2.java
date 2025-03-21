package day16;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("file1.txt");
        File outputFile = new File("file2.txt");
        try (PrintWriter printWriter = new PrintWriter(inputFile);
             PrintWriter printWriter2 = new PrintWriter(outputFile)) {
            int count = 0;
            double result;
            int summa = 0;
            for (int i = 1; i <= 1000; i++) {
                int b = (int) (Math.random() * (100 + 1));
                printWriter.write(b + "\n");
                count++;
                summa += b;
                if (count == 20) {
                    result = (double) summa / 20;
                    printWriter2.write(result + "\n");
                    count = 0;
                    summa = 0;
                }
            }
        }
        printResult(outputFile);
    }

    public static void printResult(File file) throws FileNotFoundException {
        File file1 = new File(String.valueOf(file));
        try (Scanner scanner = new Scanner(file1)) {
            double result = 0;
            while (scanner.hasNextLine()) {
                String numbers = scanner.nextLine();
                result += Double.parseDouble(numbers);
            }
            System.out.println((int) result);
        }
    }
}
