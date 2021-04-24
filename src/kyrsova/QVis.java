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
import javax.swing.JScrollPane;
import javax.swing.JTable;

import kyrsova.MainGUI.Listener;

public class QVis {
	public static ImageIcon image;
	public static JFrame frame;
	public static int nomQ;

	// this.EXIT_ON_CLOSE;
	QVis(int nomQ){
		image = new ImageIcon(getClass().getResource("1.jpg"));
		this.nomQ = nomQ;
	}

	public  void stvor(String arg0, String arg1, String arg2) {
		frame = new JFrame();
		frame.setTitle("Космічні кораблі");
		frame.setSize(1360, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		Font font = new Font("TimesRoman", Font.BOLD, 20);
		JLabel label = new JLabel();
		label.setLayout(new GridBagLayout());
		label.setVisible(true);
		label.setIcon(image);
		frame.add(label);
		frame.setVisible(true);
		
		TableModalQ tmq2 = new TableModalQ();
		JTable table = new JTable(tmq2);
		JScrollPane tableScrollPane = new JScrollPane(table);
		tmq2.addData(arg0, arg1, arg2);
		tableScrollPane.setPreferredSize(new Dimension(1330, 19+tmq2.getRowCount()*25));
		System.out.println(tmq2.getRowCount());
		tableScrollPane.setBackground(Color.BLUE);
		table.setFont(font);
		table.setRowHeight(24);
		label.add(tableScrollPane, new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
		
		JButton btnBack = new JButton("Змінити параметри запиту");
		JButton btnMenu = new JButton("Повернутись до головного меню");
		Font fontB = new Font("TimesRoman", Font.BOLD, 24);
		btnMenu.setFont(fontB);
		btnBack.setFont(fontB);
		label.add(btnBack, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
		label.add(btnMenu, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
		


		btnBack.addActionListener(new Listener());
		btnMenu.addActionListener(new Listener());

	}
	public static void shov(){
		frame.setVisible(false);
	}

	public class  Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Змінити параметри запиту")) {
				QVis.shov();
				QSet sel = new QSet(nomQ);
				sel.stvor();
			} else {
				System.out.println("Редагувати БД");
				QVis.shov();
				MainGUI sel = new MainGUI();
				sel.stvor();
			}
		}
	}
}
