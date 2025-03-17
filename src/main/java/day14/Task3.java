package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("people.txt")));
    }


    public static List<Person> parseFileToObjList(File x) {
        List<Person> text = new ArrayList<>();
        File file = new File(String.valueOf(x));

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0) {
                    throw new NumberNotTen();
                }

                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                text.add(currentPerson);
            }
            return text;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (NumberNotTen e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
