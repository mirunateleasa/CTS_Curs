package creationals.factory.simple.weapon.factories;

import creationals.factory.simple.weapon.IWeapon;
import creationals.factory.simple.weapon.NormalWeapon;

public class FactoryNormalWeapon implements IFactory
{
	@Override
	public IWeapon create()
	{
		return new NormalWeapon();
	}

}
