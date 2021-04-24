package kyrsova;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kyrsova.MainGUI.Listener;

//import kyrsova.Main.Listener;

public class SelectQ {
	public static ImageIcon image;
	public static JFrame frame;

	SelectQ() {
		image = new ImageIcon(getClass().getResource("1.jpg"));
	}

	public void stvor() {
		frame = new JFrame();
		frame.setTitle("Космічні кораблі");
		frame.setSize(1360, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		Font font = new Font("TimesRoman", Font.BOLD, 18);
		//

		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		JButton btn6 = new JButton();
		JButton btn7 = new JButton();
		JButton btn8 = new JButton();
		JButton btn9 = new JButton();

		btn1.setText("<html><p align=" + "justify>" + Main.q1 + "</p></html>");
		btn2.setText("<html><p align=" + "justify>" + Main.q2 + "</p></html>");
		btn3.setText("<html><p align=" + "justify>" + Main.q3 + "</p></html>");
		btn4.setText("<html><p align=" + "justify>" + Main.q4 + "</p></html>");
		btn5.setText("<html><p align=" + "justify>" + Main.q5 + "</p></html>");
		btn6.setText("<html><p align=" + "justify>" + Main.q6 + "</p></html>");
		btn7.setText("<html><p align=" + "justify>" + Main.q7 + "</p></html>");
		btn8.setText("<html><p align=" + "justify>" + Main.q8 + "</p></html>");
//		btn9.setText("<html><p align=" + "justify>" + Main.q9 + "</p></html>");

		// btn17.setText("lalala");

		JLabel label = new JLabel();
		label.setLayout(new GridBagLayout());
		label.setVisible(true);
		label.setIcon(image);
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn4.setFont(font);
		btn5.setFont(font);
		btn6.setFont(font);
		btn7.setFont(font);
		btn8.setFont(font);
		btn9.setFont(font);

		label.add(btn1, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn2, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn3, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn4, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn5, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn6, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn7, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));
		label.add(btn8, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.BOTH,
				new Insets(20, 20, 20, 20), 0, 0));


		// penal.add(zmina);
		// penal.add(help);

		frame.add(label);
		frame.setVisible(true);

		btn1.addActionListener(new Listener());
		btn2.addActionListener(new Listener());
		btn3.addActionListener(new Listener());
		btn4.addActionListener(new Listener());
		btn5.addActionListener(new Listener());
		btn6.addActionListener(new Listener());
		btn7.addActionListener(new Listener());
		btn8.addActionListener(new Listener());
		btn9.addActionListener(new Listener());

		// zaput.addActionListener(new Listener());
		// zmina.addActionListener(new Listener());

	}

	public static void shov() {
		frame.setVisible(false);
	}

	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			switch (button) {
			case "<html><p align=" + "justify>" + Main.q1 + "</p></html>":
				System.out.println("Q1");
				SelectQ.shov();
				QSet set1 = new QSet(1);
				set1.stvor();
				break;
			case "<html><p align=" + "justify>" + Main.q2 + "</p></html>":
				System.out.println("Q2");
				SelectQ.shov();
				QSet set2 = new QSet(2);
				set2.stvor();
				break;
			case "<html><p align=" + "justify>" + Main.q3 + "</p></html>":
				System.out.println("Q3");
				SelectQ.shov();
				QSet set3 = new QSet(3);
				set3.stvor();
				break;
			case "<html><p align=" + "justify>" + Main.q4 + "</p></html>":
				System.out.println("Q4");
				SelectQ.shov();
				QSet set4 = new QSet(4);
				set4.stvor();
				break;
			case "<html><p align=" + "justify>" + Main.q5 + "</p></html>":
				System.out.println("Q5");
				SelectQ.shov();
				QSet set5 = new QSet(5);
				set5.stvor();
				;
				break;
			case "<html><p align=" + "justify>" + Main.q6 + "</p></html>":
				System.out.println("Q6");
				SelectQ.shov();
				QSet set6 = new QSet(6);
				set6.stvor();
				break;
			case "<html><p align=" + "justify>" + Main.q7 + "</p></html>":
				System.out.println("Q7");
				SelectQ.shov();
				QSet set7 = new QSet(7);
				set7.stvor();
				break;
			case "<html><p align=" + "justify>" + Main.q8 + "</p></html>":
				System.out.println("Q8");
				SelectQ.shov();
				QSet set8 = new QSet(8);
				set8.stvor();
				break;
//			case "<html><p align=" + "justify>" + Main.q9 + "</p></html>":
//				System.out.println("Q9");
//				SelectQ.shov();
//				QSet set9 = new QSet(9);
//				set9.stvor();
//				break;
			}
		}

	}
}