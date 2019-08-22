package builder01;

public class DressingDirector implements Director{

    private Builder builder;

    public DressingDirector(Builder builder) {
        this.builder = builder;
    }

    @Override
    public Dressing dress() {
        Dressing dressing = new Dressing();
        dressing.setHat(builder.hatBuilder());
        dressing.setShirt(builder.shirtBuilder());
        dressing.setPants(builder.pantsBuilder());
        dressing.setShoes(builder.shoesBuilder());
        return dressing;
    }
}
