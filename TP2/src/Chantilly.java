public class Chantilly extends ToppingDecorator {


    public Chantilly(CoupeGlacee coupe) {
        super(coupe);
    }


    @Override
    public String description() {
        return super.description() + " Chantilly";
    }


    @Override
    public float cout() {
        return super.cout() + .5f;
    }
}
