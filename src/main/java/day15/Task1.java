package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("src/main/resources/shoes.csv");
        File outputFile = new File("src/main/resources/missing_shoes.txt");
        try (Scanner scanner = new Scanner(inputFile);
        PrintWriter pw = new PrintWriter(outputFile)){
                        while (scanner.hasNextLine()) {
               String[] array = scanner.nextLine().split(";");
                if (Integer.parseInt(array[2]) == 0){
            pw.write(array[0] + ", " + array[1] + ", 0\n" );}
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}