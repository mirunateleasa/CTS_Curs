package creationals.builder.complete.lazy;

import creationals.builder.complete.addOns.interfaces.IDisplay;
import creationals.builder.complete.addOns.interfaces.IExternalMemory;
import creationals.builder.complete.addOns.interfaces.IGPS;
import creationals.builder.complete.addOns.interfaces.ISIMCard;
import creationals.builder.complete.eager.SmartDevice.SmartDeviceBuilder;

public class SmartDevice {
	//specific attributes (for all devices)
			String model;
			String manufacturer;
			boolean hasWiFi;
			
		//addOns:
			ISIMCard SIM;
			IGPS GPS;
			IDisplay Display;
			IExternalMemory memory;
			
		//constructor default private (NO constructor with fields!!!)
			private SmartDevice()
			{
				
			}

		//getters (normal)
			public String getModel() {
				return model;
			}

			public String getManufacturer() {
				return manufacturer;
			}

			public boolean isHasWiFi() {
				return hasWiFi;
			}

			public ISIMCard getSIM() {
				return SIM;
			}

			public IGPS getGPS() {
				return GPS;
			}

			public IDisplay getDisplay() {
				return Display;
			}

			public IExternalMemory getMemory() {
				return memory;
			}

		//setters (private)
			private void setModel(String model) {
				this.model = model;
			}

			private void setManufacturer(String manufacturer) {
				this.manufacturer = manufacturer;
			}

			private void setHasWiFi(boolean hasWiFi) {
				this.hasWiFi = hasWiFi;
			}

			private void setSIM(ISIMCard sIM) {
				SIM = sIM;
			}

			private void setGPS(IGPS gPS) {
				GPS = gPS;
			}

			private void setDisplay(IDisplay display) {
				Display = display;
			}

			private void setMemory(IExternalMemory memory) {
				this.memory = memory;
			}
			
			
		//BUILDER
			public static class SmartDeviceBuilder
			{
//				//instance of builder
//					private SmartDevice smartDevice = null;
				
				//specific attributes from the main class
						String model;
						String manufacturer;
						boolean hasWiFi;
						
					//addOns:
						ISIMCard SIM;
						IGPS GPS;
						IDisplay Display;
						IExternalMemory memory;
				
				//constructor with fields (mandatory)
					public SmartDeviceBuilder (String model, String manufacturer)
					{
							this.model = model;
							this.manufacturer = manufacturer;
					}
					
				//builders (getters that set)
					public SmartDeviceBuilder addWiFi ()
					{
						this.hasWiFi = true;
						return this;
					}
					
					public SmartDeviceBuilder addSIM (ISIMCard sim)
					{
						this.SIM = sim;
						return this;
					}
					
					public SmartDeviceBuilder addDisplay (IDisplay display)
					{
						this.Display = display;
						return this;
					}
					
					public SmartDeviceBuilder addMemoryCard (IExternalMemory memory)
					{
						this.memory = memory;
						return this;
					}
					
				//the building method
					public SmartDevice build()
					{
						SmartDevice smartDevice = new SmartDevice();
						smartDevice.setDisplay(this.Display);
						smartDevice.setGPS(this.GPS);
						smartDevice.setHasWiFi(this.hasWiFi);
						smartDevice.setSIM(this.SIM);
						addMemoryCard(this.memory);
						return smartDevice;
					}
			}
}
