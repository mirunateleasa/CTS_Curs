package designPatterns.singleton.lazy;

public class Main {

	public static void main(String[] args) {
		DBConnection dbConnection1 = DBConnection.getConnection();
		dbConnection1.connect();
		
		DBConnection dbConnection2 = DBConnection.getConnection();
		dbConnection2.connect();  //this is the same connection
	
	}

}
