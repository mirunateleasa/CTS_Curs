package creationals.factory.simple.weapon.factories;

import creationals.factory.simple.weapon.IWeapon;
import creationals.factory.simple.weapon.SuperWeapon;

public class FactorySuperWeapon implements IFactory
{

	@Override
	public IWeapon create()
	{
		return new SuperWeapon();
	}
	
}
