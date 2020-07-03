package ua.lviv.lgs;

public class Automobile 
{
	private int horsePower;
	private int year;
	private Engine engine = new Engine();
	private Wheel wheel = new Wheel();
	
	public Automobile(int horsePower, int year, int diameter, String material, int numberOfCylinders)
	{
		super();
		this.horsePower = horsePower;
		this.year = year;
		this.wheel.setDiameter(diameter);
		this.wheel.setMaterial(material);
		this.engine.setNumberOfCylinders(numberOfCylinders);
	}
	
	public Automobile()
	{
		super();
	}
	
	public void setRandom()
	{
		this.horsePower = (int) (100 + 200 * Math.random());
		this.year = (int) (1950 + 70 * Math.random());
		this.wheel.setRandom();
		this.engine.setRandom();
	}

	@Override
	public String toString() {
		return "Automobile [horsePower=" + horsePower + ", year=" + year + ", engine=" + engine + ", wheel=" + wheel
				+ "]";
	}

	
	
}
