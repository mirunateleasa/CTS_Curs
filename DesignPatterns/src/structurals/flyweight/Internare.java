package structurals.flyweight;

public class Internare
{
	public String pacientName;
	public int roomNo;
	public int bedNo;
	public int days;
	
	public Internare(String name, int roomNo, int bedNo, int days)
	{
		super();
		this.pacientName = name;
		this.roomNo = roomNo;
		this.bedNo = bedNo;
		this.days = days;
	}
	@Override
	public String toString()
	{
		return super.toString();
	}
}
