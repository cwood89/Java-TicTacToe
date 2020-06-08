public class TicTacToe {
  // Instance Variables
  private char[][] board;
  private int turns;

  // Constructors
  public TicTacToe() {
    board = new char[3][3];
    turns = 0;

    for (int r = 0; r < 3; r++)
      for (int c = 0; c < 3; c++)
        board[r][c] = ' ';
  }

  // Accessor Methods

  public boolean isWinner(char p) {
    // row1
    if (this.board[0][0] == p && this.board[0][1] == p && this.board[0][2] == p) {
      return true;
      // row 2
    } else if (this.board[1][0] == p && this.board[1][1] == p && this.board[1][2] == p) {
      return true;
      // row 3
    } else if (this.board[2][0] == p && this.board[2][1] == p && this.board[2][2] == p) {
      return true;
      // column1
    } else if (this.board[0][0] == p && this.board[1][0] == p && this.board[2][0] == p) {
      return true;
      // column 2
    } else if (this.board[0][1] == p && this.board[1][1] == p && this.board[2][1] == p) {
      return true;
      // column 3
    } else if (this.board[0][2] == p && this.board[1][2] == p && this.board[2][2] == p) {
      return true;
      // diagonal 1
    } else if (this.board[0][0] == p && this.board[1][1] == p && this.board[2][2] == p) {
      return true;
      // diagonal 2
    } else if (this.board[0][2] == p && this.board[1][1] == p && this.board[2][0] == p) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isFull() {
    if (this.turns == 9) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isCat() {
    if (this.isFull() && !this.isWinner('X') && !this.isWinner('O')) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isValid(int r, int c) {
    if (0 <= r && r < 3 && 0 <= c && c < 3)
      return true;
    else
      return false;
  }

  public int numTurns() {
    return turns;
  }

  public char playerAt(int r, int c) {
    if (isValid(r, c))
      return board[r][c];
    else
      return '@';
  }

  public void displayBoard() {
    System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
    System.out.println("    --+-+--");
    System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
    System.out.println("    --+-+--");
    System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    System.out.println("     0 1 2 ");
  }

  public char boardVal(int r, int c) {
    return this.board[r][c];
  }

  // Modifiers
  public void playMove(char p, int r, int c) {
    this.board[r][c] = p;
    this.turns++;
  }
}