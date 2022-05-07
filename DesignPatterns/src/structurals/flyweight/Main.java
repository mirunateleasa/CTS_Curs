package structurals.flyweight;

public class Main
{
	//Pentru fiecare internare trebuie să se rețină informații cu privire la pacientul internat precum: 
	//nume, număr de telefon, adresă, etc, precum și informațiile despre salonul unde este internat: 
	//număr salon, număr pat, număr zile spitalizare, etc. Astfel, dacă un pacient este internat de mai 
	//multe ori de-a lungul timpului, informațiile despre acesta sunt aceleași și se repetă, ocupând foarte 
	//multă memorie. Să se implementeze modulul de memorare al tuturor internărilor astfel încât să nu 
	//ocupe memorie foarte multă.

	public static void main(String[] args)
	{
		FactoryPacient factory = new FactoryPacient();
		Pacient miruna = factory.getPacient("Miruna", "0723200423", "Bucuresti");
		Pacient andrei = factory.getPacient("Andrei", "07230000023", "Ploiesti");
		Pacient ion = factory.getPacient("Ion", "0723200423", "Slobozia");
		
		Internare internareMiruna = new Internare("Miruna", 23, 10, 3);
		Internare internareIon = new Internare("Ion", 3, 2, 1);
	}

}
