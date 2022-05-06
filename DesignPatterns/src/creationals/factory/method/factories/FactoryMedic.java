package creationals.factory.method.factories;

import creationals.factory.method.classes.Medic;
import creationals.factory.method.classes.PersonalSpital;

public class FactoryMedic implements iFactory
{
	@Override
	public PersonalSpital getPersonal()
	{
		return new Medic();
	}

}
