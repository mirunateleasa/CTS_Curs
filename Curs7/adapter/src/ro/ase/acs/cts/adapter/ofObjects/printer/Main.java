package ro.ase.acs.cts.adapter.ofObjects.printer;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		InkPrinterInterface hrPrinter = new InkPrinter();
		InkPrinterInterface devFloorPrinter = new InkPrinter();
		
		hrPrinter.print("CV");
		
		LaserPrinterInterface ceoPrinter = new LaserPrinter();
		
		//this is not ok because it changes the solution and it adds even more objects
		ArrayList<InkPrinterInterface> oldPrinters;
		ArrayList <LaserPrinterInterface> newPrinters;
		
		//we need to adapt the ink printer to the laser printer
		ArrayList <InkPrinterInterface> inkPrinters = new ArrayList<>();
		inkPrinters.add(hrPrinter);
		inkPrinters.add(devFloorPrinter);
		//inkPrinters.add(ceoPrinter); --this won't work
		Laser2InkPrinterAdapter l2iAdapter = new Laser2InkPrinterAdapter(ceoPrinter);
		inkPrinters.add(l2iAdapter);
		
		Laser2InkPrinterAdapter l2iAdapterAgain = new Laser2InkPrinterAdapter(new LaserPrinter());
		inkPrinters.add(l2iAdapterAgain);
		
		for (InkPrinterInterface printer : inkPrinters)
		{
			printer.print("\nHello! \n How are you?");
		}
	}

}
