package s0626;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Whatever {

}

public class ListTest {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>(); // 리스트는 메모리 생성 불가능 옛날버전은 new ArrayList<> <안에 class이름을 써줘야함

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 1; i++) {
			System.out.print("자동차 정보를 ,를 기준으로 입력해주세요 : ");
			String[] infos = scan.nextLine().split(",");
			Car c = new Car();
			c.setName(infos[0]);
			c.setCarMaker(infos[1]);
			c.setColor(infos[2]);
			c.setCc(Integer.parseInt(infos[3]));
			carList.add(c);

		}
		System.out.println(carList);

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			Connection con = DriverManager.getConnection(url, "root", "1234");
			Statement stmt = con.createStatement();
			for (int i = 0; i < carList.size(); i++) {
				Car c = carList.get(i);
				String sql = "insert into car(NAME,carmaker, color,cc)"; // 이상태에서 connect하면 붙어서 가기때문에 오류남. class앞에 꼭
																			// 띄워줘야함
				sql += "values('" + c.getName() + "','" + c.getCarMaker() + "','" + c.getColor() + "', "+ c.getCc() + ")"; // sql에 넣을때 values
				int result = stmt.executeUpdate(sql);
				System.out.println(sql);

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
