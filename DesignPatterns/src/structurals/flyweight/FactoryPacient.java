package structurals.flyweight;

import java.util.HashMap;

public class FactoryPacient
{
	public HashMap<String, Pacient>listaPacienti = new HashMap<>();
	
	public Pacient getPacient (String nume, String phoneNo, String address)
	{
		if (listaPacienti.containsKey(nume))
		{
			return listaPacienti.get(nume);
		}
		else 
		{
			Pacient pacient = new Pacient(nume, phoneNo, address);
			listaPacienti.put(nume, pacient);
			return pacient;
		}
	}
}	
