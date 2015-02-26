package program2;

import javax.swing.JOptionPane;

public class AirplaneMenu  {
	static Airplane plane = new Airplane();	
		
	public static void main(String args[]) {		
		Input();	
	}
	
	private static void Input() {
		while(true) 
		{	
		String input;
		String message =
				"Airplane: \n"
				+ "\n 1. Turn on/off"
				+ "\n 2. Change the plane's direction"
				+ "\n 3. Ascend"
				+ "\n 4. Descend"
				+ "\n 5. Increase Speed"
				+ "\n 6. Decrease Speed"
				+ "\n 7. Display airplane status"
				+ "\n 8. Quit";
		
		input = JOptionPane.showInputDialog(message);
		Process(Integer.parseInt(input));
		}
	}

	private static void Process(int input) {
		switch (input) {
		case 1:
			plane.ToggleEngine();
			String tf;
			if(plane.isEngineOn()) tf="on"; else tf="off";
			JOptionPane.showMessageDialog(null, "The engine has been turned " +tf  );
			break;
		case 2:
			plane.setDirection(JOptionPane.showInputDialog("Enter the Direction desired (North, East, South, West)"));
			break;
			
		case 3:
			plane.Elevate(Integer.parseInt(JOptionPane.showInputDialog("Ascend how many feet?")));
			break;
			
		case 4:
			plane.Elevate(-Integer.parseInt(JOptionPane.showInputDialog("Descend how many feet?")));
			break;
			
		case 5:
			plane.UpdateSpeed(Integer.parseInt(JOptionPane.showInputDialog("Increase speed by how many miles per hour?")));
			break;
			
		case 6:
			plane.UpdateSpeed(-Integer.parseInt(JOptionPane.showInputDialog("Decrease speed by how many miles per hour?")));
			break;
			
		case 7:
			JOptionPane.showMessageDialog(null,
					"Airplane Status: \n"
					+ "\n"
					+ "\n Engine: "+ plane.isEngineOn()
					+ "\n Direction: "+ plane.getDirection()
					+ "\n Altitude: "+ plane.getAltitude() +" feet"
					+ "\n Speed: "+ plane.getSpeed() +"MPG"
					);
			break;
			
		case 8:
			System.exit(0);
			break;
			
		default:
			break;
		}
		
	}

}
