
public class Board
{
	public static void main(String[] args)
	{
		String[][] board = new String[8][8];
		String square = "#";
		String rook = "R";
		String knight = "N";
		String bishop = "B";
		String queen = "Q";
		String king = "K";
		String pawn = "p";
		
		for (int i = 0; i < board.length; i++)
		{
			for (int k = 0; k < board[i].length; k++)
			{
				board[i][k] = square;
			}
		}
		
		board[0][0] = rook;
		board[0][7] = rook;
		board[7][0] = rook;
		board[7][7] = rook;
		
		board[0][1] = knight;
		board[0][6] = knight;
		board[7][1] = knight;
		board[7][6] = knight;
		
		board[0][2] = bishop;
		board[0][5] = bishop;
		board[7][2] = bishop;
		board[7][5] = bishop;
		
		board[0][3] = queen;
		board[7][3] = queen;
		
		board[0][4] = king;
		board[7][4] = king;
		
		for(int i = 0; i < board.length; i++)
		{
			board[1][i] = pawn;
		}
		
		for(int i = 0; i < board.length; i++)
		{
			board[6][i] = pawn;
		}
		
		for (int i = 0; i < board.length; i++)
		{
			for (int k = 0; k < board[i].length; k++)
			{
				System.out.print(board[i][k] +" ");
			}
			System.out.println();
		}
		
	}
}
