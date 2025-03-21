package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237));
    }

    public static int count7(int array) {
        if (array == 0)
            return 0;


        if (array % 10 == 7)
            return 1 + count7(array / 10);
         else return count7(array / 10);
    }
}
