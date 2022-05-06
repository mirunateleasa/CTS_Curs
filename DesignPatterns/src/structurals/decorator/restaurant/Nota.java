package structurals.decorator.restaurant;

public class Nota extends AbstractNota
{
	public Nota(int nrMasa, float total)
	{
		super(nrMasa, total);
	}

	@Override
	public String printeazaNota()
	{
		return "NOTA pt masa " + this.nrMasa + " cu total = " + this.total;
	}

}
