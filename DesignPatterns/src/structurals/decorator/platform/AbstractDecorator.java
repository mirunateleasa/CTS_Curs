package structurals.decorator.platform;

public abstract class AbstractDecorator extends AbstractSystem
{
	protected AbstractSystem aSystem;
	
	public AbstractDecorator (AbstractSystem system)
	{
		this.aSystem = system;
	}

	@Override
	public String getRezultate()
	{
		return this.aSystem.rezultate;
	}
}
