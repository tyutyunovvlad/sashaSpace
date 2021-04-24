package kyrsova;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.fabric.jdbc.FabricMySQLDriver;

public class Main extends JFrame {
	private static final String URL = "jdbc:mysql://localhost:3306/galaxyspase";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static Connection connection;
	public static Statement myStmt;
	
	public static final String q1 = "Вивести інформацію про Космічний корабель за космодромом, де відбувався запуск та які мали певну кількість членів екіпажу і з них ті, які відносяться до корпорації, яка була заснована у певному році";

	public static final String q2 = "Вивести інформацію про Ракету-носія за певною кількістю запусків та статусом ракети-носія";

	public static final String q3 = "Вивести інформацію про Корпорацію за певним типом корпорації та певною основною постаттю корпорації";

	public static final String q4 = "Вивести інформацію про Країну за певною грошовою одиницею та кількістю населення";

	public static final String q5 = "Вивести інформацію про Космонавта за певною кількістю польотів у космос та спеціальністю космонавта";

	public static final String q6 = "Вивести інформацію про Космодром за певною працездатністю космодрому, та роком заснування більшим за певний, а з них ті які знаходяться в країні з певною столицею";

	public static final String q7 = "Вивести інформацію про Політ за певним роком та певною тривалістю польоту";

	public static final String q8 = "Вивести інформацію про Космічну станцію за певним статусом знаходженням на орбіті та більше певної кількісті днів перебування на орбіті";

	public static void main(String[] args) {
		new MainGUI().stvor();
		try {
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			myStmt = connection.createStatement();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
