package kyrsova;

import java.awt.BorderLayout;
import java.awt.Color;
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

public class SelectTable {
	public static ImageIcon image;
	public static JFrame frame;

	SelectTable() {
		image = new ImageIcon(getClass().getResource("1.jpg"));
	}

	public void stvor() {
		frame = new JFrame();
		frame.setTitle("Космічні кораблі");
		frame.setSize(1360, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		Font font = new Font("TimesRoman", Font.BOLD, 22);
		//
		// image = new ImageIcon("fifa.jpg");
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		JButton btn4 = new JButton();
		JButton btn5 = new JButton();
		JButton btn6 = new JButton();
		JButton btn7 = new JButton();
		JButton btn8 = new JButton();
		JButton btn9 = new JButton();
		JButton btn10 = new JButton();
		JButton btn11 = new JButton();
		JButton btn12 = new JButton();
		JButton btn13 = new JButton();

		btn1.setText("<html><p align=" + "justify>" + "Космічний корабель</p></html>");
		btn2.setText("<html><p align=" + "justify>" + "Ракета-носій</p></html>");
		btn3.setText("<html><p align=" + "justify>" + "Корпорація</p></html>");
		btn4.setText("<html><p align=" + "justify>" + "Країна</p></html>");
		btn5.setText("<html><p align=" + "justify>" + "Космонавт</p></html>");
		btn6.setText("<html><p align=" + "justify>" + "Космодром</p></html>");
		btn7.setText("<html><p align=" + "justify>" + "Політ</p></html>");
		btn8.setText("<html><p align=" + "justify>" + "Космічна станція</p></html>");
		

		JLabel label = new JLabel();
		JLabel labelT = new JLabel();
		label.setLayout(new GridBagLayout());
		label.setVisible(true);
		label.setIcon(image);
		JPanel penal = new JPanel();
		labelT.setText("<html><p align=" + "center>" + "Виберіть таблицю для редагування</p></html>");
		Font font1 = new Font("TimesRoman", Font.BOLD, 30);
		labelT.setFont(font1);
		labelT.setForeground(Color.BLACK);
		label.add(labelT, new GridBagConstraints(0, 0, 3, 2, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 400, 10, 10), 0, 0));
		btn1.setFont(font);
		btn2.setFont(font);
		btn3.setFont(font);
		btn4.setFont(font);
		btn5.setFont(font);
		btn6.setFont(font);
		btn7.setFont(font);
		btn8.setFont(font);
		btn9.setFont(font);
		btn10.setFont(font);
		btn11.setFont(font);
		btn12.setFont(font);
		btn13.setFont(font);
		label.add(btn1, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn2, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn3, new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn4, new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn5, new GridBagConstraints(0, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn6, new GridBagConstraints(1, 5, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn7, new GridBagConstraints(0, 6, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));
		label.add(btn8, new GridBagConstraints(1, 6, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 120, 20, 120), 0, 0));


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
		btn10.addActionListener(new Listener());
		btn11.addActionListener(new Listener());
		btn12.addActionListener(new Listener());
		btn13.addActionListener(new Listener());
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
			case "<html><p align=" + "justify>" + "Космічний корабель</p></html>":
				System.out.println("Q1");
				SelectTable.shov();
				RedTable set1 = new RedTable(1);
				set1.stvor();
				break;
			case "<html><p align=" + "justify>" + "Ракета-носій</p></html>":
				System.out.println("Q2");
				SelectTable.shov();
				RedTable set2 = new RedTable(2);
				set2.stvor();
				break;
			case "<html><p align=" + "justify>" + "Корпорація</p></html>":
				System.out.println("Q3");
				SelectTable.shov();
				RedTable set3 = new RedTable(3);
				set3.stvor();
				break;
			case "<html><p align=" + "justify>" + "Країна</p></html>":
				System.out.println("Q4");
				SelectTable.shov();
				RedTable set4 = new RedTable(4);
				set4.stvor();
				break;
			case "<html><p align=" + "justify>" + "Космонавт</p></html>":
				System.out.println("Q5");
				SelectTable.shov();
				RedTable set5 = new RedTable(5);
				set5.stvor();
				break;
			case "<html><p align=" + "justify>" + "Космодром</p></html>":
				System.out.println("Q6");
				SelectTable.shov();
				RedTable set6 = new RedTable(6);
				set6.stvor();
				break;
			case "<html><p align=" + "justify>" + "Політ</p></html>":
				System.out.println("Q6");
				SelectTable.shov();
				RedTable set7 = new RedTable(7);
				set7.stvor();
				break;
			case "<html><p align=" + "justify>" + "Космічна станція</p></html>":
				System.out.println("Q6");
				SelectTable.shov();
				RedTable set8 = new RedTable(8);
				set8.stvor();
				break;
//			case "<html><p align=" + "justify>" + "Категорія</p></html>":
//				System.out.println("Q6");
//				SelectTable.shov();
//				RedTable set9 = new RedTable(9);
//				set9.stvor();
//				break;
			}
		}

	}
}