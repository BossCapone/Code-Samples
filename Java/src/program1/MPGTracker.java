package program1;

import javax.swing.JOptionPane;

public class MPGTracker {
float miles[];
float gallons[];
int step;

public MPGTracker() {
	miles = new float[] {0,0,0,0,0,0,0,0,0,0};
	gallons = new float[] {0,0,0,0,0,0,0,0,0,0};
	step = 0;
}

public void menu() {
	String mainInput;
	mainInput = JOptionPane.showInputDialog("Choose and option: \n 1. Enter miles/gallons \n 2. Show average MPG \n 3. Quit \n");
	int input = Integer.parseInt(mainInput);
		
	if (input == 1) { enter();	}
	if (input == 2) { show(); }
	if (input == 3) { System.exit(0); }
	}//
public void enter() {
	String inGallons = JOptionPane.showInputDialog("How many gallons did you put in the tank");
	int igallons = Integer.parseInt(inGallons);
	String inMiles = JOptionPane.showInputDialog("How many miles did you drive?");
	int imiles = Integer.parseInt(inMiles);
	miles[step] = imiles;
	gallons[step] = igallons;
	if (step <10)
	step++;
	
	menu();
}
public void show() {
	String mpg = String.valueOf(calculate());
	
	JOptionPane.showMessageDialog(null, "Your MPG is " + mpg);
	menu();
}
public float calculate() {
	float tmiles =0; 
	float tgallons =0;
	for (int i = 0; i < 10; i++) {
		tmiles += miles[i];
		tgallons += gallons[i];
	}
	
	return (tmiles/tgallons);
}

	public static void main(String[] args) {
		MPGTracker prog = new MPGTracker();
		prog.menu();
	}
}
