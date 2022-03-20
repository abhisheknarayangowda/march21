package day10;
class Cars
{
	private int speed, brake, gear;
	private boolean clutch, accelator;
	public void start()
	{
		speed = 100;
	}
	public void stop()
	{
}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getBrake() {
		return brake;
	}
	public void setBrake(int brake) {
		this.brake = brake;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public boolean isClutch() {
		return clutch;
	}
	public void setClutch(boolean clutch) {
		this.clutch = clutch;
	}
	public boolean isAccelator() {
		return accelator;
	}
	public void setAccelator(boolean accelator) {
		this.accelator = accelator;
	}
}
class Maruthii extends Car
{
	public void colour()
	{  //start();
}}
public class AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars c = new Cars();
		c.speed=200;
		c.clutch=true;
		c.start();
		c.stop();  
			}
}
	// after typing pgm , generate getter & setter -
    // select the line [in this pgm - speed=100] , right click , generate getters & setters ,
    // select all , last member , public , generate .


