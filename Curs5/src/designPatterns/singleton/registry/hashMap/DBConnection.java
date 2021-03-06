package designPatterns.singleton.registry.hashMap;
//used if they want to create more connections on different IPs

import java.util.HashMap;

public class DBConnection {
	//SINGLETON registry reference:
	private static HashMap<String, DBConnection> connections = new HashMap<>();
	
	String serverIP;
	int serverPort;
	String database;
	
	boolean isOpen = false;
	
	private DBConnection(String serverIP, int serverPort, String database) {
		super();
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
	
	public static synchronized DBConnection getConnection()
	{
		String defaultIP = "127.0.0.1";
		
		DBConnection connection = connections.get(connections);
		if (connection == null)
		{
			connection = new DBConnection ("127.0.0.1", 3306, "university");
			connections.put(defaultIP, connection);
		}
		return connection;
	}
	
	public static synchronized DBConnection getConnection(String ip, int port, String database)
	{		
		DBConnection connection = connections.get(ip);
		if (connection == null)
		{
			connection = new DBConnection (ip, port, database);
			connections.put(ip, connection);
		}
		return connection;
	}
}