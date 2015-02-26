package lab2;


public class Vehicle 
{
	private Boolean air;
	private int airlevel;
	private Boolean radio;
	private Double station;
	
	public Vehicle()
	{
		air = false;
		airlevel = 80;
		radio = false;
		station = 96.1;
	}
	
	public Boolean getAir()
	{
		return air;
	}
	
	public void setAir(Boolean newAir)
	{
		air = newAir;
	}
	
	public int getAirlevel()
	{
		return airlevel;
	}
	
	public void setAirlevel(int level)
	{
		airlevel = level;
	}
	
	public Boolean getRadio()
	{
		return radio;
	}
	
	public void setRadio(Boolean rad)
	{
		radio = rad;
	}
	
	public Double getStation()
	{
		return station;
	}
	
	public void setStation(Double st)
	{
		station = st;
	}
}