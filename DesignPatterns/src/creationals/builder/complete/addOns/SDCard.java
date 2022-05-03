package creationals.builder.complete.addOns;

import creationals.builder.complete.addOns.interfaces.IExternalMemory;

public class SDCard implements IExternalMemory{
	//specific attributes
		double capacity;
		
	//constructor
		public SDCard (double capacity)
		{
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return "SDCard [capacity=" + capacity + "]";
		}
		
	
}
