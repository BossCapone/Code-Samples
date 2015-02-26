package test11;
import com.cloudgarden.layout.AnchorLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


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
public class NewJFrame extends javax.swing.JFrame implements ActionListener {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JButton jButton1;
	private JButton jButton4;
	private JButton jButton3;
	private JButton jButton2;
	private JTextField jTextField1;
	private JTextField homeScore;
	private int home =0;
	private int away = 0;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				jLabel1 = new JLabel();
				getContentPane().add(jLabel1, "Center");
				AnchorLayout jLabel1Layout = new AnchorLayout();
				jLabel1.setLayout(null);
				jLabel1.setText("Scoreboard");
				jLabel1.setBounds(144, 12, 85, 30);
			}
			{
				jLabel2 = new JLabel();
				getContentPane().add(jLabel2);
				jLabel2.setText("Home");
				jLabel2.setBounds(59, 65, 41, 21);
			}
			{
				jLabel3 = new JLabel();
				getContentPane().add(jLabel3);
				jLabel3.setText("Away");
				jLabel3.setBounds(244, 65, 36, 21);
			}
			{
				homeScore = new JTextField();
				getContentPane().add(homeScore);
				homeScore.setBounds(49, 100, 67, 28);
				homeScore.setText(""+home);
			}
			{
				jTextField1 = new JTextField();
				getContentPane().add(jTextField1);
				jTextField1.setText(""+away);
				jTextField1.setBounds(229, 100, 67, 28);
			}
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1);
				jButton1.setText("Home TD");
				jButton1.setBounds(49, 140, 118, 28);
				jButton1.addActionListener(this);
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2);
				jButton2.setText("Away TD");
				jButton2.setBounds(229, 134, 108, 28);
				jButton2.addActionListener(this);
			}
			{
				jButton3 = new JButton();
				getContentPane().add(jButton3);
				jButton3.setText("Home FG");
				jButton3.setBounds(49, 192, 118, 28);
				jButton3.addActionListener(this);
			}
			{
				jButton4 = new JButton();
				getContentPane().add(jButton4);
				jButton4.setText("Away FG");
				jButton4.setBounds(229, 187, 102, 28);
				jButton4.addActionListener(this);
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jButton1) {
			home+=7;
		}
		if(e.getSource() == jButton2) {
			away+=7;
				}
		if(e.getSource() == jButton3) {
			home+=3;
		}
		if(e.getSource() == jButton4) {
			away+=3;
		}
		homeScore.setText(""+home);
		jTextField1.setText(""+away);
	}

}
