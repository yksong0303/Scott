package com.test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection3 {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			Statement stmt = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/java", "root", "1234").createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("num")+",");
				System.out.println(rs.getString("name")+",");
				System.out.println(rs.getString("id")+",");
				System.out.println();
			}
			sql = "INSERT INTO user\r\n" + 
					"VALUES(4,'하 이','ㅂㄷㅂㄷ');";
			int result = stmt.executeUpdate(sql);
			System.out.println("실행결과 반영 : "+result);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
