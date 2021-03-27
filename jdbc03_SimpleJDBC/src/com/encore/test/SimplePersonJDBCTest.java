package com.encore.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.vo.Person;

import config.ServerInfo;

/*
 *  DAO + Test
 *  JDBC 4단계(드라이버 로딩은 제외)
 *  2. DB연결
 *  3. PrepareStatement 생성
 *  4. 쿼리문 실행 및 바인딩
 *  5. 자원 닫기
 *  ---> 이중에서
 *  메소드마다 고정적으로 바뀌지 않고 로직이 작성되는 부분은 2,5임.
 *  이런 부분은 위에다 메소드를 새롭게 정의하고
 *  메소드마다 호출해서 재사용하는 방법으로 로직을 다시 작성해야함.
 */

public class SimplePersonJDBCTest {
	public SimplePersonJDBCTest() throws ClassNotFoundException{
		Class.forName(ServerInfo.DRIVER);
		System.out.println("Driver Loading...");
	}
	
	//고정적으로 반복되는 부분을 공통적인 로직으로 정의...getConnect(),close()
	public Connection getConnect() throws SQLException{
		Connection conn = DriverManager.getConnection(ServerInfo.URL,ServerInfo.USER,ServerInfo.PASSWORD);
		System.out.println("DB 서버 연결");
		return conn;
	}
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	
	public void closeAll(ResultSet rs,PreparedStatement ps, Connection conn) throws SQLException{
		if(rs!=null) rs.close();
		closeAll(ps,conn);
	}
	
	//비지니스 로직(DB Access하는 로직) 정의
	public void addPerson(Person p) throws SQLException{
		Connection conn = null;//local로 선언해서 초기화해야함
		PreparedStatement ps = null;
		
		conn = getConnect();
		
		String query = "insert into person values(?,?,?)";
		
		ps = conn.prepareStatement(query);
		System.out.println("prepareStatement 객체 생성");
		
		ps.setInt(1, p.getSsn());
		ps.setString(2, p.getName());
		ps.setString(3, p.getAddress());
		
		System.out.println(ps.executeUpdate()+" 명 추가되었습니다.");
		
		closeAll(ps, conn);
	
	}
	
	public void deletePerson(int ssn) throws SQLException{
		Connection conn = null;//local로 선언해서 초기화해야함
		PreparedStatement ps = null;
		//2.
		conn = getConnect();
		
		//3.
		String query = "delete from person where ssn=?";		
		ps = conn.prepareStatement(query);
		System.out.println("prepareStatement 객체 생성");
		
		//4.
		ps.setInt(1, ssn);		
		System.out.println(ps.executeUpdate()+" 명 삭제되었습니다.");
		
		//5.
		closeAll(ps, conn);
	}
	
	public void updatePerson(Person p) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
	
		conn = getConnect();		
		
		String query = "update person set name=?, address=? where ssn=?";		
		ps = conn.prepareStatement(query);
		System.out.println("prepareStatement 객체 생성");
				
		ps.setString(1, p.getName());
		ps.setString(2, p.getAddress());
		ps.setInt(3, p.getSsn());
		System.out.println(ps.executeUpdate()+" 명 수정되었습니다.");
			
		closeAll(ps, conn);
	}
	
	//select...conn, ps, rs..close?
	
	public ArrayList<Person> findAllPerson() throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		conn = getConnect();
		ArrayList<Person> list = new ArrayList<Person>();
		
		String query = "select ssn, name, address from person";		
		
		ps = conn.prepareStatement(query);
		System.out.println("prepareStatement 객체 생성");
		
		rs = ps.executeQuery();
		while(rs.next()) {
			list.add(new Person(rs.getInt("ssn"),
						rs.getString("name"),
						rs.getString("address")));
		}
		closeAll(rs, ps, conn);
		return list;
	
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, Exception{
		SimplePersonJDBCTest jdbc = new SimplePersonJDBCTest();
		//jdbc.addPerson(new Person(333, "Tomas", "Canada"));
		//jdbc.deletePerson(222);
		//jdbc.updatePerson(new Person(333, "Tomson", "Brandon"));
		ArrayList<Person> returnList =jdbc.findAllPerson();
		for(Person p : returnList) System.out.println(p);
				
	}

}
