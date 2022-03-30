package designPatterns.singleton.wrong;

public class DBConnection {
	String serverIp;
	int serverPort;
	String database;
	public DBConnection(String serverIp, int serverPort, String database) {
		super();
		this.serverIp = serverIp;
		this.serverPort = serverPort;
		this.database = database;
	}
	
	public void connect()
	{
		System.out.println("Connecting to " + this.serverIp);
	}
}
