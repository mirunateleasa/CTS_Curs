package structurals.adapter.hero.adapters.classes;

import structurals.adapter.hero.adapters.classes.Disney2ACMEAdapter;
import structurals.adapter.hero.classes.ACMEHero;
import structurals.adapter.hero.classes.DisneyHero;
import structurals.adapter.hero.interfaces.iACMEHero;

public class Main
{

	public static void main(String[] args)
	{
		ACMEHero superman = new ACMEHero("Superman", 500);
		DisneyHero vader = new DisneyHero("Vader");
		iACMEHero vaderACME =  new Disney2ACMEAdapter(vader.name, 100);
		
		superman.run(50);
		vader.move(50, 10);
		vaderACME.run(50);
	}

}
