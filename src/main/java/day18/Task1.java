package day18;

public class Task1 {
    public static void main(String[] args) {
      int[] numbers = {1,10,1241,50402,-50,249,10215,665,2295,7,311};
        System.out.println(recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] massiv, int i){
        if (i == massiv.length){
            return 0;
        }

        return massiv[i] + recursionSum(massiv, i + 1);
    }
}
