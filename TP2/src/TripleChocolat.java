public class TripleChocolat extends CoupeGlacee {

    public static final TripleChocolat SINGLETON = new TripleChocolat();

    private TripleChocolat() {
        this.parfums.add(Parfum.CHOCOLAIT);
        this.parfums.add(Parfum.CHOCONOIR);
        this.parfums.add(Parfum.CHOCOBLANC);
    }

    /**
     * Retourne le coût de la coupe TripleChocolat
     * @return float coût
     */
    @Override
    public float cout() {
        return 6;
    }

}