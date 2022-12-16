public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;


    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        this.name = name;
        if (this.name == null) {
            this.name = " Информация не указана";
        }
        setTown(town);
        this.jobTitle = jobTitle;
            if (this.jobTitle == null) {
                this.jobTitle = " Информация не указана";
        }
    }

    void intro() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + " Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем закомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        if (yearOfBirth < 0) { // проверка на пустоту в поле
            this.yearOfBirth = 0; // Использование для пустой строки
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
        if (this.town == null) {
            this.town = "Информация не указана";
        }
        if (town != null && town.isEmpty() && town.isBlank()) { // проверка на пустоту в поле
            this.town = town;
        } else {
            this.town = "Не указан город рождения"; // Использование для пустой строки
        }
    }
}
