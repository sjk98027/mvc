package common;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	public static Connection getconn(User user) {
		String userName = user.getUserName();
		String pw = user.getUserPw();
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return conn = DriverManager.getConnection(url, userName, pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

}
