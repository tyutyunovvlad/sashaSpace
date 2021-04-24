package kyrsova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModalRed extends AbstractTableModel {

	public ArrayList<String[]> tableData;
	public int columnQ1;
	public int nomTable;

	public TableModalRed(int nomTable) {
		this.nomTable = nomTable;
		tableData = new ArrayList<String[]>();
		for (int i = 0; i < tableData.size(); i++) {
			tableData.add(new String[getColumnCount()]);
		}
		switch (nomTable) {
		case 1:
			this.columnQ1 = 6;
			break;
		case 2:
			this.columnQ1 = 7;
			break;
		case 3:
			this.columnQ1 = 5;
			break;
		case 4:
			this.columnQ1 = 5;
			break;
		case 5:
			this.columnQ1 = 6;
			break;
		case 6:
			this.columnQ1 = 6;
			break;
		case 7:
			this.columnQ1 = 6;
			break;
		case 8:
			this.columnQ1 = 6;
			break;
		}
	}

	@Override
	public int getColumnCount() {
		return columnQ1;
	}

	@Override
	public int getRowCount() {
		return tableData.size();
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		String[] rows = tableData.get(arg0);
		return rows[arg1];
	}

	@Override
	public String getColumnName(int colomnIndex) {
		switch (nomTable) {
		case 1:
			switch (colomnIndex) {
			case 0:
				return "�����";
			case 1:
				return "����";
			case 2:
				return "����� ������-����";
			case 3:
				return "����� ����������";
			case 4:
				return "ʳ������ ����� ������";
			case 5:
				return "����� ����������";
			}
			return null;
		case 2:
			switch (colomnIndex) {
			case 0:
				return "�����";
			case 1:
				return "�������";
			case 2:
				return "����";
			case 3:
				return "ĳ�����";
			case 4:
				return "���� ������� �������";
			case 5:
				return "ʳ������ �������";
			case 6:
				return "������ ������-����";
			}
			return null;
		case 3:
			switch (colomnIndex) {
			case 0:
				return "����� ����������";
			case 1:
				return "г� ���������� ����������";
			case 2:
				return "����� �����";
			case 3:
				return "��� ����������";
			case 4:
				return "������� ������� ����������";
			}
			return null;
		case 4:
			switch (colomnIndex) {
			case 0:
				return "����� �����";
			case 1:
				return "�������";
			case 2:
				return "�������� ����";
			case 3:
				return "������� �������";
			case 4:
				return "ʳ������ ���������";
			}
			return null;
		case 5:
			switch (colomnIndex) {
			case 0:
				return "ϲ� ����������";
			case 1:
				return "���� ���������� ����������";
			case 2:
				return "����� �����";
			case 3:
				return "����� ����������";
			case 4:
				return "ʳ������ ������� ����������";
			case 5:
				return "������������ ����������";
			}
			return null;
		case 6:
			switch (colomnIndex) {
			case 0:
				return "����� ����������";
			case 1:
				return "ʳ������ ������� � ����������";
			case 2:
				return "г� ������� ������� � ����������";
			case 3:
				return "������������� ����������";
			case 4:
				return "г� ���������� ����������";
			case 5:
				return "����� �����";
			}
			return null;
		case 7:
			switch (colomnIndex) {
			case 0:
				return "���� �������";
			case 1:
				return "������� �������";
			case 2:
				return "������ �������";
			case 3:
				return "����� ��������� �������";
			case 4:
				return "г� �������";
			case 5:
				return "��������� �������";
			}
			return null;
		case 8:
			switch (colomnIndex) {
			case 0:
				return "�����  ������� �������";
			case 1:
				return "���� �������";
			case 2:
				return "����� ���������� ����������";
			case 3:
				return "����";
			case 4:
				return "����� �����";
			case 5:
				return "������ ����������� �� ����";
			case 6:
				return "ʳ������ ��� ����������� �� ����";
			}
			return null;
		}
		return null;
	}

	public void addData(String[] row) {
		String[] rowTable = new String[getColumnCount()];
		rowTable = row;
		tableData.add(rowTable);
	}

	public void addData() {
		ResultSet rez = null;
		try {
			switch (nomTable) {

			case 1:
				rez = Main.myStmt.executeQuery("SELECT * FROM spaceship");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("weight"), rez.getString("nameLan"),
							rez.getString("namecosmod"), rez.getString("numbMan"), rez.getString("nameCorp") };
					addData(row);
				}
				break;
			case 2:
				rez = Main.myStmt.executeQuery("SELECT * From launchvehicle");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("lon"), rez.getString("weight"),
							rez.getString("diam"), rez.getString("dateFS"), rez.getString("numbZ"),
							rez.getString("statysL") };
					addData(row);
				}
				break;
			case 3:
				rez = Main.myStmt.executeQuery("SELECT * From corporation");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("age"), rez.getString("nameC"),
							rez.getString("typeCor"), rez.getString("mainMan") };
					addData(row);
				}
				break;
			case 4:
				rez = Main.myStmt.executeQuery("SELECT * From country");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("capital"), rez.getString("lang"),
							rez.getString("money"), rez.getString("population") };
					addData(row);
				}
				break;
			case 5:
				rez = Main.myStmt.executeQuery("SELECT * From spaceman");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("dat"), rez.getString("nameC"),
							rez.getString("nameCor"), rez.getString("numbF"), rez.getString("spet") };
					addData(row);
				}
				break;
			case 6:
				rez = Main.myStmt.executeQuery("SELECT * From cosmodrome");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("numbSt"), rez.getString("ageFirstF"),
							rez.getString("work"), rez.getString("age"), rez.getString("nameC") };
					addData(row);
				}
				break;
			case 7:
				rez = Main.myStmt.executeQuery("SELECT * From flight");
				while (rez.next()) {
					String[] row = { rez.getString("day"), rez.getString("perigee"), rez.getString("apogee"),
							rez.getString("nameSh"), rez.getString("age"), rez.getString("duration") };
					addData(row);
				}
				break;
			case 8:
				rez = Main.myStmt.executeQuery("SELECT * From spacestation");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("dat"), rez.getString("weight"),
							rez.getString("nameC"), rez.getString("stat"), rez.getString("numbDay") };
					addData(row);
				}
				break;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
