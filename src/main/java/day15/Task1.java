package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("src/main/resources/shoes.csv");
                File outputFile = new File("src/main/resources/missing_shoes.txt");

        if (!outputFile.getName().endsWith(".txt")) {
            System.out.println("Ошибка: Файл должен иметь расширение .txt");
            return;
        }

        try (Scanner scanner = new Scanner(inputFile);
             FileWriter writer = new FileWriter(outputFile, false)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");

                if (parts.length == 3) {
                    try {
                        int quantity = Integer.parseInt(parts[2].trim());
                        if (quantity == 0) {
                            String outputLine = parts[0].trim() + ", " + parts[1].trim() + ", 0\n";
                            writer.write(outputLine);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка формата числа в строке: " + line);
                    }
                } else {
                    System.out.println("Некорректный формат строки: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}