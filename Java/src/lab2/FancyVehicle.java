package lab2;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FancyVehicle extends Vehicle {
private boolean cruiseControl;
private int cruiseSpeed;
private String destination;

public FancyVehicle() {
	cruiseControl = false;
	cruiseSpeed = 50;
}

public boolean isCruiseControl() {
	return cruiseControl;
}

public void setCruiseControl(boolean cruiseControl) {
	this.cruiseControl = cruiseControl;
}

public int getCruiseSpeed() {
	return cruiseSpeed;
}

public void setCruiseSpeed(int cruiseSpeed) {
	this.cruiseSpeed = cruiseSpeed;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}
public static void main(String[] args) {
	FancyVehicle supercar;
	supercar = new FancyVehicle();
	
	JFrame jfrm = new JFrame("Supercar");
	jfrm.setVisible(true);
	jfrm.setSize(400,300);
	jfrm.setLayout(new FlowLayout());
	JTextArea display = new JTextArea();
	jfrm.getContentPane().add(display);
	
	
	String disp =
			"CruiseControl: " + supercar.isCruiseControl() + ": " + supercar.getCruiseSpeed() +
			"\n Destination: " + supercar.getDestination() +
			"\n Air: " + supercar.getAir() + "Level: " + supercar.getAirlevel() +
			"\n Satation: " + supercar.getStation()
			;
	display.setText(disp);
	
	supercar.setAir(true);
	supercar.setAirlevel(supercar.getAirlevel()+1);
	
	
	display.setText("CruiseControl: " + supercar.isCruiseControl() + ": " + supercar.getCruiseSpeed() +
			"\n Destination: " + supercar.getDestination() +
			"\n Air: " + supercar.getAir() + "Level: " + supercar.getAirlevel() +
			"\n Satation: " + supercar.getStation());
	
	
}

}
