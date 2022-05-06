package structurals.adapter.hero.adapters.classes;

import structurals.adapter.hero.classes.ACMEHero;
import structurals.adapter.hero.interfaces.iDisneyHero;

public class Disney2ACMEAdapter extends ACMEHero implements iDisneyHero
{

	public Disney2ACMEAdapter(String name, int beginningPoints)
	{
		super(name, beginningPoints);
	}

	@Override
	public void recoverPoints(int points)
	{
		System.out.println("DISNEY Adapted Hero " + this.name + " - recover" + points + "points");		
		this.heal(points);
	}

	@Override
	public void move(int distance, float speed)
	{
		int defaultSpeed = 10;
		this.move(distance, defaultSpeed);
	}

}
