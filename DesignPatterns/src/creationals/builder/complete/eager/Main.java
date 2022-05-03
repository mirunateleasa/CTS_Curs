package creationals.builder.complete.eager;

import creationals.builder.complete.addOns.DisplaySuperAMOLED;
import creationals.builder.complete.addOns.SDCard;
import creationals.builder.complete.addOns.TelCoSIMCard;
import creationals.builder.complete.addOns.interfaces.IExternalMemory;
import creationals.builder.complete.eager.SmartDevice.SmartDeviceBuilder;

public class Main {

	public static void main(String[] args) {
		SmartDeviceBuilder smartDeviceBuilder = new SmartDeviceBuilder("iPhone13", "Apple");
		
		SmartDevice iPhone13 = smartDeviceBuilder
				.addWiFi()
				.addSIM(new TelCoSIMCard())
				.addMemoryCard(new SDCard(50))
				.addDisplay(new DisplaySuperAMOLED(30))
				.build();
		
		SmartDevice note20 = new SmartDeviceBuilder("note20", "Samsung")
				.addWiFi()
				.addMemoryCard(new SDCard(25))
				.addSIM(new TelCoSIMCard())
				.build();
		
		System.out.println(iPhone13.toString());
		System.out.println(note20.toString());
	}
	
	

}
