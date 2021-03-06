package designPatterns.singleton.registry.hashMap;

public class Main {

	public static void main(String[] args) {
		DBConnection localConnection = DBConnection.getConnection();
		localConnection.connect();
		
		DBConnection anotherLocalConnection = DBConnection.getConnection();
		anotherLocalConnection.connect(); //same connection as previous
		
		DBConnection prodConnection = DBConnection.getConnection("10.0.0.1", 3306, "test");
		prodConnection.connect(); //different connection
	}

}
