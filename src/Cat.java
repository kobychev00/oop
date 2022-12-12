import java.lang.reflect.Array;
import java.util.Arrays;

public class Cat {

    String name;
    int age;

    Cat[] friends;



    Cat (String name) {

        this(name, 1);
    }

    Cat (String name, int age) {

        this.name = name;

        if (age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }

        friends = new Cat[0];
    }

    void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут " + name);
        System.out.println("Мне " + age + " лет");

    }

    Cat[] getFriends () {
        if (friends == null) {
            friends = new Cat[0];

        }
        return friends;
    }

    void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(this.friends, getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }
}
