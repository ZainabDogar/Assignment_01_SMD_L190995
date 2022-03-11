package Question_03;

interface Protocol 
{
  public int next();
}

class Player implements Protocol 
{
  private String name;
  
  public int next()
  {
	  System.out.print("PLAYER NEXT!");
	  System.out.print("\n");
      return 1;
  }
}

class Game extends Player
{
  private int secret_number;
  private int high;
  private int low;
  private boolean win_flag;
  private Player player;
  
  public Game(Player player1)
  {
      player = player1;
  }
  public void run()
  {
      System.out.print("GAME RUNNING! \n");
  }
  public boolean hasWon()
  {
      System.out.print("HASWON BOOL VALUE IS: \n");
      return win_flag;
  }
}

class NaiveAI extends Player 
{
  public int next()
  {
	  System.out.print("NAIVEAI NEXT!");
	  System.out.print("\n");
      return 1;
  }
}

class BinarySearchAI extends NaiveAI
{
  public int next()
  {
	  System.out.print("BINARYSEARCHAI NEXT!");
	  System.out.print("\n");
      return 1;
  }
}

class SuperAI extends NaiveAI 
{
  public int next()
  {
	  System.out.print("SUPERAI NEXT!");
	  System.out.print("\n");
      return 1;
  }
}

class HumanPlayer extends Player 
{
  public int next()
  {
	  System.out.print("HUMANPLAYER NEXT!");
	  System.out.print("\n");
      return 1;
  }
}

class main 
{
  public static void main(String[] args) 
  {
      Player players = new Player();
      Game gamee = new Game(players);
	  System.out.print("MAIN FUNC!");
	  System.out.print("\n");
      gamee.run();
  }
}