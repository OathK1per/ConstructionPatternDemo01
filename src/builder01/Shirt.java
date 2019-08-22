package builder01;

public class Shirt {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Shirt(String brand) {
        this.brand = brand;
    }

    public Shirt() {
        super();
    }
}
