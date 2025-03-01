package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(91);
        Player player2 = new Player(90);
        Player player3 = new Player(100);
        Player player4 = new Player(95);
        Player.info();
        Player player5 = new Player(97);
        System.out.println(Player.getCountPlayers());
        Player player6 = new Player(94);
        Player.info();
        Player player7 = new Player(100);
        System.out.println(Player.getCountPlayers());
        Player player8 = new Player(100);
        Player.info();
        System.out.println(Player.getCountPlayers());
        while (player1.getStamina() > 0) {
            player1.run();
        }
        Player.info();
        player1.run();
        System.out.println(player1.getStamina());
    }
}
