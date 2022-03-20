package day10;
class Car
{
	protected int speed, brake, gear;
	protected boolean clutch, accelator;
	public void start()
	{
		speed = 100;
	}
	public void stop()
	{
}
}
class Maruthi extends Car
{
	public void colour()
	{  //start();
}}
public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c = new Car();
c.speed=200;
c.clutch=true;
c.start();
c.stop();  
	}
//    Generate Getters and Setters  - the operation is not applicable to the current selection.
//   select a field which is not declared as type variable or type that declares such fields.	
}
