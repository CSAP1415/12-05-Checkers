class CheckersMove {
// A CheckersMove object represents a move in the game of Checkers.
  
// It holds the row and column of the piece that is to be moved
// and the row and column of the square to which it is to be moved.
// (This class makes no guarantee that the move is legal.)
// Position of piece to be moved.
  private int FromRow;
  private int FromCol;
// Square it is to move to.
  private int toRow;
  private int toCol;
// Constructor. Just set the values of the instance variables.
  public CheckersMove(int R1, int C1, int R2, int C2)
  {
    FromRow = R1;
    FromCol = C1;
    toRow = R2;
    toCol = C2;
  }
  
// Accessors
  public int getFromRow()
  {
    return FromRow;
  }
  public int getFromCol()
  {
    return FromCol;
  }
  public int getToRow()
  {
    return toRow;
  }
  public int getToCol()
  {
    return toCol;
  }
  public boolean isJump()
  {
    return Math.abs(toRow - FromRow)==2;
  }
  
} // end class CheckersMove.


