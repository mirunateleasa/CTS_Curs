package structurals.decorator.platform;

public class DecoratorOnline extends AbstractDecorator
{

	public DecoratorOnline(AbstractSystem system)
	{
		super(system);
	}

	@Override
	public String getRezultate()
	{
		return "ONLINE: " + super.getRezultate();
	}
	

}
