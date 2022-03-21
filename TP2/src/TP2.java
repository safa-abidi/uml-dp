import java.io.PrintWriter;

public class TP2 {
    public static void main(String [] args)
    {
        Commande c = new Commande();
        c.addCoupe(FruitsRouges.SINGLETON);
        c.addCoupe(new Chantilly(FruitsRouges.SINGLETON));
        c.addCoupe(new CoulisFraise(new Chantilly(FruitsRouges.SINGLETON)));
        c.addCoupe(TripleChocolat.SINGLETON);
        CoupeGlacee coupe=new Chantilly(new SauceChocolat(TripleChocolat.SINGLETON));
        c.addCoupe(coupe);
        
        PrintWriter printWriter= new PrintWriter(System.out);
        c.publieFacture(printWriter);
        printWriter.flush();
    }
}
