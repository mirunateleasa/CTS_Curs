package ro.ase.acs.cts.documents.models;

public abstract class AbstractDocument {
	private String name;
	
	public abstract String getType();
	public abstract void print(String text);
	
	public void setName(String name){
		this.name = name;
	}
}
