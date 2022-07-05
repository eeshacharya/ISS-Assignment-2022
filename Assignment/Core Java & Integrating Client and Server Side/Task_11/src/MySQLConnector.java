import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class MySQLConnector {
	public static void main(String args[]) {

		Connection conn1 = null;
		try {
			String url1 = "jdbc:mysql://localhost:3306/jdbc_example";
			String user = "root";
			String password = "4813";

			conn1 = DriverManager.getConnection(url1, user, password);	
			if (conn1 != null) {
				System.out.println("Connected to the database jdbc");
			}

			String query = "SELECT * FROM employee";

			Statement st = conn1.createStatement();

			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.format("%s, %s, %s,\n", id, name, age);
			}
			st.close();

		} catch (SQLException ex) {
			System.out.println("An error occurred. Maybe user/password is invalid");
			ex.printStackTrace();
		}
	}
}