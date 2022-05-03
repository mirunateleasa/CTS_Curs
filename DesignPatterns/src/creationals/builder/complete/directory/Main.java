package creationals.builder.complete.directory;

import creationals.builder.complete.directory.SmartDevice.SmartDeviceBuilder;

public class Main {

	public static void main(String[] args) {
			SmartDeviceDirectory samsungDirectory = new SmartDeviceDirectory(
					new SmartDeviceBuilder("S22", "Samsung"));
			
			SmartDevice S22 = samsungDirectory.buildS22();
			SmartDevice S22Clone = samsungDirectory.buildS22();
			
			System.out.println(S22);
			System.out.println(S22Clone);
			
			//you cannot change any of it
	}

}
