package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("people.txt")));

    }

    public static List<String> parseFileToStringList(File x) {
        List<String> text = new ArrayList<>();
       File file = new File(String.valueOf(x));
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
                text.add(scanner.nextLine());

            for (String age : text) {
                String bb = age.substring(age.indexOf(' ') + 1);
                if (Integer.parseInt(bb) < 0) {
                    throw new NumberNotTen();
                }
            }
            return text;
        } catch (NumberNotTen e) {
            text.clear();
            System.out.println("Некорректный входной файл");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}
