package ro.ase.acs.cts.controls;

public class MouseHoverDecorator extends AbstractVisualControlDecorator{

	public MouseHoverDecorator(AbstractVisualControl theControlToChange) {
		super(theControlToChange);
		
	}
	
	public void mouseHover()
	{
		System.out.println("Mouse hover control");
	}

}
