public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    void info() {
        System.out.println("Марка - " + brand + ", Mодель - " + model + ", объем двигателя - " + engineVolume + ", цвет - " + color + ", год выпуска - " + year + ", страна сборки - " + country );
    }
}
