package day13;

public class Task1 {
    public static void main(String[] args) {
User Marsel = new User("Marsel");
User Liza = new User("Liza");
User Dog = new User("Pupsik");
Marsel.sendMessage(Liza, "Привет!");
        Marsel.sendMessage(Liza, "Как дела?");

        Liza.sendMessage(Marsel, "Привет");
        Liza.sendMessage(Marsel, "Хорошо!");
        Liza.sendMessage(Marsel, "А у тебя как дела?");

        Dog.sendMessage(Marsel, "Хозяин!!!");
        Dog.sendMessage(Marsel, "Я хочу кушать :((((");
        Dog.sendMessage(Marsel, "Ты где, пёс???");

        Marsel.sendMessage(Dog, "Моя собака лает))");
        Marsel.sendMessage(Dog, "Что ты хочешь, мой милый пирожок?");
        Marsel.sendMessage(Dog,"У тебя же есть еда в миске");

        Dog.sendMessage(Marsel, "Меня тогда Лиза покормит");

        MessageDatabase.showDialog(Marsel, Dog);
            }
}
