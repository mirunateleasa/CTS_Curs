package structurals.facade.spital.classes;

import java.util.ArrayList;

public class Salon
{
	public int no;
	public ArrayList<Integer> paturiDisponibile = new ArrayList<>();
	
	public Salon(int no, ArrayList<Integer> paturiDisponibile)
	{
		super();
		this.no = no;
		this.paturiDisponibile = paturiDisponibile;
	}
	
	public void addPat (int no)
	{
		this.paturiDisponibile.add(no);
	}
	
	public boolean eLiber (int patNo)
	{
		if (paturiDisponibile.contains(patNo))
			return true;
		else return false;
	}
}
