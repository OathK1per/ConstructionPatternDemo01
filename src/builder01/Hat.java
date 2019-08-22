package builder01;

public class Hat {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Hat(String brand) {
        this.brand = brand;
    }

    public Hat() {
        super();
    }
}
