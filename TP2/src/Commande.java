import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;


public class Commande {
    private final ArrayList<CoupeGlacee> lesCoupes;

    public Commande() {
        this.lesCoupes = new ArrayList();
    }

    public void addCoupe(CoupeGlacee coupeGlacee) {
        this.lesCoupes.add(coupeGlacee);
    }

    public void publieFacture(PrintWriter writer) {
        float total = 0;
        for (Iterator it = this.lesCoupes.iterator(); it.hasNext();) {
        	CoupeGlacee coupe = (CoupeGlacee) it.next();
        	writer.println(coupe.description()+" + "+coupe.cout());
        	total = total + coupe.cout();

        }
        writer.println("TOTAL : "+total);
    }
}