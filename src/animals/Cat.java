package animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {

    private String name;
    private int birthYear; // модификатор доступа private (доступ из вне запрещен)

    private Cat[] friends; // объявление массиива



    public Cat (String name) {

        this(name, 0);
    }

    public Cat (String name, int age) { //

        this.name = name;
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);

        }
        friends = new Cat[0];
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + getAge() + " лет");

    }

    public Cat[] getFriends () {
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }
    public void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(this.friends, getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;

    }

    public String getName() {
        // возвращает значение
        return name;
    }

    public void setName(String name) {
        //изменяет значение, void – так как не возврата
        if (name != null && name.isEmpty() && name.isBlank()) { // проверка на пустоту в поле
            this.name = name;
        } else {
            this.name = "Кот"; // Использование для пустой строки
        }
    } // доступ к данным

    public int getAge() {
        return LocalDate.now().getYear() - birthYear; //оболчка функции возраст кота
    }
}
