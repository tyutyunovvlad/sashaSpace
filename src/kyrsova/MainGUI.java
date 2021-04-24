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

public class MainGUI {
	public static ImageIcon image;
	public static JFrame frame;

	// this.EXIT_ON_CLOSE;
	MainGUI(){
		image = new ImageIcon(getClass().getResource("1.jpg"));
	}

	public  void stvor() {
		frame = new JFrame();
		frame.setTitle("Космічні кораблі");
		frame.setSize(1360, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		// 
		//image = new ImageIcon("fifa.jpg");
		JButton help = new JButton("Допомога");
		JButton zaput = new JButton("Перейти до запитів");
		JButton zmina = new JButton("Редагувати БД");
		// tf.setPreferredSize(new Dimension(600,100));
		//zmina.setBackground(new Color(25,25,255,200));
		help.setVisible(false);
		// zmina.setForeground(Color.BLUE);
		Font font = new Font("TimesRoman", Font.BOLD, 33);
		// zaput.setBackground(Color.RED);
		JLabel label = new JLabel();
		label.setLayout(new GridBagLayout());
		label.setVisible(true);
		label.setIcon(image);
		JPanel penal = new JPanel();
		zaput.setFont(font);
		zmina.setFont(font);
		help.setFont(font);
		label.add(zaput, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(320, 450, 10, 450), 0, 0));
		label.add(zmina, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
				GridBagConstraints.HORIZONTAL, new Insets(390, 450, 10, 450), 0, 0));
		
		frame.add(label);
		frame.setVisible(true);

		zaput.addActionListener(new Listener());
		zmina.addActionListener(new Listener());

	}
	public static void shov(){
		frame.setVisible(false);
	}

	public class  Listener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent JCom) {
			String button = ((JButton) JCom.getSource()).getText();
			if (button.equals("Перейти до запитів")) {
				MainGUI.shov();
				SelectQ sel = new SelectQ();
				sel.stvor();
				System.out.println("Перейти до запитів");
			} else {
				System.out.println("Редагувати БД");
				MainGUI.shov();
				SelectTable sel = new SelectTable();
				sel.stvor();
			}

		}

	}

}
