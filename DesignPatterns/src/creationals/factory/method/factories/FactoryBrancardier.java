package creationals.factory.method.factories;

import creationals.factory.method.classes.Brancardier;
import creationals.factory.method.classes.PersonalSpital;

public class FactoryBrancardier implements iFactory
{
	@Override
	public PersonalSpital getPersonal()
	{
		return new Brancardier();
	}

}
