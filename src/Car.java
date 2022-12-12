public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car () {
        brand = "default";
        model = "default";
        engineVolume = 1.5;
        color = "белый";
        year = 2000;
        country = "default";
    }

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        if (year >= 0) {
            this.year = year;
        } else {
            this.year = 2000;
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    void info() {
        System.out.println("Марка - " + brand + ", Mодель - " + model + ", объем двигателя - " + engineVolume + ", цвет - " + color + ", год выпуска - " + year + ", страна сборки - " + country );
    }
}
