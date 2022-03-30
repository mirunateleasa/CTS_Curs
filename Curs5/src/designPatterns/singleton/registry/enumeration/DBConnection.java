package designPatterns.singleton.registry.enumeration;

public enum DBConnection {
	LOCAL("127.0.0.1", 3306, "university"),	//this is a singleton
	PROD("10.0.0.1", 3303, "test");
	
	String serverIP;
	int serverPort;
	String database;
	
	boolean isOpen = false;
	
	private DBConnection(String serverIP, int serverPort, String database)
	{
		this.serverIP = serverIP;
		this.serverPort = serverPort;
		this.database = database;
	}
	
	public void connect()
	{
		if (!isOpen)
		{
			System.out.println("Connecting to " + this.serverIP);	
			isOpen = true;
		}
		else 
		{
			System.out.println("You are already connected to: " + serverIP);
		}
	}
}