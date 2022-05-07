package structurals.proxy.spital;

public class Pacient extends AbstractPacient
{
	public Pacient(String nume, boolean hasEnsurance)
	{
		super(nume, hasEnsurance);
	}

	@Override
	public boolean internare()
	{
		System.out.println(this.nume + " - INTERNARE, asigurare - " + this.hasEnsurance);
		return true;
	}

	@Override
	public void consult()
	{
		System.out.println(this.nume + " - CONSULT");
	}

}
