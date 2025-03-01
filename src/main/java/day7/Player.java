package day7;


public class Player {
    private int stamina;

    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0)
            return;

        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
        }

    }

   public static void info() {
        String answer = "";
        if (countPlayers < 6) {
            switch (6 - countPlayers) {
                case 2:
                case 3:
                case 4:
                    answer = " свободных места.";
                    break;
                case 5:
                case 6:
                    answer = " свободных мест.";
                    break;
                case 1:
                    answer = " свободное место.";
                    break;
            }
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + answer);

        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
