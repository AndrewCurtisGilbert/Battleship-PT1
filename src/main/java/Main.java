// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
 // ship(int health, int size, int type,int[] locations, boolean isVertical)
  Ship Destroyer = new Ship(2, 2);
  Ship Submarine = new Ship(3, 3);
    board player1 = new board(8);
    player1.print();
    player1.placeShip(0,0,false,Destroyer);
    player1.placeShip(4,0,true,Submarine);
    System.out.println(" ");
    player1.print();
  }

}