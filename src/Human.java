public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

   Human (){
       int yearOfBirth = 1;
       name = "Информация не указана";
       town = "Информация не указана";
       jobTitle = "Информация не указана";
   }

    Human(int yearOfBirth, String name, String town, String jobTitle) {

        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }

    void intro() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности" + jobTitle + ". Будем закомы!");
    }
}
