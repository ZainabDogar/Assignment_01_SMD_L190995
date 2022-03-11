package Question_01;

/* This refers to a diamond problem which is due to multiple inheritance. Java doesnt support multiple inheritance. Instead, we make use of the interfaces and use functions from parent class in the child classes. */

			/* Question 01  */
			
			
interface Amphicar 
{
  default void methodvehicle()
  {
      System.out.print("Start Amphicar FUNC!");
  }
}

interface Boat extends Amphicar 
{
  default void methodvehicle() 
  {
      System.out.print("Start Boat FUNC!");
  }
}

interface Car extends Amphicar 
{
  default void methodvehicle() 
  {
      System.out.print("Start Car FUNC!");
  }
}

class Vehicle implements Boat, Car 
{
  public void methodvehicle() 
  {
      Boat.super.methodvehicle();
      Car.super.methodvehicle();
  }
}

class main
{
	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle();
		System.out.print("MAIN FUNC!");
		System.out.print("\n");
		v1.methodvehicle();
	}
}