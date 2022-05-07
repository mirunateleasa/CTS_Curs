package structurals.facade.spital.classes;

public class Medic
{
	public String name;

	public Medic(String name)
	{
		super();
		this.name = name;
	}
	
	public void getConfirmare (String namePacient)
	{
		System.out.println("Medicul " + this.name + " confirmare in curs pentru " + namePacient);
	}
	
}
