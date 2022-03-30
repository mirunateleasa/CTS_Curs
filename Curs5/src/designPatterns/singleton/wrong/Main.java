package designPatterns.singleton.wrong;

public class Main {

	public static void main(String[] args) {
		DBConnection dbConnection = new DBConnection ("127.0.0.1", 3306, "university");
		dbConnection.connect();
		
		CoursesModule courses = new CoursesModule(dbConnection);
		UserModule users = new UserModule(dbConnection);
	}

}
