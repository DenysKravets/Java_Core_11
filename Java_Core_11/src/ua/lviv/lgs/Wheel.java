package ua.lviv.lgs;

public class Wheel
{
	private double diameter;
	private String material;
	
	public Wheel(int diameter, String material) 
	{
		super();
		this.diameter = diameter;
		this.material = material;
	}
	
	public Wheel() 
	{
		super();
	}
	
	public void setRandom()
	{
		this.diameter = 10 * Math.random();
		
		double dice = Math.random();
		if(dice > 0.5)
		{
			this.material = "denim";
		} else {
			this.material = "leather";
		}
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", material=" + material + "]";
	}
	
	
}
