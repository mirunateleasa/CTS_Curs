package creationals.builder.complete.directory;

import creationals.builder.complete.addOns.interfaces.IDisplay;
import creationals.builder.complete.addOns.interfaces.IExternalMemory;
import creationals.builder.complete.addOns.interfaces.IGPS;
import creationals.builder.complete.addOns.interfaces.ISIMCard;

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
		
	@Override
		public String toString() {
			return "SmartDevice [model=" + model + ", manufacturer=" + manufacturer + ", hasWiFi=" + hasWiFi + ", SIM="
					+ SIM + ", GPS=" + GPS + ", Display=" + Display + ", memory=" + memory + "]";
		}

		//BUILDER
		public static class SmartDeviceBuilder
		{
			//instance of builder
				private SmartDevice smartDevice = null;
			
			//constructor with fields (mandatory)
				public SmartDeviceBuilder (String model, String manufacturer)
				{
					this.smartDevice = new SmartDevice();
					this.smartDevice.setModel(model);
					this.smartDevice.setManufacturer(manufacturer);
				}
				
			//builders (getters that set)
				public SmartDeviceBuilder addWiFi ()
				{
					this.smartDevice.setHasWiFi(true);
					return this;
				}
				
				public SmartDeviceBuilder addSIM (ISIMCard sim)
				{
					this.smartDevice.setSIM(sim);
					return this;
				}
				
				public SmartDeviceBuilder addDisplay (IDisplay display)
				{
					this.smartDevice.setDisplay(display);
					return this;
				}
				
				public SmartDeviceBuilder addMemoryCard(IExternalMemory memoryCard) {
					this.smartDevice.setMemory(memoryCard);
					return this;
				}
				
			//the building method
				public SmartDevice build()
				{
					return this.smartDevice;
				}
		}
}
