package structurals.decorator.restaurant;

public abstract class AbstractNota
{
	
	public int nrMasa;
	public float total;
	
	public AbstractNota(int nrMasa, float total)
	{
		super();
		this.nrMasa = nrMasa;
		this.total = total;
	}

	public abstract String printeazaNota ();
}
