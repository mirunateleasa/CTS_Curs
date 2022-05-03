package creationals.builder.complete.addOns;

import creationals.builder.complete.addOns.interfaces.IDisplay;

public class DisplaySuperAMOLED implements IDisplay{
	
	//specific attributes
		double size;
	
	//constructor
		public DisplaySuperAMOLED (double size)
		{
			this.size = size;
		}

		@Override
		public String toString() {
			return "DisplaySuperAMOLED [size=" + size + "]";
		}
		
		
}
