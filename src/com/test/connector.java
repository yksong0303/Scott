package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connector {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");//org에 mariadb에 jdbc에 Driver라는 파일을 사용한다, 없으면 catch로 넘어감,, Class.forName은 trycatch를 써야 사용가능
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
			Connection conn = DriverManager.getConnection(url, id, pwd);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM user";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getInt("num")+",");
				System.out.print(rs.getString("name")+",");
				System.out.print(rs.getString("id"));
				System.out.println();
			}
			sql = "INSERT INTO user\r\n" +  //""하고 안에 복붙하면 자동으로 문자 정렬됨
					"VALUES(2,'이름','NAME');";
			int result = stmt.executeUpdate(sql);
			System.out.println("니 실행결과 반영 갯수 : " +result);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // class만들어서 2번
}
