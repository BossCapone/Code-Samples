package program3;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Program4 extends JFrame implements ActionListener, ItemListener {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private ButtonGroup buttonGroup1;
	private JButton jButton2;
	private JButton jButton1;
	private JLabel jLabel8;
	private JTextField jTextField4;
	private JTextField jTextField3;
	private JLabel jLabel7;
	private JTextField jTextField2;
	private JLabel jLabel6;
	private JComboBox jComboBox2;
	private JRadioButton jRadioButton5;
	private JRadioButton jRadioButton4;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton1;
	private JComboBox jComboBox1;
	private JTextField jTextField1;
	private float mealPrice;
	private float drinkPrice;
	private float subtotal = 0;
	private float tax = 0.07f;
	private float total = 0;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Program4 inst = new Program4();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Program4() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1);
				jLabel1.setText("McDowell's");
				jLabel1.setBounds(169, 12, 100, 21);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Special Requests:");
				jLabel2.setBounds(12, 113, 121, 21);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setBounds(169, 110, 211, 28);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Combo Meal:");
				jLabel3.setBounds(12, 66, 89, 21);
			}
			{
				ComboBoxModel jComboBox1Model = 
						new DefaultComboBoxModel(
								new String[] { "Cheeseburger ($2.49)", "Double Cheeseburger ($3.89)", "Triple Cheeseburger ($4.99)" });
				jComboBox1 = new JComboBox();
				getContentPane().add(jComboBox1);
				jComboBox1.setModel(jComboBox1Model);
				jComboBox1.setBounds(169, 62, 211, 28);
				jComboBox1.addItemListener(this);
			}
			{
				jLabel4 = new JLabel();
				getContentPane().add(jLabel4);
				jLabel4.setText("Drink:");
				jLabel4.setBounds(12, 162, 56, 24);
			}
			{
				jRadioButton1 = new JRadioButton();
				getContentPane().add(jRadioButton1);
				jRadioButton1.setText("Coke");
				jRadioButton1.setBounds(169, 162, 68, 25);
			}
			{
				jRadioButton2 = new JRadioButton();
				getContentPane().add(jRadioButton2);
				jRadioButton2.setText("Diet Coke");
				jRadioButton2.setBounds(242, 161, 84, 26);
			}
			{
				jRadioButton3 = new JRadioButton();
				getContentPane().add(jRadioButton3);
				jRadioButton3.setText("Orange");
				jRadioButton3.setBounds(342, 161, 68, 26);
			}
			{
				jRadioButton4 = new JRadioButton();
				getContentPane().add(jRadioButton4);
				jRadioButton4.setText("Sprite");
				jRadioButton4.setBounds(169, 194, 62, 25);
			}
			{
				jRadioButton5 = new JRadioButton();
				getContentPane().add(jRadioButton5);
				jRadioButton5.setText("Root Beer");
				jRadioButton5.setBounds(242, 194, 89, 25);
			}
			{
				jLabel5 = new JLabel();
				getContentPane().add(jLabel5);
				jLabel5.setText("Size");
				jLabel5.setBounds(12, 226, 27, 21);
			}
			{
				ComboBoxModel jComboBox2Model = 
						new DefaultComboBoxModel(
								new String[] { "Small", "Medium ($.75)", "Large ($1.25)" });
				jComboBox2 = new JComboBox();
				getContentPane().add(jComboBox2);
				jComboBox2.setModel(jComboBox2Model);
				jComboBox2.setBounds(169, 231, 119, 28);
				jComboBox2.addItemListener(this);
			}
			{
				jLabel6 = new JLabel();
				getContentPane().add(jLabel6);
				jLabel6.setText("Subtotal:");
				jLabel6.setBounds(12, 274, 68, 21);
			}
			{
				jTextField2 = new JTextField();
				getContentPane().add(jTextField2);
				jTextField2.setBounds(169, 271, 51, 28);
			}
			{
				jLabel7 = new JLabel();
				getContentPane().add(jLabel7);
				jLabel7.setText("Tax");
				jLabel7.setBounds(12, 308, 68, 21);
			}
			{
				jTextField3 = new JTextField();
				getContentPane().add(jTextField3);
				jTextField3.setBounds(169, 305, 51, 28);
			}
			{
				jTextField4 = new JTextField();
				getContentPane().add(jTextField4);
				jTextField4.setBounds(169, 339, 51, 28);
			}
			{
				jLabel8 = new JLabel();
				getContentPane().add(jLabel8);
				jLabel8.setText("Total:");
				jLabel8.setBounds(12, 342, 68, 21);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Submit Order");
				jButton1.setBounds(169, 387, 156, 28);
				jButton1.addActionListener(this);
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Clear");
				jButton2.setBounds(330, 387, 93, 28);
				jButton2.addActionListener(this);
			}
			{
				buttonGroup1 = new ButtonGroup();
				buttonGroup1.add(jRadioButton1);
				buttonGroup1.add(jRadioButton2);
				buttonGroup1.add(jRadioButton3);
				buttonGroup1.add(jRadioButton4);
				buttonGroup1.add(jRadioButton5);
			}
			pack();
			this.setSize(467, 473);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getButtonGroup1() {
		if(buttonGroup1 == null) {
			buttonGroup1 = new ButtonGroup();
		}
		return buttonGroup1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButton1) {
			//Calclate the subtotal, tax, and overall total
			subtotal = mealPrice + drinkPrice;
			total = subtotal + (tax * subtotal); 
			//display values
			jTextField2.setText(""+subtotal);
			jTextField3.setText(""+tax);
			jTextField4.setText(""+total);
		}
		if(e.getSource() == jButton2) {
			
			jTextField1.setText("");
			jTextField2.setText("");
			jTextField3.setText("");
			jTextField4.setText("");
		}
		
	}
	public void itemStateChanged(ItemEvent i) {
		if(i.getSource() == jComboBox1) {
			if(jComboBox1.getSelectedIndex() == 0)
				mealPrice = 2.49f;
			else if (jComboBox1.getSelectedIndex() == 1)
				mealPrice = 3.89f;
			else if (jComboBox1.getSelectedIndex() == 2)
				mealPrice = 4.99f;
		}
		if(i.getSource() == jComboBox2) {
			if(jComboBox2.getSelectedIndex() == 0)
				drinkPrice = 0f;
			if(jComboBox2.getSelectedIndex() == 1)
				drinkPrice = 0.75f;
			if(jComboBox2.getSelectedIndex() == 2)
				drinkPrice = 1.25f;
		}
	}

}
