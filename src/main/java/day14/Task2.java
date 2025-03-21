package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList(){
       File file = new File("people.txt");
        List<String> info = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String nameAndAge = scanner.nextLine();
                String[] person = nameAndAge.split(" ");

                if (Integer.parseInt(person[1]) <= 0){
                    throw new IllegalArgumentException();
                }
               info.add(nameAndAge);
            }

            scanner.close();
            return info;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }

return null;
    }

}
