public class Ship
{
  private int health;
  static int size;
  private boolean isSunk;
  static int[] locations = new int[2];

  public Ship(int health, int size){
    this.health = health;
    this.size = size;
  }
}