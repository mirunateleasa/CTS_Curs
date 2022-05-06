package structurals.adapter.hero.adapters.objects;

import structurals.adapter.hero.classes.DisneyHero;
import structurals.adapter.hero.interfaces.iACMEHero;
import structurals.adapter.hero.interfaces.iDisneyHero;

public class Disney2ACMEAdapter implements iACMEHero
{
	DisneyHero disneyHero;
	
	public Disney2ACMEAdapter(DisneyHero disneyHero)
	{
		super();
		this.disneyHero = disneyHero;
	}

	@Override
	public void run(int distance)
	{
		int defaultSpeed = 10;
		this.disneyHero.move(distance, defaultSpeed);
	}

	@Override
	public void defend(int points)
	{
		System.out.println("Disney Adapted to ACME Hero " + this.disneyHero.name + " - defending and loosing " + points + " points");		
		this.disneyHero.points -= points;
	}

	@Override
	public void heal(int points)
	{
		this.disneyHero.recoverPoints(points);
	}

}
