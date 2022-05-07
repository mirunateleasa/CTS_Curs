package structurals.facade.spital;

import java.util.ArrayList;

import structurals.facade.spital.classes.Medic;
import structurals.facade.spital.classes.Pacient;
import structurals.facade.spital.classes.Salon;
import structurals.facade.spital.classes.Stare;

public class FacadeInternare
{
	public void interneaza(String numePacient, String numeMedic, int salonNo)
	{
		ArrayList<Integer> paturi = new ArrayList<>();
		paturi.add(2);
		paturi.add(10);
		paturi.add(32);
		
		Pacient pacient = new Pacient(numePacient, Stare.FOARTE_GRAVA);
		Medic medic = new Medic(numeMedic);
		Salon salon = new Salon(salonNo, paturi);
		
		pacient.verificaGravitate();
		medic.getConfirmare(numePacient);
		salon.eLiber(3);
	}
}
