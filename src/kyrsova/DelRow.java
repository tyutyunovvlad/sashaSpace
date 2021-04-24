package kyrsova;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//import kyrsova.Q1Set.Listener;

public class DelRow {
	public static ImageIcon image;
	public static JFrame frame;
	public static JTextField text1, text2, text3;
	public static int nomTable;

	/**
	 * @param nomTable
	 */
	DelRow(int nomTable) {
		image = new ImageIcon(getClass().getResource("1.jpg"));
		this.nomTable = nomTable;
	}

	public void stvor() {
		frame = new JFrame();
		frame.setTitle("Космічні кораблі");
		frame.setSize(1360, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		Font font = new Font("TimesRoman", Font.BOLD, 36);
		JLabel label = new JLabel();
		label.setLayout(new GridBagLayout());
		label.setVisible(true);
		label.setIcon(image);
		frame.add(label);
		frame.setVisible(true);
		JLabel labelMain = new JLabel();
		labelMain.setText("<html><p align=" + "center>" + "Введіть дані для видалення</p></html>");
		labelMain.setFont(font);
		labelMain.setForeground(Color.BLACK);
		label.add(labelMain, new GridBagConstraints(0, 0, 5, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 500, 10, 10), 0, 0));
		Font font1 = new Font("TimesRoman", Font.BOLD, 24);
		JLabel label1 = new JLabel();
		label1.setFont(font1);
		label1.setForeground(Color.BLACK);
		JLabel label2 = new JLabel();
		label2.setFont(font1);
		label2.setForeground(Color.BLACK);
		
		JLabel label3 = new JLabel();
		label3.setFont(font1);
		label3.setForeground(Color.BLACK);


		// label.add(label1, new GridBagConstraints(0, 2, 2, 2, 1, 1,
		// GridBagConstraints.NORTH,
		// GridBagConstraints.HORIZONTAL, new Insets(10, 100, 10, 10), 0, 0));

		text1 = new JTextField(70);
		text1.setFont(font1);
		text1.setForeground(Color.BLACK);
		text2 = new JTextField(70);
		text2.setFont(font1);
		text2.setForeground(Color.BLACK);
		text3 = new JTextField(70);
		text3.setFont(font1);
		text3.setForeground(Color.BLACK);

		switch (nomTable) {
		case 1:
			label1.setText("<html><p align=" + "justify>" + "Назва космічного корабля</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label2.setText("<html><p align=" + "justify>" + "Кількість членів екіпажу</p></html>");
			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 2:
			label1.setText("<html><p align=" + "justify>" + "Діаметр ракети-носія</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label2.setText("<html><p align=" + "justify>" + "Кількість запусків ракети-носія</p></html>");
			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 3:
			label1.setText("<html><p align=" + "justify>" + "Назва корпорації</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
//			label2.setText("<html><p align=" + "justify>" + "Пошта відвідувача</p></html>");
//			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
//					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
//			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
//					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 4:
			label1.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
//			label2.setText("<html><p align=" + "justify>" + "Розмір фотографії</p></html>");
//			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
//					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
//			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
//					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 5:
			label1.setText("<html><p align=" + "justify>" + "Назва корпорації</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label2.setText("<html><p align=" + "justify>" + "Кількість польотів космонавта</p></html>");
			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label3.setText("<html><p align=" + "justify>" + "Спеціальність космонавта</p></html>");
			label.add(label3, new GridBagConstraints(0, 8, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 8, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 6:
			label1.setText("<html><p align=" + "justify>" + "Кількість запусків з космодрому</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label2.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 7:
			label1.setText("<html><p align=" + "justify>" + "День польоту</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label2.setText("<html><p align=" + "justify>" + "Рік польоту</p></html>");
			label.add(label2, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 8:
			label1.setText("<html><p align=" + "justify>" + "Назва космічної станції</p></html>");
			label.add(label1, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text1, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		}

		// label.add(text1, new GridBagConstraints(2, 2, 2, 2, 1, 1,
		// GridBagConstraints.NORTH,
		// GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 100), 0, 0));

		Font fontB = new Font("TimesRoman", Font.BOLD, 24);
		JButton btnBack = new JButton();
		JButton btnGo = new JButton();
		btnBack.setText("Повернутись до головного меню");
		btnGo.setText("Видалити дані");
		btnGo.setFont(fontB);
		// btnGo.setEnabled(false);
		btnBack.setFont(fontB);
		label.add(btnBack, new GridBagConstraints(0, 10, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 20), 0, 0));
		label.add(btnGo, new GridBagConstraints(3, 10, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 20, 0, 10), 0, 0));

		btnGo.addActionListener(new Listener());
		btnBack.addActionListener(new Listener());

	}

	public static void shov() {
		frame.setVisible(false);
	}

	public static void del() {
		switch (nomTable) {
		case 1:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from spaceship where name = '" + text1.getText() + "' and weight = '"+ text2.getText()+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from launchvehicle where diam = '" + text1.getText() + "' and numbZ = '"+ text2.getText()+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from corporation where name = '" + text1.getText() +"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from country where name = '" + text1.getText() +"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 5:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from spaceman where nameCor = '" + text1.getText() + "' and numbF = '"+ text2.getText() + "' and spet = '"+ text3.getText() + "'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from cosmodrome where numbSt = '" + text1.getText() + "' and nameC = '"+ text2.getText()+"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 7:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate(
						"delete from flight where day = '" + text1.getText() + "' and age = '" + text2.getText() + "'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 8:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("delete from spacestation where name = '" + text1.getText() +"'");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}
	}

	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Повернутись до головного меню")) {
				DelRow.shov();
				MainGUI sel = new MainGUI();
				sel.stvor();
			} else {
				DelRow.shov();
				DelRow.del();
				RedTable sel = new RedTable(nomTable);
				sel.stvor();
			}
		}
	}

}
