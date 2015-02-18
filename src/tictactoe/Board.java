//**************************************************
// Filename: Board.java
//   Author: Sean Francis
//     Date: 2/6/15
//     Desc: Creating a TicTacToe Board
//**************************************************
package tictactoe;

public class Board {

	// instance varbles
	private char[][] board = new char[3][3];

	// default constructor
	public Board() {
	}// end of defcon

	public void displayBoard() {
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++)
				System.out.print(board[x][y]);
			System.out.println();
		}// end of for
	}// end of displayBoard
	
	public void play(int row, int column, Player player) {
		
	}

}// end of class
