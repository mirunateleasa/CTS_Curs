package ro.ase.acs.cts.controls;

public class ImproveClickDecorator extends AbstractVisualControlDecorator {

	public ImproveClickDecorator(AbstractVisualControl theControlToChange) {
		super(theControlToChange);
		
	}

	@Override
	public void click() {
		System.out.println("Improved sound for click");
		this.theControlToChange.click();
	}
	
	

}
