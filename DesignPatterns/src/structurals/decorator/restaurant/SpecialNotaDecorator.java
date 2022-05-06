package structurals.decorator.restaurant;

public class SpecialNotaDecorator extends AbstractDecorator
{
	public SpecialNotaDecorator(AbstractNota aNota)
	{
		super(aNota);
	}

	@Override
	public String printeazaNota()
	{
		return "LMA " +  super.printeazaNota();
	}
	
	

}
