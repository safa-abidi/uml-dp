public class SauceChocolat extends ToppingDecorator {


    public SauceChocolat(CoupeGlacee coupe) {
        super(coupe);
    }


    @Override
    public String description() {
        return super.description() + " et sa délicieuse sauce chocolat ";
    }


    @Override
    public float cout() {
        return super.cout() + .7f;
    }
}
