public class Main {

    private static void printSeparetor() {
        System.out.println("+++++++++++++++");
    }
    public static void main(String[] args) {
        System.out.println("ДЗ");
        printSeparetor();
        System.out.println("Задача 1");
        Human maksim = new Human(1988,"", "Минск", "Бред-менеджер ");
        Human anya = new Human(1993, "Аня", "Москва", "Методист образовательных программ ");
        Human katya = new Human(1992, "Катя", "Калининград", "Продакт-менеджер ");
        Human artem = new Human(1995, "Артём", "Москва", "Директор по развитию бизнеса ");
        maksim.intro();
        anya.intro();
        katya.intro();
        artem.intro();
        System.out.println("Задача 2");
        maksim.intro();
        anya.intro();
        katya.intro();
        artem.intro();
        System.out.println("Задача 3");
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4th generation", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");
        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();
        printSeparetor();

        System.out.println("Конспект");
        Cat murzik = new Cat("Мурзик");
        murzik.age = 3;
        murzik.meow();

        Cat begemot = new Cat("Бегемот", 5);
        begemot.meow();

        murzik.friends = null;

        System.out.println("У кота" + " "  + murzik.name + " " + murzik.getFriends().length + " друзей");

        murzik.addFriend(begemot);
        System.out.println("У кота" + " " + murzik.name + " " + murzik.getFriends().length + " друзей");
        murzik.friends[0].meow();

    }
}