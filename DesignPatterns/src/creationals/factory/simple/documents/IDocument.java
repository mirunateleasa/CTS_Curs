package creationals.factory.simple.documents;

public abstract class IDocument
{
	private String name;
	
	public abstract String getType();
	public abstract void print (String text);
	
	public void setName (String name)
	{
		this.name = name;
	}
}
