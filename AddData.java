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

public class AddData {
	public static ImageIcon image;
	public static JFrame frame;
	public static JTextField text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11;
	public static int nomTable;
	public static TableModalRed tmr;
	public static int selRow;

	AddData(int nomTable) {
		image = new ImageIcon(getClass().getResource("1.jpg"));
		this.nomTable = nomTable;
		tmr = new TableModalRed(nomTable);
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
		labelMain.setText("<html><p align=" + "center>" + "Введіть дані для введення</p></html>");
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
		JLabel label4 = new JLabel();
		label4.setFont(font1);
		label4.setForeground(Color.BLACK);
		JLabel label5 = new JLabel();
		label5.setFont(font1);
		label5.setForeground(Color.BLACK);
		JLabel label6 = new JLabel();
		label6.setFont(font1);
		label6.setForeground(Color.BLACK);
		JLabel label7 = new JLabel();
		label7.setFont(font1);
		label7.setForeground(Color.BLACK);
		JLabel label8 = new JLabel();
		label8.setFont(font1);
		label8.setForeground(Color.BLACK);
		JLabel label9 = new JLabel();
		label9.setFont(font1);
		label9.setForeground(Color.BLACK);
		JLabel label10 = new JLabel();
		label10.setFont(font1);
		label10.setForeground(Color.BLACK);
		JLabel label11 = new JLabel();
		label11.setFont(font1);
		label11.setForeground(Color.BLACK);

		text1 = new JTextField(70);
		text1.setFont(font1);
		text1.setForeground(Color.BLACK);
		text2 = new JTextField(70);
		text2.setFont(font1);
		text2.setForeground(Color.BLACK);
		text3 = new JTextField(70);
		text3.setFont(font1);
		text3.setForeground(Color.BLACK);
		text4 = new JTextField(70);
		text4.setFont(font1);
		text4.setForeground(Color.BLACK);
		text5 = new JTextField(70);
		text5.setFont(font1);
		text5.setForeground(Color.BLACK);
		text6 = new JTextField(70);
		text6.setFont(font1);
		text6.setForeground(Color.BLACK);
		text7 = new JTextField(70);
		text7.setFont(font1);
		text7.setForeground(Color.BLACK);
		text8 = new JTextField(70);
		text8.setFont(font1);
		text8.setForeground(Color.BLACK);
		text9 = new JTextField(70);
		text9.setFont(font1);
		text9.setForeground(Color.BLACK);
		text10 = new JTextField(70);
		text10.setFont(font1);
		text10.setForeground(Color.BLACK);
		text11 = new JTextField(70);
		text11.setFont(font1);
		text11.setForeground(Color.BLACK);
		switch (nomTable) {
		case 1:
								
			label1.setText("<html><p align=" + "justify>" + "Назва космічного корабля</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Маса космічного корабля</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Назва ракети-носія</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Назва космодрому</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Кількість членів екіпажу</p></html>");
			label6.setText("<html><p align=" + "justify>" + "Назва корпорації</p></html>");
			// "Населення</p></html>");
			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label6, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text6, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 2:
			label1.setText("<html><p align=" + "justify>" + "Назва</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Довжина</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Маса</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Діаметр</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Дата першого запуску</p></html>");
			label6.setText("<html><p align=" + "justify>" + "Кількість запусків</p></html>");
			label7.setText("<html><p align=" + "justify>" + "Статус</p></html>");
			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label6, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label7, new GridBagConstraints(0, 7, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text6, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text7, new GridBagConstraints(3, 7, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 3:
			label1.setText("<html><p align=" + "justify>" + "Назва корпорації</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Рік заснування корпорації</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Тип корпорації</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Основна постать корпорації</p></html>");

			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 20, 10, 10), 0, 0));
			break;
		case 4:
			label1.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Столиця</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Офіційна мова</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Грошова одиниця</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Кількість населення</p></html>");
			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 5:
			label1.setText("<html><p align=" + "justify>" + "ПІБ космонавта</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Дата народження космонавта</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Назва корпорації</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Кількість польотів космонавта</p></html>");
			label6.setText("<html><p align=" + "justify>" + "Спеціальність космонавта</p></html>");
			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label6, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text6, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 6:
			label1.setText("<html><p align=" + "justify>" + "Назва космодрому</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Кількість запусків з космодрому</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Рік першого запуску з космодрому</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Працездатність космодрому</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Рік заснування космодрому</p></html>");
			label6.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label6, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text6, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;
		case 7:
			label1.setText("<html><p align=" + "justify>" + "День польоту</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Перигей польоту</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Апогей польоту</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Назва космічного корабля</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Рік польоту</p></html>");
			label6.setText("<html><p align=" + "justify>" + "Тривалість польоту</p></html>");
			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label6, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text6, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			break;

		case 8:			
			label1.setText("<html><p align=" + "justify>" + "Назва космічної станції</p></html>");
			label2.setText("<html><p align=" + "justify>" + "Дата запуску космічної станції</p></html>");
			label3.setText("<html><p align=" + "justify>" + "Маса космічної станції</p></html>");
			label4.setText("<html><p align=" + "justify>" + "Назва країни</p></html>");
			label5.setText("<html><p align=" + "justify>" + "Статус знаходження на орбіті</p></html>");
			label6.setText("<html><p align=" + "justify>" + "Кількість днів перебування на орбіті</p></html>");

			label.add(label1, new GridBagConstraints(0, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label2, new GridBagConstraints(0, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label3, new GridBagConstraints(0, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label4, new GridBagConstraints(0, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label5, new GridBagConstraints(0, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(label6, new GridBagConstraints(0, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));

			label.add(text1, new GridBagConstraints(3, 1, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text2, new GridBagConstraints(3, 2, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text3, new GridBagConstraints(3, 3, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text4, new GridBagConstraints(3, 4, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text5, new GridBagConstraints(3, 5, 2, 1, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(20, 20, 10, 10), 0, 0));
			label.add(text6, new GridBagConstraints(3, 6, 2, 1, 1, 1, GridBagConstraints.NORTH,
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
		btnGo.setText("Додати дані");
		btnGo.setFont(fontB);
		// btnGo.setEnabled(false);
		btnBack.setFont(fontB);
		label.add(btnBack, new GridBagConstraints(0, 17, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 20), 0, 0));
		label.add(btnGo, new GridBagConstraints(3, 17, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 20, 0, 10), 0, 0));

		btnGo.addActionListener(new Listener());
		btnBack.addActionListener(new Listener());

	}

	public static void shov() {
		frame.setVisible(false);
	}

	public static void add() {
		switch (nomTable) {
		case 1:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into spaceship (name, weight, nameLan, namecosmod, numbMan, nameCorp)"
						+ " VALUES ('" + text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "', '" + text6.getText() + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into launchvehicle (name, lon, weight, diam, dateFS, numbZ, statysL)"
						+ " VALUES ('" + text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "', '" + text6.getText() +  "', '" + text7.getText() + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into corporation (name, age, nameC, typeCor, mainMan)" + " VALUES ('"
						+ text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into country (name, capital, lang, money, population)" + " VALUES ('"
						+ text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 5:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into spaceman (name, dat, nameC, nameCor, numbF, spet)" + " VALUES ('"
						+ text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "', '" + text5.getText() + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into cosmodrome (name, numbSt, ageFirstF, work, age, nameC)" + " VALUES ('"
						+ text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "', '" + text6.getText()  + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 7:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into flight (day, perigee, apogee, nameSh, age, duration)" + " VALUES ('"
						+ text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "', '" + text6.getText()  + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 8:
			try {
				// ResultSet rez =
				Main.myStmt.executeUpdate("insert into spacestation (name, dat, weight, nameC, stat, numbDay)" + " VALUES ('"
						+ text1.getText() + "', '" + text2.getText() + "', '" + text3.getText() + "', '"
						+ text4.getText() + "', '" + text5.getText() + "', '" + text6.getText()  + "')");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		}

	}

	public class Upd implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Повернутись до головного меню")) {
				AddData.shov();
				MainGUI sel = new MainGUI();
				sel.stvor();
			} else {
				AddData.shov();
				// AddData.upde();
				RedTable sel = new RedTable(nomTable);
				sel.stvor();
			}
		}
	}

	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Повернутись до головного меню")) {
				AddData.shov();
				MainGUI sel = new MainGUI();
				sel.stvor();
			} else {
				AddData.shov();
				AddData.add();
				RedTable sel = new RedTable(nomTable);
				sel.stvor();
			}
		}
	}

}
