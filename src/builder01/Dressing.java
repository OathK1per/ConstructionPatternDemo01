package builder01;

public class Dressing {

    private Hat hat;
    private Shirt shirt;
    private Pants pants;
    private Shoes shoes;

    public void mirror() {
        System.out.println(hat.getBrand() + " looks pretty");
    }

    public Hat getHat() {
        return hat;
    }

    public void setHat(Hat hat) {
        this.hat = hat;
    }

    public Shirt getShirt() {
        return shirt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Dressing(Hat hat, Shirt shirt, Pants pants, Shoes shoes) {
        this.hat = hat;
        this.shirt = shirt;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Dressing() {
        super();
    }
}
