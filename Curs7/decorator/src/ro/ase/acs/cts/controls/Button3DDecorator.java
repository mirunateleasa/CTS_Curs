package ro.ase.acs.cts.controls;

public class Button3DDecorator extends AbstractVisualControlDecorator{
	String effect3D;

	public Button3DDecorator(AbstractVisualControl theControlToChange, String effectToBeAdded) {
		super(theControlToChange);
		this.effect3D = effectToBeAdded;
	}

	@Override
	public void click() {
		//adding the decoration
			System.out.println("Show 3D effect: " + this.effect3D);
		//calling the old method:
			this.theControlToChange.click();
	}
	
	
}
