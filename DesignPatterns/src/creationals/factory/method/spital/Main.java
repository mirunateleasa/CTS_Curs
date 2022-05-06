package creationals.factory.method.spital;

import creationals.factory.method.classes.Medic;
import creationals.factory.method.factories.FactoryMedic;

//.In cadrul aplicației personalul spitalului este de mai multe tipuri: Brancardier, Asistent, Medic.s
//Să se implementeze modulul care pune la dispoziției crearea de obiecte din familia obiectelor 
//PersonalSpital. Modulul trebuie realizat, astfel încât pentru adăugări de noi tipuri de personal să 
//nu fie necesare modificări în codul existent.

public class Main
{

	public static void main(String[] args)
	{
		Medic medic1 = (Medic) new FactoryMedic().getPersonal();
		
		System.out.println(medic1.descriePersonal());
	}

}
