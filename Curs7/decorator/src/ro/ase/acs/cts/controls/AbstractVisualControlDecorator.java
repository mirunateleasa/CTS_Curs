package ro.ase.acs.cts.controls;

public abstract class AbstractVisualControlDecorator extends AbstractVisualControl{
	AbstractVisualControl theControlToChange;
	

	public AbstractVisualControlDecorator(AbstractVisualControl theControlToChange) {
		super();
		this.theControlToChange = theControlToChange;
	}


	@Override
	public void click() {
		this.theControlToChange.click();
	}
	
	
	
}
