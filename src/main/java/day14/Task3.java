package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjectList());
    }

    static List<Person> parseFileToObjectList() {
        List<Person> person = new ArrayList<>();
        File file = new File("people.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String nameAndAge = scanner.nextLine();
                String[] human = nameAndAge.split(" ");

                if (Integer.parseInt(human[1]) <= 0){
                    throw new IllegalArgumentException();
                }
                Person bb = new Person(human[0], Integer.parseInt(human[1]));
                person.add(bb);
            }

            return person;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
        catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
       return  null;
    }
}
