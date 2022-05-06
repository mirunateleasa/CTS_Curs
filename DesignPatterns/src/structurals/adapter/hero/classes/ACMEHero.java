package structurals.adapter.hero.classes;

import structurals.adapter.hero.interfaces.iACMEHero;

public class ACMEHero implements iACMEHero
{
	public String name;
	public int beginningPoints;
	
	public ACMEHero(String name, int beginningPoints)
	{
		super();
		this.name = name;
		this.beginningPoints = beginningPoints;
	}

	@Override
	public void run(int distance)
	{
		System.out.println("ACME Hero " + this.name + " - running " + distance + " miles");		
	}

	@Override
	public void defend(int points)
	{
		System.out.println("ACME Hero " + this.name + " - defending and loosing " + points + " points");		
		this.beginningPoints -= points;
		
	}

	@Override
	public void heal(int points)
	{
		System.out.println("ACME Hero " + this.name + " - healing and winning " + points + " points");		
		this.beginningPoints += points;
	}

}
