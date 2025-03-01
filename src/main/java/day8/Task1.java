package day8;

public class Task1 {
    public static void main(String[] args) {
        String text = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            text = text + i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        //System.out.println(text);


        StringBuilder text2 = new StringBuilder();
        before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            text2.append(i).append(" ");
        }

        after = System.currentTimeMillis();
        System.out.println(after - before);
        //System.out.println(text2);
    }
}
