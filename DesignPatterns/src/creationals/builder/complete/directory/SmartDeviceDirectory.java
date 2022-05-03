package creationals.builder.complete.directory;

import creationals.builder.complete.addOns.DisplaySuperAMOLED;
import creationals.builder.complete.addOns.SDCard;
import creationals.builder.complete.addOns.TelCoSIMCard;
import creationals.builder.complete.directory.SmartDevice.SmartDeviceBuilder;

public class SmartDeviceDirectory {
	SmartDeviceBuilder smartDeviceBuilder;
	
	public SmartDeviceDirectory (SmartDeviceBuilder builder)
	{
		this.smartDeviceBuilder = builder;
	}
	
	public SmartDevice buildS22()
	{
		return smartDeviceBuilder
					.addWiFi()
					.addMemoryCard(new SDCard (50))
					.build();
	}
	
	public SmartDevice buildAppleX ()
	{
		return smartDeviceBuilder
					.addWiFi()
					.addDisplay(new DisplaySuperAMOLED(10))
					.addMemoryCard(new SDCard(80))
					.build();
	}
}
