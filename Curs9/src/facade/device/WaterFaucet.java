package facade.device;

public class WaterFaucet {
	protected boolean isClosed = true;
	
	public void close(){
		this.isClosed = true;
	}
	
	public void open(){
		this.isClosed = false;
	}
}
