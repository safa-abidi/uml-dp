public class Parfum {
    public static final Parfum FRAISE = new Parfum("Fraise");
    public static final Parfum FRAMBOISE = new Parfum("Framboise");
    public static final Parfum CASSIS = new Parfum("Cassis");
    public static final Parfum CHOCOLAIT = new Parfum("Chocolat au lait");
    public static final Parfum CHOCONOIR = new Parfum("Chocolat noire");
    public static final Parfum CHOCOBLANC = new Parfum("Chocolat blanc");

    private final String name;

    private Parfum(String s) {
        this.name = s;
    }

    @Override
    public String toString() {
        return this.name;
    }
}