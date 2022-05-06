package structurals.decorator.restaurant;

public class Main
{

	public static void main(String[] args)
	{
		AbstractNota nota1 = new Nota(2, 50);
		System.out.println(nota1.printeazaNota());
		
		nota1 = new SpecialNotaDecorator(nota1);
		System.out.println(nota1.printeazaNota());
	}

}
