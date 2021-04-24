package kyrsova;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import kyrsova.QSet.Listener;

public class QSet {
	public static ImageIcon image;
	public static JFrame frame;
	JTextField text1, text2, text3;
	public static int nomQ;

	QSet(int nomQ) {
		image = new ImageIcon(getClass().getResource("1.jpg"));
		this.nomQ = nomQ;
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
		labelMain.setFont(font);
		labelMain.setForeground(Color.BLACK);
		JLabel labelTeam = new JLabel();
		labelTeam.setFont(font);
		labelTeam.setForeground(Color.BLACK);
		JLabel labelAge = new JLabel();
		labelAge.setFont(font);
		labelAge.setForeground(Color.BLACK);
		JLabel label3 = new JLabel();
		label3.setFont(font);
		label3.setForeground(Color.BLACK);

		switch (nomQ) {
		case 1:
			labelMain.setText("<html><p align=" + "center>" + Main.q1 + "</p></html>");
			labelTeam.setText("Назва космодрому");
			labelAge.setText("Кількість членів екіпажу");
			label3.setText("Рік заснування корпорації");
			break;
		case 2:
			labelMain.setText("<html><p align=" + "center>" + Main.q2 + "</p></html>");
			labelTeam.setText("Кількість запусків");
			labelAge.setText("Статус");

			break;
		case 3:
			labelMain.setText("<html><p align=" + "center>" + Main.q3 + "</p></html>");
			labelTeam.setText("Тип");
			labelAge.setText("Основна постать");
			break;
		case 4:
			labelMain.setText("<html><p align=" + "center>" + Main.q4 + "</p></html>");
			labelTeam.setText("Грошова одиниця");
			labelAge.setText("Населення");
			break;
		case 5:
			labelMain.setText("<html><p align=" + "center>" + Main.q5 + "</p></html>");
			labelTeam.setText("Кілкьість польотів");
			labelAge.setText("Спеціальність");
			break;
		case 6:
			labelMain.setText("<html><p align=" + "center>" + Main.q6 + "</p></html>");
			labelTeam.setText("Працедатність");
			labelAge.setText("Рік заснування");
			label3.setText("Столиця каїни");
			break;
		case 7:
			labelMain.setText("<html><p align=" + "center>" + Main.q7 + "</p></html>");
			labelTeam.setText("Рік польоту");
			labelAge.setText("Тривалість польоту");
			break;
		case 8:
			labelMain.setText("<html><p align=" + "center>" + Main.q8 + "</p></html>");
			labelTeam.setText("Статус");
			labelAge.setText("Кількість днів на орбіті");
			break;
//		case 9:
//			labelMain.setText("<html><p align=" + "center>" + Main.q9 + "</p></html>");
//			labelTeam.setText("Посилання");
//			labelAge.setText("Хештег зображення");
//			break;
		}
		label.add(labelMain, new GridBagConstraints(0, 0, 4, 2, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(20, 100, 10, 10), 0, 0));

		label.add(labelTeam, new GridBagConstraints(0, 2, 2, 2, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 100, 10, 10), 0, 0));

		label.add(labelAge, new GridBagConstraints(0, 4, 2, 2, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 100, 10, 10), 0, 0));
		if (nomQ == 1 ||nomQ == 6) {
			label.add(label3, new GridBagConstraints(0, 6, 2, 2, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 100, 10, 10), 0, 0));
		}

		text1 = new JTextField(70);
		// labelBudget.setText("");
		text1.setFont(font);
		text1.setForeground(Color.BLACK);
		label.add(text1, new GridBagConstraints(2, 2, 2, 2, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 100), 0, 0));
		text2 = new JTextField(70);
		// labelBudget.setText("");
		text2.setFont(font);
		text2.setForeground(Color.BLACK);
		label.add(text2, new GridBagConstraints(2, 4, 2, 2, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 100), 0, 0));
		text3 = new JTextField(70);
		// labelBudget.setText("");
		text3.setFont(font);
		text3.setForeground(Color.BLACK);
		if (nomQ == 1 ||nomQ == 6) {
			label.add(text3, new GridBagConstraints(2, 6, 2, 2, 1, 1, GridBagConstraints.NORTH,
					GridBagConstraints.HORIZONTAL, new Insets(10, 10, 10, 100), 0, 0));
		} else {
			text3.setText("");
		}
		Font fontB = new Font("TimesRoman", Font.BOLD, 24);
		JButton btnBack = new JButton();
		JButton btnGo = new JButton();
		btnBack.setText("Повернутись до головного меню");
		btnGo.setText("Виконати запит");
		btnGo.setFont(fontB);
		// btnGo.setEnabled(false);
		btnBack.setFont(fontB);
		label.add(btnBack, new GridBagConstraints(0, 8, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));
		label.add(btnGo, new GridBagConstraints(2, 8, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));

		btnGo.addActionListener(new Listener());
		btnBack.addActionListener(new Listener());

	}

	public static void shov() {
		frame.setVisible(false);
	}

	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Повернутись до головного меню")) {
				QSet.shov();
				MainGUI sel = new MainGUI();
				sel.stvor();
			} else {
				QSet.shov();
				QVis sel = new QVis(nomQ);
				System.out.println(text1.getText());
				System.out.println(text2.getText());
				sel.stvor(text1.getText(), text2.getText(), text3.getText());
			}
		}
	}

}
