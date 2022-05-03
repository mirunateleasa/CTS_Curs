package ro.ase.acs.cts.adapter.ofObjects.printer;

public class LaserPrinter implements LaserPrinterInterface{

	@Override
	public void print(String [] paragraphs) {
		System.out.println("Laser Printing: ");
		for (String paragraph : paragraphs)
			System.out.println("\t" + paragraph);
	}

	@Override
	public void cancel() {
		System.out.println("Laser Canceling printing...");
	}

}
