package day16;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file1 = new File("file1.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++)
            printWriter1.println(random.nextInt(100));

        printWriter1.close();


        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter printWriter = new PrintWriter(file2);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            count++;

            if (count == 20) {
                printWriter.println(sum / 20.0);

                sum = 0;
                count = 0;
            }
        }
        printWriter.close();

        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
Scanner scanner = new Scanner(file);
double summa = 0;
while (scanner.hasNextLine()){
    summa += Double.parseDouble(scanner.nextLine());
}
        System.out.println((int) summa);


    }
}
