package structurals.adapter.hero.classes;

import structurals.adapter.hero.interfaces.iDisneyHero;

public class DisneyHero implements iDisneyHero
{
	public String name;
	public int points;
	
	public DisneyHero(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public void recoverPoints(int points)
	{
		System.out.println("DISNEY Hero " + this.name + " - recover" + points + "points");		
	}

	@Override
	public void move(int distance, float speed)
	{
		System.out.println("DISNEY Hero " + this.name + " - moving");		
	}
	
}
