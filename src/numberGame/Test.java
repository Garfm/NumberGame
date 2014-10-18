package numberGame;

public class Test {

	public static void main(String[] args) {
		NumberTile myTile=new NumberTile();
		GameBoard myBoard= new GameBoard();
		int turns=0;
		
		System.out.println(myTile.toString());
		myTile.doubleValue();
		System.out.println(myTile.toString());
		
		
		myBoard.printBoard();
		myBoard.CreateNewBoard();
		System.out.println();
		myBoard.printBoard();
		while(myBoard.getGameLoop()){
		System.out.println("SCORE:"+myBoard.getScore());
		myBoard.makeMove();
		myBoard.printBoard();
		
		turns++;
		}
		
		// how to end game???

	}

}
