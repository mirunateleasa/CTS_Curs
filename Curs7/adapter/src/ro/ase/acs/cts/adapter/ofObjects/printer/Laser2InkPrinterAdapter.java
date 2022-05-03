package ro.ase.acs.cts.adapter.ofObjects.printer;

public class Laser2InkPrinterAdapter implements InkPrinterInterface {
	LaserPrinterInterface laserPrinter;
	
	//always define: 
	public Laser2InkPrinterAdapter (LaserPrinterInterface laserPrinter)
	{
		this.laserPrinter = laserPrinter;
	}

	@Override
	public void print(String text) {
		String [] paragraphs = text.split("\n");
		this.laserPrinter.print(paragraphs);
	}

	@Override
	public void cancel() {
		this.laserPrinter.cancel();
	} 
}
