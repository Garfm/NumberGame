package numberGame;

public class Location {
	int row, col;
	NumberTile Spot;
public Location(int r, int c) {
	row=r;
	col=c;
	NumberTile Spot;
}
public int getRow() {
	return row;
}
public int getCol() {
	return col;
}
public NumberTile getTile() {
	return Spot;
}

}
