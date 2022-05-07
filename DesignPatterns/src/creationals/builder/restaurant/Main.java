package creationals.builder.restaurant;

import creationals.builder.restaurant.Rezervare.RezervareBuilder;

public class Main
{
	
	//Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la geam, 
	//scaune ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul în 
	//care clientul nu specifică vreun element dintre acestea, este setat pe false. Să se implementeze 
	//modulul care permite crearea de obiecte de tip rezervare cu aceste opțiuni extra.

	public static void main(String[] args)
	{
		Rezervare rezervare1 = new Rezervare.RezervareBuilder(33, "Miruna").build();
		System.out.println(rezervare1.ergonomicChairs);	
		
		Rezervare rezervare2 = new Rezervare.RezervareBuilder(10, "Alina").setMusic(true).build();
		System.out.println(rezervare2.music);
	}

}
