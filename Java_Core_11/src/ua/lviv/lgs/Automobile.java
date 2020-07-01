package ua.lviv.lgs;

public class Automobile 
{
	private int horsePower;
	private int year;
	
	public Automobile(int horsePower, int year)
	{
		super();
		this.horsePower = horsePower;
		this.year = year;
	}

	@Override
	public String toString() 
	{
		return "Automobile [horsePower=" + horsePower + ", year=" + year + "]";
	}
	
}
