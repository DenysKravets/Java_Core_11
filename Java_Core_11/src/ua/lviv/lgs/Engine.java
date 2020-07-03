package ua.lviv.lgs;

public class Engine 
{
	private int numberOfCylinders;

	public Engine(int numberOfCylinders)
	{
		super();
		this.numberOfCylinders = numberOfCylinders;
	}
	
	public Engine()
	{
		super();
	}
	
	public void setRandom()
	{
		this.numberOfCylinders = (int) (10 * Math.random());
	}

	@Override
	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}
	
	
}
