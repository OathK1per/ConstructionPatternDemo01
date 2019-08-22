package builder01;

public class DressingBuilder implements Builder {
    @Override
    public Hat hatBuilder() {
        return new Hat("Padres");
    }

    @Override
    public Shirt shirtBuilder() {
        return new Shirt("UO");
    }

    @Override
    public Pants pantsBuilder() {
        return new Pants("Levis");
    }

    @Override
    public Shoes shoesBuilder() {
        return new Shoes("Nike");
    }
}
