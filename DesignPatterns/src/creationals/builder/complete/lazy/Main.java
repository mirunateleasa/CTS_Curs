package creationals.builder.complete.lazy;

import creationals.builder.complete.addOns.DisplaySuperAMOLED;
import creationals.builder.complete.addOns.SDCard;
import creationals.builder.complete.addOns.TelCoSIMCard;
import creationals.builder.complete.eager.SmartDevice;
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
			
			System.out.println(note20);
		}
}
