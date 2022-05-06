package creationals.prototype;

import java.util.ArrayList;

public class Main
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		ArrayList<String> boliCopii = new ArrayList<>();
		boliCopii.add("raceala");
		boliCopii.add("varicela");
		
		RetetaNurofen nurofenCopii = new RetetaNurofen(boliCopii);
		RetetaNurofen nurofenAdulti = (RetetaNurofen) nurofenCopii.clone();
		
		System.out.println(nurofenAdulti.boli.toString());
		System.out.println(nurofenCopii.boli.toString() + "\n");
		
		nurofenAdulti.boli.add("hepatita");
		System.out.println(nurofenAdulti.boli.toString());
		System.out.println(nurofenCopii.boli.toString() + "\n");
	}

}
