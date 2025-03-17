package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> chet = new ArrayList<>();
        int x1 = 0, x2 = 30;
        int y1 = 300, y2 = 350;
        for (; x1 <= x2; x1++) {
            if (x1 % 2 == 0) {
                chet.add(x1);
            }
        }
        for (; y1 <= y2; y1++) {
            if (y1 % 2 == 0) {
                chet.add(y1);
            }
        }
        System.out.println(chet);
    }
}
