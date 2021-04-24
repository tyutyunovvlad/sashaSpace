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
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import kyrsova.MainGUI.Listener;

public class RedTable {
	public static ImageIcon image;
	public static JFrame frame;
	public static int nom;

	// this.EXIT_ON_CLOSE;
	RedTable(int nom) {
		image = new ImageIcon(getClass().getResource("1.jpg"));
		this.nom = nom;
	}

	public void stvor() {
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

		TableModalRed tmq2 = new TableModalRed(nom);
		JTable table = new JTable(tmq2);

		JScrollPane tableScrollPane = new JScrollPane(table);
		tmq2.addData();
		int shur=0;
		if((19 + tmq2.getRowCount() * 24)>650){
			shur = 650;
		}
		else{
			shur=19 + tmq2.getRowCount() * 24;
		}
		tableScrollPane.setPreferredSize(new Dimension(1330, shur));
		System.out.println(tmq2.getRowCount());
		tableScrollPane.setBackground(Color.BLUE);
		table.setFont(font);
		table.setRowHeight(24);
		ListSelectionModel modal = table.getSelectionModel();
		modal.addListSelectionListener(new ListSelectionListener() {
			
			
			public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
				if(!modal.isSelectionEmpty()){
					int selRow=modal.getMinSelectionIndex();
					
					ArrayList<String> arS = new ArrayList<>();
					for(int i =0; i < table.getColumnCount(); i++){
						arS.add((String)table.getValueAt(selRow, i));
					}
					for(int i =table.getColumnCount(); i < 11; i++){
						arS.add(" ");
					}
					RedTable.shov();
					new UpData(nom, arS).stvor();;

					//int selSt=modal.();
					//JOptionPane.showMessageDialog(null, "Row "+selRow+" stovp "+selSt);
					//RedTable.shov();
					//AddData sel = new AddData(nom);
					//sel.red(selRow);
				}
				
			}
		});
		// table.setBackground(Color.BLUE);
		// table.getColumnModel().getColumn(0).setWidth(150);
		// table.getColumnModel().getColumn(1).setWidth(70);
		// table.getColumnModel().getColumn(2).setWidth(350);
		// table.setAutoCreateColumnsFromModel(true);
		label.add(tableScrollPane, new GridBagConstraints(0, 0, 4, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

		JButton btnDod = new JButton("Додати дані");
		JButton btnDel = new JButton("Видалити дані");
		JButton btnMenu = new JButton("Повернутись до головного меню");
		Font fontB = new Font("TimesRoman", Font.BOLD, 24);
		btnMenu.setFont(fontB);
		btnDod.setFont(fontB);
		btnDel.setFont(fontB);
		label.add(btnMenu, new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
		label.add(btnDod, new GridBagConstraints(2, 0, 1, 1, 1, 1, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
		label.add(btnDel, new GridBagConstraints(3, 0, 1, 1, 1, 1, GridBagConstraints.SOUTH,
				GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

		btnDod.addActionListener(new Listener());
		btnDel.addActionListener(new Listener());
		btnMenu.addActionListener(new Listener());

	}

	public static void shov() {
		frame.setVisible(false);
	}

	public class Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Повернутись до головного меню")) {
				RedTable.shov();
				MainGUI sel = new MainGUI();
				sel.stvor();
			} else {
				if (button.equals("Додати дані")) {
					System.out.println("");
					RedTable.shov();
					AddData sel = new AddData(nom);
					sel.stvor();
				}
				else{
					RedTable.shov();
					DelRow sel = new DelRow(nom);
					sel.stvor();
				}
			}
		}
	}
}
