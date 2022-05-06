package structurals.decorator.platform;

public class DecoratorPrintat extends AbstractDecorator
{
	public DecoratorPrintat(AbstractSystem system)
	{
		super(system);
	}

	@Override
	public String getRezultate()
	{
		return "PRINTEAZA: " + super.getRezultate();
	}

	
}
