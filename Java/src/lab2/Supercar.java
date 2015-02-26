package lab2;

import java.awt.FlowLayout;

import javax.swing.*;

public class Supercar {

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
