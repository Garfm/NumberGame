package numberGame;

import java.util.Scanner;

public class GameBoard {
	static int score=0;
	static int endGameCounter=0;
	static boolean gameLoop=true;
	static NumberTile[][] board = new NumberTile[4][4];
	public GameBoard(){
		NumberTile[][] board = new NumberTile[4][4];
		int score=0;
		boolean gameLoop=true;
	}
	public NumberTile[][] getBoard(){
		return board;
	}
	public boolean getGameLoop(){
		return gameLoop;
	}
	public int getScore(){
		return score;
	}
	//Start New Game Board (4X4 Array with 2 Random Tiles between 2 or 4)
	public void CreateNewBoard(){
		board[(int)(Math.random()*4)][(int)(Math.random()*4)]= new NumberTile();
		int temp1 = (int)(Math.random()*4);
		int temp2 = (int)(Math.random()*4);
		while(board[temp1][temp2]!=null){
			temp1 = (int)(Math.random()*4);
			temp2 = (int)(Math.random()*4);
		}
		board[temp1][temp2]= new NumberTile();
	}
	
	public void printBoard(){

		for(int row=0; row<board.length; row++){
			for(int col=0; col<board.length; col++){
				

					System.out.print("-"+board[row][col]+"-");

				}
			System.out.println();
			}

	}
	
	// Move Tiles Class
	
	public void makeMove(){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Row Coordinate (0-3):");
		int tempRow= scan.nextInt();
		System.out.println("Enter Coloumn Coordinate (0-3):");
		int tempCol = scan.nextInt();
		while(board[tempRow][tempCol]==null){
			System.out.println("There is no Tile there Pick different coordinates");
			System.out.println("Enter Row Coordinate (0-3):");
			tempRow= scan.nextInt();
			System.out.println("Enter Coloumn Coordinate (0-3):");
			tempCol = scan.nextInt();
		}
		
		// insert converge on temp coordinates
	GameBoard.converge(tempRow, tempCol);
	}
	
	
	public static void converge(int row, int col){
		// makes row and col into 1 d arrays to check the specific column and row of the tile selected
		NumberTile[] tempRow = new NumberTile[4];
		NumberTile[] tempCol = new NumberTile[4];
		int i=0;
		int y=0;
		
		// for to create Row
		for (NumberTile element: tempRow){
			tempRow[i]=board[row][i];
			i++;
	}// end of for to create Row
		
	// for to create Col
		for (NumberTile element: tempCol){
			tempCol[y]=board[y][col];
			y++;
	}
		GameBoard.checkRow(tempRow, row, col);
		GameBoard.checkCol(tempCol, row, col);
		
		
		// creates random tile after numbers are done combining
		int temp1 = (int)(Math.random()*4);
		int temp2 = (int)(Math.random()*4);
		while(board[temp1][temp2]!=null){
			temp1 = (int)(Math.random()*4);
			temp2 = (int)(Math.random()*4);
			endGameCounter++;
			if(endGameCounter+1==Integer.MAX_VALUE){
				System.out.println("GAME OVER! Score:"+score);
				gameLoop=false;
				break;
			}
		}
		board[temp1][temp2]= new NumberTile();
		
	//Combine Tiles Class
	//Score
	

	}

	public static void checkRow (NumberTile[] tempRow, int row, int col){
		for(int i=0; i<4;i++){
			if(board[row][col]!=null&&tempRow[i]!=null){
				
				
				
				// if the tile is the same value and directly next to selected tile double selected tile and delete checked tile
//				if(board[row][col].getTileValue()==tempRow[i].getTileValue()&&i!=col&&(i==col+1||i==col-1)){
//					board[row][col].doubleValue();
//					board[row][i]=null;
//					i=0;
//					
//				}
				// else if checks to see if the space to the right is available to move to
				if(i<3&&board[row][i+1]==null&&col>i){
					tempRow[i+1]=tempRow[i];
					board[row][i+1]=tempRow[i];
					board[row][i]=null;
					tempRow[i]=null;
					i=0;
					
				
				}
				// things are combining at wrong times add in booleans to see if certain actions have already occurred(maybe not theere was some other error)
				//checks if the tile to the right is the correct number to combine with and if it is it combines
				else if(i<3&&board[row][i+1]!=null&&board[row][i]!=null&&tempRow[i+1]!=null&&board[row][i+1].getTileValue()==board[row][i].getTileValue()&&col>i){
					
					board[row][i+1].doubleValue();
					score+=board[row][i+1].getTileValue();
					board[row][i]=null;
					tempRow[i]=null;
					i=0;
					
					
				}
				else if(i>0&&board[row][i-1]==null&&col<i){
					tempRow[i-1]=tempRow[i];
					board[row][i-1]=tempRow[i];
					board[row][i]=null;
					tempRow[i]=null;
					i=0;
					
					System.out.println("else if reached in for loop to check row i="+i);
					
				}
				else if(i>0&&board[row][i-1]!=null&&board[row][i]!=null&&tempRow[i-1]!=null&&board[row][i-1].getTileValue()==board[row][i].getTileValue()&&col<i){
					
					board[row][i-1].doubleValue();
					score+=board[row][i-1].getTileValue();
					board[row][i]=null;
					tempRow[i]=null;
					i=0;
					
					
				}
					
					
			}
		}
			
		
	}
	
	public static void checkCol (NumberTile[] tempCol, int row, int col){
		for(int y=0; y<4; y++){
			if(board[row][col]!=null&&tempCol[y]!=null){
//				if(board[row][col].getTileValue()==tempCol[y].getTileValue()&&y!=row&&(y==row+1||y==row-1)){
//					board[row][col].doubleValue();
//					board[y][col]=null;
				if(y<3&&board[y+1][col]==null&&row>y){
					tempCol[y+1]=tempCol[y];
					board[y+1][col]=tempCol[y];
					board[y][col]=null;
					tempCol[y]=null;
					y=0;
				
				}
				
				else if(y<3&&board[y+1][col]!=null&&board[y][col]!=null&&tempCol[y+1]!=null&&board[y+1][col].getTileValue()==board[y][col].getTileValue()&&row>y){
					
					board[y+1][col].doubleValue();
					score+=board[y+1][col].getTileValue();
					board[y][col]=null;
					tempCol[y]=null;
					y=0;
					
					
				}
				else if(y>0&&board[y-1][col]==null&&row<y){
					tempCol[y-1]=tempCol[y];
					board[y-1][col]=tempCol[y];
					board[y][col]=null;
					tempCol[y]=null;
					y=0;
					
					
				}
				else if(y>0&&board[y-1][col]!=null&&board[y][col]!=null&&tempCol[y-1]!=null&&board[y-1][col].getTileValue()==board[y][col].getTileValue()&&row<y){
					
					board[y-1][col].doubleValue();
					score+=board[y-1][col].getTileValue();
					board[y][col]=null;
					tempCol[y]=null;
					y=0;
					
					
				}
					
					
			}
	}
}
	}


