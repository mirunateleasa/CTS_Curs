package creationals.factory.method.factories;

import creationals.factory.method.classes.Asistent;
import creationals.factory.method.classes.PersonalSpital;

public class FactoryAsistent implements iFactory
{

	@Override
	public PersonalSpital getPersonal()
	{
		return new Asistent();
	}

}
