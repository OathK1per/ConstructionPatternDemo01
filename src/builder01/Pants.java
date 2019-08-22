package builder01;

public class Pants {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Pants(String brand) {
        this.brand = brand;
    }

    public Pants() {
        super();
    }
}
