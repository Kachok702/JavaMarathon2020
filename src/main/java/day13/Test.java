package day13;

public class Test {               // Здесь тестируем
    public static void main(String[] args) {
        User Marsel = new User("Marsel");
        User Liza = new User("Liza");
        User Dog = new User("Lula");
        User myMother = new User("Raisa");
        User sister = new User("Roza");


                Marsel.subscribe(Liza);
        Marsel.subscribe(sister);
        Marsel.subscribe(myMother);

        Marsel.info();

        Liza.subscribe(Marsel);
        Liza.info();
        System.out.println(" ");

        System.out.println(Marsel.isFriend(Liza));
        System.out.println(Liza.isFriend(Marsel));
        System.out.println(sister.isFriend(Marsel));
        System.out.println(Marsel.isFriend(sister));

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
        Marsel.sendMessage(Dog, "У тебя же есть еда в миске");
        Dog.sendMessage(Marsel, "Меня тогда Лиза покормит");

       MessageDatabase.showDialog(Dog, Marsel);

    }
}
