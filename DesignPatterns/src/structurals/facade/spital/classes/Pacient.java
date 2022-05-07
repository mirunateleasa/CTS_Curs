package structurals.facade.spital.classes;

public class Pacient
{
	public String name;
	public Stare stare;
	
	public Pacient(String name, Stare stare)
	{
		super();
		this.name = name;
		this.stare = stare;
	}
	
	public void verificaGravitate ()
	{
		System.out.println("Pacient in stare " + this.stare);
	}
}
