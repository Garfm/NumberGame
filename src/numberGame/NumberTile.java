package numberGame;

public class NumberTile {

	int tileValue=0;
	public NumberTile(){
		this.tileValue = NumberTile.createTileValue();
	}
	private static int createTileValue(){
		if((int)(Math.random()*2)==1)
			return 2;
		else
			return 4;
	}
	
	public void doubleValue(){
		this.setTileValue(this.getTileValue()*2);
	}
	
	public String toString(){
		return "["+this.getTileValue()+"]";
	}
	public int getTileValue() {
		return tileValue;
	}
	public void setTileValue(int tileValue) {
		this.tileValue = tileValue;
	}
}
