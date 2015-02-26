package program2;

public class Airplane {

	private boolean engineOn;
	private String direction;
	private int altitude;
	private int speed;
	
	Airplane() {
		engineOn = false;
		direction = "North";
		speed = 0;
	}
	public void Elevate(int feet) {
		if (getAltitude()+feet>=0) setAltitude(getAltitude() + feet);			
	}
	public void UpdateSpeed(int mph) {
		if (mph+getSpeed() >= 0) setSpeed(getSpeed() + mph);
	}
	public void ToggleEngine() {
		if(isEngineOn()) setEngineOn(false);
		else setEngineOn(true);
	}
	
	public boolean isEngineOn() {
		return engineOn;
	}
	public String getDirection() {
		return direction;
	}
	public int getAltitude() {
		return altitude;
	}
	public int getSpeed() {
		return speed;
	}
	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
