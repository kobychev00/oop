public class Flower {
    private String flowerName;
    private String country;
    private double price;

    private int lifeSpan;

    public Flower(String flowerName, String country, double price) {
        if (flowerName != null || this.flowerName.isEmpty()) {
            this.flowerName = flowerName;
        }else {
            this.flowerName = "Не указан тип цветка";
        }
        this.flowerName = flowerName;
        if (this.country == null || this.country.isEmpty()) {
            this.country = "Россия";
        }
        this.country = country;
        if (price <= 0) {
            this.price = 1;
        }
        this.price = price;
        this.lifeSpan = 3;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getPrice() {
        return price;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0){
            this.lifeSpan = lifeSpan;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flowerColor='" + flowerName + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", lifeSpan=" + lifeSpan +
                '}';
    }
}
