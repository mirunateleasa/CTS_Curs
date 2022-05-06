package creationals.prototype;

import java.util.ArrayList;

public class RetetaNurofen extends Reteta
{
	public ArrayList<String> boli = new ArrayList<>();
	
	public RetetaNurofen (ArrayList <String> boli)
	{
		this.ingrediente.add("ibuprofen");
		this.ingrediente.add("vodka");
		this.ingrediente.add("opiu");
		this.ingrediente.add("portocala");
		
		for (String boala : boli)
		{
			this.boli.add(boala);
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		RetetaNurofen clone = new RetetaNurofen(this.boli);
		return clone;
	}
	
	
}
