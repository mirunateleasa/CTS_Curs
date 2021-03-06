package designPatterns.singleton.eager;

public class DBConnection {
	//SINGLETON reference:
	private static DBConnection connection = new DBConnection ("127.0.0.1", 3306, "university");;
	
	String serverIp;
	int serverPort;
	String database;
	
	boolean isOpen = false;
	
	private DBConnection(String serverIp, int serverPort, String database) {
		super();
		this.serverIp = serverIp;
		this.serverPort = serverPort;
		this.database = database;
	}
	
	public void connect()
	{
		if (!isOpen)
		{
			System.out.println("Connecting to " + this.serverIp);	
			isOpen = true;
		}
		else 
		{
			System.out.println("You are already connected to: " + serverIp);
		}
	}
	
	public static synchronized DBConnection getConnection()
	{
		return DBConnection.connection;
	}
}