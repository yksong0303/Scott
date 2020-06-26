package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection2 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/java", "root", "1234");
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("num") + ",");
				System.out.println(rs.getString("name") + ",");
				System.out.println(rs.getString("id"));
				System.out.println();
			}
			sql = "INSERT INTO user\r\n" + 
					"VALUES(3,'네 임','NAME2');";
			int result = stmt.executeUpdate(sql);
			System.out.println("실행결과 반영 갯수 = "+result);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
