package kyrsova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModalQ extends AbstractTableModel {

	public ArrayList<String[]> tableData;
	public int columnQ1;

	public TableModalQ() {
		tableData = new ArrayList<String[]>();
		for (int i = 0; i < tableData.size(); i++) {
			tableData.add(new String[getColumnCount()]);
		}
		switch (QVis.nomQ) {
		case 1:
			this.columnQ1 = 7;
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
			this.columnQ1 = 7;
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
		switch (QVis.nomQ) {
		case 1:
			switch (colomnIndex) {
			case 0:
				return "Назва";
			case 1:
				return "Маса";
			case 2:
				return "Назва ракети-носія";
			case 3:
				return "Назва космодрому";
			case 4:
				return "Кількість членів екіпажу";
			case 5:
				return "Назва корпорації";
			case 6:
				return "Рік заснування";
			}
			return null;
		case 2:
			switch (colomnIndex) {
			case 0:
				return "Назва";
			case 1:
				return "Довжина";
			case 2:
				return "Маса";
			case 3:
				return "Діаметр";
			case 4:
				return "Дата першого запуску";
			case 5:
				return "Кількість запусків";
			case 6:
				return "Статус ракети-носія";
			}
			return null;
		case 3:
			switch (colomnIndex) {
			case 0:
				return "Назва корпорації";
			case 1:
				return "Рік заснування корпорації";
			case 2:
				return "Назва країни";
			case 3:
				return "Тип корпорації";
			case 4:
				return "Основна постать корпорації";
			}
			return null;
		case 4:
			switch (colomnIndex) {
			case 0:
				return "Назва країни";
			case 1:
				return "Столиця";
			case 2:
				return "Офіційна мова";
			case 3:
				return "Грошова одиниця";
			case 4:
				return "Кількість населення";
			}
			return null;
		case 5:
			switch (colomnIndex) {
			case 0:
				return "ПІБ космонавта";
			case 1:
				return "Дата народження космонавта";
			case 2:
				return "Назва країни";
			case 3:
				return "Назва корпорації";
			case 4:
				return "Кількість польотів космонавта";
			case 5:
				return "Спеціальність космонавта";
			}
			return null;
		case 6:
			switch (colomnIndex) {
			case 0:
				return "Назва космодрому";
			case 1:
				return "Кількість запусків з космодрому";
			case 2:
				return "Рік першого запуску з космодрому";
			case 3:
				return "Працездатність космодрому";
			case 4:
				return "Рік заснування космодрому";
			case 5:
				return "Назва країни";
			case 6:
				return "Столиця країни";
			}
			return null;
		case 7:
			switch (colomnIndex) {
			case 0:
				return "День польоту";
			case 1:
				return "Перигей польоту";
			case 2:
				return "Апогей польоту";
			case 3:
				return "Назва космічного корабля";
			case 4:
				return "Рік польоту";
			case 5:
				return "Тривалість польоту";
			}
			return null;
		case 8:
			switch (colomnIndex) {
			case 0:
				return "Назва  космічної станції";
			case 1:
				return "Дата запуску";
			case 2:
				return "Розмір векторного зображення";
			case 3:
				return "Маса";
			case 4:
				return "Назва країни";
			case 5:
				return "Статус знаходження на орбіті";
			case 6:
				return "Кількість днів перебування на орбіті";
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

	public void addData(String arg1, String arg2, String arg3) {
		ResultSet rez = null;
		try {
			switch (QVis.nomQ) {
			case 1:
				rez = Main.myStmt.executeQuery(
						"SELECT spaceship.name, spaceship.weight, spaceship.nameLan, spaceship.namecosmod, spaceship.numbMan, spaceship.nameCorp, corporation.age "
								+ "FROM galaxyspase.spaceship JOIN corporation ON " + "spaceship.namecosmod = '" + arg1
								+ "' and  spaceship.numbMan = " + arg2
								+ " and spaceship.nameCorp = corporation.name and corporation.age = " + arg3);
				while (rez.next()) {
					String[] row = { rez.getString("spaceship.name"), rez.getString("spaceship.weight"),
							rez.getString("spaceship.nameLan"), rez.getString("spaceship.namecosmod"),
							rez.getString("spaceship.numbMan"), rez.getString("spaceship.nameCorp"),
							rez.getString("corporation.age") };
					addData(row);
				}
				break;
			case 2:
				System.out.println(arg2);
				rez = Main.myStmt.executeQuery(
						"SELECT name, lon, weight, diam, dateFS, numbZ, statysL FROM galaxyspase.launchvehicle where numbZ = "
								+ arg1 + " and  statysL = '" + arg2 + "'");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("lon"), rez.getString("weight"),
							rez.getString("diam"), rez.getString("dateFS"), rez.getString("numbZ"),
							rez.getString("statysL") };
					addData(row);
				}
				break;
			case 3:
				rez = Main.myStmt.executeQuery(
						"SELECT name, age, nameC, typeCor, mainMan FROM galaxyspase.corporation where typeCor = '"
								+ arg1 + "' and  mainMan = '" + arg2 + "'");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("age"), rez.getString("nameC"),
							rez.getString("typeCor"), rez.getString("mainMan") };
					addData(row);
				}
				break;
			case 4:
				rez = Main.myStmt.executeQuery(
						"SELECT name, capital, lang, money, population FROM galaxyspase.country where money = '" + arg1
								+ "' and population = " + arg2);
				while (rez.next()) {

					String[] row = { rez.getString("name"), rez.getString("capital"), rez.getString("lang"),
							rez.getString("money"), rez.getString("population") };
					addData(row);
				}
				break;
			case 5:
				rez = Main.myStmt.executeQuery(
						"SELECT name, dat, nameC, nameCor, numbF, spet FROM galaxyspase.spaceman where  numbF = " + arg1
								+ " and  spet = '" + arg2 + "'");
				while (rez.next()) {
					String[] row = { rez.getString("name"), rez.getString("dat"), rez.getString("nameC"),
							rez.getString("nameCor"), rez.getString("numbF"), rez.getString("spet") };
					addData(row);
				}
				break;
			case 6:
				rez = Main.myStmt.executeQuery(
						"SELECT cosmodrome.name, cosmodrome.numbSt, cosmodrome.ageFirstF, cosmodrome.work, cosmodrome.age, cosmodrome.nameC, country.capital "
								+ " FROM galaxyspase.cosmodrome join country ON " + " cosmodrome.work = '" + arg1
								+ "' and cosmodrome.age = " + arg2
								+ " and cosmodrome.nameC = country.name and country.capital ='" + arg3 + "'");
				while (rez.next()) {
					String[] row = { rez.getString("cosmodrome.name"), rez.getString("cosmodrome.numbSt"),
							rez.getString("cosmodrome.ageFirstF"), rez.getString("cosmodrome.work"),
							rez.getString("cosmodrome.age"), rez.getString("cosmodrome.nameC"),
							rez.getString("country.capital") };
					addData(row);
				}
				break;
			case 7:
				rez = Main.myStmt.executeQuery("SELECT day, perigee, apogee, nameSh, age, duration FROM galaxyspase.flight where age = "+arg1+" and duration = "+arg2);
				while (rez.next()) {
					String[] row = { rez.getString("day"), rez.getString("perigee"), rez.getString("apogee"),
							rez.getString("nameSh"), rez.getString("age"), rez.getString("duration") };
					addData(row);
				}
				break;
			case 8:
				rez = Main.myStmt
						.executeQuery("SELECT name, dat, weight, nameC, stat, numbDay FROM galaxyspase.spacestation where stat = '"+arg1+"' and numbDay >"+arg2);
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
