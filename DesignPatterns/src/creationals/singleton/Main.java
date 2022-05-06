package creationals.singleton;

import creationals.singleton.eager.Agency;

public class Main {

	public static void main(String[] args) {
		Agency oneAgency = Agency.getInstance("Miruna Tour", 1000, 5);
		Agency twoAgency = Agency.getInstance("GheorghitaTour", 2500, 3);
		
		System.out.println(oneAgency.getName());
		System.out.println(twoAgency.getName());
	}

}
