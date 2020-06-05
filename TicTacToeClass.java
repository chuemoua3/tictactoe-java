package TicTacToe;

public class TicTacToeClass {
	// Instance Variables
	private char[][] board;
	private int turns;

	// Constructors
	public TicTacToeClass() {
		board = new char[3][3];
		turns = 0;

		for (int r = 0; r < 3; r++)
			for (int c = 0; c < 3; c++)
				board[r][c] = ' ';
	}

	// Accessor Methods
	
	// returns true if the letter passed in has three in a row
	public boolean isWinner(char p) {

		// checking down the board
		if (board[0][0] == p && board[1][0] == p && board[2][0] == p) {
			return true;
		} else if (board[0][1] == p && board[1][1] == p && board[2][1] == p) {
			return true;
		} else if (board[0][2] == p && board[1][2] == p && board[2][2] == p) {
			return true;

			// checking across the board
		} else if (board[0][0] == p && board[0][1] == p && board[0][2] == p) {
			return true;
		} else if (board[1][0] == p && board[1][1] == p && board[1][2] == p) {
			return true;
		} else if (board[2][0] == p && board[2][1] == p && board[2][2] == p) {
			return true;

			// checking diagonal the board
		} else if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
			return true;
		} else if (board[2][0] == p && board[1][1] == p && board[0][2] == p) {
			return true;
		} else {
			return false;
		}

	}

	// returns true if nine turns has been played
	public boolean isFull() {
		return turns == 9;
	}

	// returns true if all spaces are filled and no one wins
	public boolean isCat() {
		if (turns == 9 && !isWinner('X') && !isWinner('O')) {
			return true;
		} else {
			return false;
		}
	}

	// returns true if the given row and column corresponds to a valid space
	public boolean isValid(int r, int c) {
		if (0 <= r && r <= 2 && 0 <= c && c <= 2)
			return true;
		else
			return false;
	}

	// returns the numbers of turns played
	public int numTurns() {
		return turns;
	}

	// returning the char X or O on the board
	public char playerAt(int r, int c) {
		if (isValid(r, c))
			return board[r][c];
		else
			return '@';
	}

	// displays the board
	public void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	// Modifiers

	// allowing the player to place their move on a row and column where rows and
	// columns are in valid numbers of 0,1,2
	public void playMove(char p, int r, int c) {
			board[r][c] = p;
			turns++;
		}

}