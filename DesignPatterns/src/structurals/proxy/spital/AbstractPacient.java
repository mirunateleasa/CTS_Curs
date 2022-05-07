package structurals.proxy.spital;

public abstract class AbstractPacient
{
	public String nume;
	public boolean hasEnsurance;
	
	public AbstractPacient(String nume, boolean hasEnsurance)
	{
		super();
		this.nume = nume;
		this.hasEnsurance = hasEnsurance;
	}
	public abstract boolean internare();
	public abstract void consult();
}
