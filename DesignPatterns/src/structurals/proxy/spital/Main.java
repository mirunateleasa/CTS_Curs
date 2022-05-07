package structurals.proxy.spital;

public class Main
{
	//Deoarece Spitalul este supraaglomerat se impune ca atunci când pacienții doresc internarea să 
	//fie internate doar personale care au asigurare de sănătate. Sa se realizeze un nivel intermediar care 
	//sa permită internarea doar acestor persoane.

	public static void main(String[] args)
	{
		AbstractPacient pacient1 = new Pacient("Miruna", false);
		pacient1.consult();
		pacient1.internare();
		
		AbstractPacient pacient2 = new ProxyInternare(new Pacient("Gabriela", false));
		pacient2.internare();
	}

}
