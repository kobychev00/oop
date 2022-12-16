import animals.Cat;
import transport.Car;

import java.time.LocalDate;

public class Main {

    private static void printSeparetor() {
        System.out.println("+++++++++++++++");
    }

    public static void main(String[] args) {
        System.out.println("ДЗ");
        printSeparetor();
        System.out.println("Задача 1");
        Human maksim = new Human(
                LocalDate.now().getYear() - 35,
                "Максим",
                "",
                "Бред-менеджер ");
        Human anya = new Human(
                LocalDate.now().getYear() - 29,
                "Аня",
                "Москва",
                "Методист образовательных программ ");
        Human katya = new Human(
                LocalDate.now().getYear() - 28,
                "Катя",
                "Калининград",
                "Продакт-менеджер ");
        Human artem = new Human(
                LocalDate.now().getYear() - 27,
                "Артём",
                "Москва",
                "Директор по развитию бизнеса ");
        Human vladimir = new Human(
                LocalDate.now().getYear() - 21,
                "Владимир",
                "Казань",
                null);
        maksim.intro();
        anya.intro();
        katya.intro();
        artem.intro();
        vladimir.intro();
        System.out.println("Задача 2");
        maksim.intro();
        anya.intro();
        katya.intro();
        artem.intro();
        System.out.println("Задача 3");
        Car lada = new Car(
                "Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                "седан",
                "е222нн078",
                5,
                true);
        Car audi = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "чёрный",
                2020,
                "Германия",
                "седан",
                "е223нн078",
                5,
                true);
        Car bmw = new Car(
                "BMW",
                "Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                "седан",
                "е222он078",
                5,
                false);
        Car kia = new Car(
                "Kia",
                "Sportage 4th generation",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "кроссовер",
                "р233нн078",
                7,
                true);
        Car hyundai = new Car(
                "Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "универсал",
                "е282ун078",
                5,
                false);
        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();

        printSeparetor();

        Flower rose = new Flower(
                "Роза",
                "Голландия",
                35.59
        );

        Flower chrysanthemum = new Flower(
                "Хризантема",
                "Голландия",
                15
        );
        chrysanthemum.setLifeSpan(5);
        Flower peony = new Flower(
                "Пион",
                "Англия",
                69.9
        );
        peony.setLifeSpan(1);

        Flower gypsophila = new Flower(
                "Гипсофила",
                "Турция",
                19.5
        );
        gypsophila.setLifeSpan(10);

        Bouquet bouquet = new Bouquet(
                new Flower[]{
                        rose, rose, rose,
                        chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum,
                        gypsophila,
                }
        );
        bouquet.printInfo();

    }

    private static void printInfo(Flower[] flowers) {
        double sum = 0;
        int minLifeSpan = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder("Состав букета:").append("\n");
        for (Flower flower : flowers) {
            sum += flower.getPrice();
            if (flower.getLifeSpan() < minLifeSpan) {
                minLifeSpan = flower.getLifeSpan();
            }
            result.append(flower).append("\n");
        }
        sum = sum * 1.1;
        result.append("Срок стояния букета: ").append(minLifeSpan).append(" дней");
        result.append("Стоимость букета: ").append(sum).append(" руб.");





        printSeparetor();

        System.out.println("Конспект");
        Cat murzik = new Cat("Мурзик");
        // murzik.age = 3;
        murzik.meow();
        System.out.println(murzik.getName());


        Cat begemot = new Cat("", -5);
        // begemot.age = -5; // изменение свойства поля напрямую (после проверки)
        begemot.setName(null); //проверка на пустоту (null - "кот")

        begemot.meow();

        murzik.addFriend(begemot);

        System.out.println("У кота" + " " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
    }
}
