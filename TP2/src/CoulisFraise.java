public class CoulisFraise extends ToppingDecorator {


    public CoulisFraise(CoupeGlacee coupe) {
        super(coupe);
    }


    @Override
    public String description() {
        return super.description() + " au Coulis de Fraise";
    }


    @Override
    public float cout() {
        return super.cout() + 1f;
    }
}
