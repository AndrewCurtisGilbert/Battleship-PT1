public class board
{
  private String[][] board;
  private Ship[] ships = new Ship[5];;
  private int shipNumber = 0;


  public board(int size){
    this.board = new String[size][size];
    this.ships = ships;
    for (int i = 0; i < size; i++){
      for (int j = 0; j < size; j++){
        this.board[i][j] = "x";
      }
    }
  }

  public void print(){
    for (int i = 0; i < board.length; i++){
      for (int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
  }
  public void placeShip(int row, int col, boolean isVertical,Ship shippy ){
    if (isVertical){
      for (int i = 0; i < shippy.size; i++){
        this.board[row + i][col] = "S";
      }
    }
    else{
      for (int i = 0; i < shippy.size; i++){
        this.board[row][col + i] = "S";
      }
    }
    ships[shipNumber] = shippy;
    this.shipNumber++;
      }
}

  