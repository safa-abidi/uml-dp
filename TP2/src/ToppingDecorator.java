
public abstract class ToppingDecorator extends CoupeGlacee {
    protected CoupeGlacee coupe;


    public ToppingDecorator(CoupeGlacee coupe) {
        this.coupe = coupe;
    }


	@Override
	public String description() {
		// TODO Auto-generated method stub
		return coupe.description();
	}


	@Override
	public float cout() {
		// TODO Auto-generated method stub
		return coupe.cout();
	}
    
    
}