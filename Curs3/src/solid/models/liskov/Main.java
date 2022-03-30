package solid.models.liskov;

public class Main {

	public static void main(String[] args) {
		
		//GeometricalModel figure = new Square();
		GeometricalModel figure = new Rectangle();
		figure.getPerimeter();
		
		//LISKOV = you can change line 7 to line 8 anytime without actually changing the program. 
	}

}
