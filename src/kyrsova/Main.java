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
	
	public static final String q1 = "������� ���������� ��� �������� �������� �� �����������, �� ��������� ������ �� �� ���� ����� ������� ����� ������ � � ��� �, �� ���������� �� ����������, ��� ���� ��������� � ������� ����";

	public static final String q2 = "������� ���������� ��� ������-���� �� ������ ������� ������� �� �������� ������-����";

	public static final String q3 = "������� ���������� ��� ���������� �� ������ ����� ���������� �� ������ �������� �������� ����������";

	public static final String q4 = "������� ���������� ��� ����� �� ������ �������� �������� �� ������� ���������";

	public static final String q5 = "������� ���������� ��� ���������� �� ������ ������� ������� � ������ �� ������������ ����������";

	public static final String q6 = "������� ���������� ��� ��������� �� ������ ������������� ����������, �� ����� ���������� ������ �� ������, � � ��� � �� ����������� � ���� � ������ ��������";

	public static final String q7 = "������� ���������� ��� ���� �� ������ ����� �� ������ ��������� �������";

	public static final String q8 = "������� ���������� ��� ������� ������� �� ������ �������� ������������ �� ���� �� ����� ����� ������ ��� ����������� �� ����";

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
