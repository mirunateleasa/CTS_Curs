package structurals.decorator.restaurant;

public abstract class AbstractDecorator extends AbstractNota
{
	AbstractNota aNota;

	public AbstractDecorator(AbstractNota aNota)
	{
		super(aNota.nrMasa, aNota.total);
		this.aNota = aNota;
	}

	@Override
	public String printeazaNota()
	{
		return this.aNota.printeazaNota();
	}
	
	
}
