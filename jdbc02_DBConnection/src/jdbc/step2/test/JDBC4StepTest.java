package jdbc.step2.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;

/*
 * DB Access 하기 위하 4단계 작업을 완성하는 로직
 * 1. DB server에 대한 파편적인 정보들(서버 실제값)을 상수로 지정
 * -->
 * 문제점: 소스코드에 서버정보가 그대로 노출되어져 있다.
 * 메타데이터화 시키자
 * ::
 * 해결책
 * 2. 상수값과 추상메소드를 구성요소로 가지는 인터페이스를 별도의 모듈로 생성하고
 *    그 안에 서버 정보를 메타데이터화 시키겠다.
 * 
 */
public class JDBC4StepTest {
	
	public JDBC4StepTest() throws ClassNotFoundException, SQLException{
		Class.forName(ServerInfo.DRIVER);		
		System.out.println("1.드라이버 로딩 성공..");
		
		Connection conn=DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		System.out.println("2.DB 연결 성공..");
		
		
		String query="insert into mytable (num,name,address) values(?,?,?)";
		PreparedStatement ps = conn.prepareStatement(query);
		System.out.println("2.PreparedStatement 생성..");
		
		ps.setInt(1, 333);
		ps.setString(2, "박나래");
		ps.setString(3, "여의도");
		
		//4단계..
		int row=ps.executeUpdate();
		System.out.println(row+" row insert.....ok");
		
		String querydel="delete from mytable where num=?";
		PreparedStatement ps1 = conn.prepareStatement(querydel);
		System.out.println("3.PreparedStatement 생성..");
		
		ps1.setInt(1, 333);
		System.out.println(ps1.executeUpdate()+" row delete.....ok");
		
		
		//update..111인 사람의 이름과 주소를 변경
		/*
		String queryUpdate="update mytable set name=?, address=? where num=?";
		PreparedStatement ps2 = conn.prepareStatement(queryUpdate);
		System.out.println("4.PreparedStatement 생성..");
		
		ps2.setString(1, "정우재");	
		ps2.setString(2, "방배동");
		ps2.setInt(3, 111);
		System.out.println(ps2.executeUpdate()+" row update.....ok");
		*/
		
		//mytable에 있는 모든 정보를 출력
		String querySel="select num, name, address from mytable";
		PreparedStatement ps3 = conn.prepareStatement(querySel);
		
		ResultSet rs = ps3.executeQuery();
		System.out.println("=============================================");
		while(rs.next()) {
			System.out.println(rs.getInt("num")+"\t"
							   +rs.getString("name")+"\t"
							   +rs.getString("address"));
		
		}
		System.out.println("=============================================");
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		new JDBC4StepTest();

	}

}
