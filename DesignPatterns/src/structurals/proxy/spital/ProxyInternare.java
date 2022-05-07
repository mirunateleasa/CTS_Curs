package structurals.proxy.spital;

public class ProxyInternare extends AbstractPacient
{
	AbstractPacient aPacient = null;
	
	public ProxyInternare(AbstractPacient aPacient)
	{
		super(aPacient.nume, aPacient.hasEnsurance);
		this.aPacient = aPacient;
	}

	@Override
	public boolean internare()
	{
		if (this.aPacient.hasEnsurance == true)
		{
			System.out.println(this.aPacient.nume + " - INTERNARE, asigurare - " + this.aPacient.hasEnsurance);
			return true;
		}
		else 
			{
				System.out.println(this.aPacient.nume + " - NU se poate face INTERNARE");
				return false;
			}
	}

	@Override
	public void consult()
	{
		
	}

}
