package transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;

    String gears;

    private final String body;

    private final String number;

    int seats;

    boolean summerTyres;

    private Key key;

    private Insurance insurance;


    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String body,
               String number,
               int seats,
               boolean summerTyres
    ) {

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        this.model = model;
        if (model == null) {
            model = "default";
        }
        setEngineVolume(engineVolume);{
            if (Double.compare(engineVolume, 00) == 0) {
                engineVolume = 1.5;
            }
            this.engineVolume = engineVolume;
        }
        this.color = color;
        if (year < 0) {
            year = 2000;
        }
        this.year = year;
        if (country == null) {
            country = "default";
        }
        this.country = country;
        if (body == null || body.isEmpty()) {
            body = "седан";
        }
        this.body = body;
        if (number == null || number.isEmpty()) {
            number = "x000xx000";
        }
        this.number = number;
        this.seats = seats;
        this.summerTyres = summerTyres;
        setKey(null);
        setInsurance(null);

    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBody() {
        return body;
    }

    public String getNumber() {
        return number;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGears() {
        if (gears == null || gears.isEmpty()) {
            gears = "МКПП";
        }
        return gears;
    }

    public void setGears(String gears) {
        this.gears = gears;
    }

    public int getSeats() {
        if (seats <= 0) {
            seats = 5;
        }
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeTyres(){
        setSummerTyres(!summerTyres);
    }

    public boolean isValidNumber () {
        //x000xx000

        return number.length() == 9

                && Character.isLetter(number.charAt(0))
                && Character.isLetter(number.charAt(4))
                && Character.isLetter(number.charAt(5))

                && Character.isDigit(number.charAt(1))
                && Character.isDigit(number.charAt(2))
                && Character.isDigit(number.charAt(3))
                && Character.isDigit(number.charAt(6))
                && Character.isDigit(number.charAt(7))
                && Character.isDigit(number.charAt(8));
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance(null, 10_000, null);
        }
        this.insurance = insurance;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", gears='" + gears + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", summerTyres=" + summerTyres +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public void info() {
        System.out.println("Марка - " + brand +
                ", Mодель - " + model +
                ", объем двигателя - " + engineVolume +
                ", цвет - " + color +
                ", год выпуска - " + year +
                ", страна сборки - " + country +
                ", кузов - " + body +
                ", номер - " + number +
                ", количество мест - " + seats +
                ", летние шины - " + summerTyres);
    }

    public static class Key {

        private final boolean remoteRun;

        private final boolean withoutKeyAccess;

        public Key(boolean remoteRun, boolean withoutKeyAccess) {
            this.remoteRun = remoteRun;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRun () {
            return remoteRun;
        }

        public boolean isWithoutKeyAccess(){
            return withoutKeyAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteRun=" + remoteRun +
                    ", withoutKeyAccess=" + withoutKeyAccess +
                    '}';
        }
    }

    public static class Insurance {

        private final LocalDate expireDate;

        private final int insurancePrice;

        private final String insuranceNumber;

        public Insurance(LocalDate expireDate, int insurancePrice, String insuranceNumber) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (insurancePrice <= 0) {
                insurancePrice = 10_000;
            }
            this.insurancePrice = insurancePrice;
            if (insuranceNumber == null || insuranceNumber.isEmpty()) {
                insuranceNumber = "XXXYYYZZZ";
            }
            this.insuranceNumber = insuranceNumber;
        }

        public void printCheckExpired(){
            boolean expired = expireDate.isAfter(LocalDate.now());
            if (expired) {
                System.out.println("Надо менять страхвку!");
            }
        }

        public void printCheckNumber () {
            boolean correct = insuranceNumber.length() == 9;
            if (correct){
                System.out.println("Номер страховки не корректный!");
            }
        }
        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getInsurancePrice() {
            return insurancePrice;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "expireDate=" + expireDate +
                    ", insurancePrice=" + insurancePrice +
                    ", insuranceNumber='" + insuranceNumber + '\'' +
                    '}';
        }
    }

}
