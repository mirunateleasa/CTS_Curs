package creationals.builder.restaurant;

public class Rezervare
{
	public int noMasa;
	public String numeClient;
	
	public boolean windowSeat;
	public boolean ergonomicChairs;
	public boolean tableDecor;
	public boolean music;

	public Rezervare(RezervareBuilder builder)
	{
		super();
		this.noMasa = builder.noMasa;
		this.numeClient = builder.numeClient;
		this.windowSeat = builder.windowSeat;
		this.ergonomicChairs = builder.ergonomicChairs;
		this.tableDecor = builder.tableDecor;
		this.music = builder.music;
	}
	
	public static class RezervareBuilder
	{
		public int noMasa;
		public String numeClient;
		
		public boolean windowSeat;
		public boolean ergonomicChairs;
		public boolean tableDecor;
		public boolean music;
		
		public RezervareBuilder(int noMasa, String numeClient)
		{
			super();
			this.noMasa = noMasa;
			this.numeClient = numeClient;
		}
		
		  RezervareBuilder setNoMasa(int noMasa)
		{
			this.noMasa = noMasa;
			return this;
		}
		 RezervareBuilder setNumeClient(String numeClient)
		{
			this.numeClient = numeClient;
			return this;
		}
		 RezervareBuilder setWindowSeat(boolean windowSeat)
		{
			this.windowSeat = windowSeat;
			return this;
		}
		 RezervareBuilder setErgonomicChairs(boolean ergonomicChairs)
		{
			this.ergonomicChairs = ergonomicChairs;
			return this;
		}
		 RezervareBuilder setTableDecor(boolean tableDecor)
		{
			this.tableDecor = tableDecor;
			return this;
		}
		 RezervareBuilder setMusic(boolean music)
		{
			this.music = music;
			return this;
		}
		
		public Rezervare build()
		{
			Rezervare rezervare = new Rezervare(this);
			return rezervare;
		}
		
	}
}
