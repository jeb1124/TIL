package com.encore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.encore.dao.BookDAO;
import com.encore.exception.BookNotFoundException;
import com.encore.exception.DuplicateISBNException;
import com.encore.exception.InvalidInputException;
import com.encore.vo.Book;

import config.ServerInfo;

public class BookDAOImpl implements BookDAO{
	
	private static BookDAOImpl dao = new BookDAOImpl();
	private BookDAOImpl() {
		
	}
	public static BookDAOImpl getInstance() {
		return dao;
	}
	//공통적인 로직..Connection getConnect()
	//공통적인 로직..closeAll()...오버로딩기법
	
	// 고정적으로 반복되는 부분을 공통적인 로직으로 정의...getConnect(), close()
	public Connection getConnect() throws SQLException{
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASSWORD);
		System.out.println("디비 서버 연결..");
		return conn;
	}
	
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException{
		if(rs!=null) rs.close();
		closeAll(ps, conn);		
	}
	
	public boolean isIsbn(String isbn, Connection conn) throws SQLException{ //true,false		
		String query = "SELECT isbn FROM book WHERE isbn=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1, isbn);
		ResultSet rs = ps.executeQuery();
		return rs.next();//true, false		
	}		
	@Override
	public void registerBook(Book vo) throws SQLException,DuplicateISBNException {	
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();//
			
			if(!isIsbn(vo.getIsbn(),conn)) { //isbn에 해당하는 책이 없다면....
				System.out.println("true...");
				String query = "INSERT INTO book VALUES(?,?,?,?,?)";
				ps = conn.prepareStatement(query);				
				
				ps.setString(1, vo.getIsbn());
				ps.setString(2, vo.getTitle());
				ps.setString(3, vo.getWriter());
				ps.setString(4, vo.getPublisher());
				ps.setInt(5, vo.getPrice());
				
				System.out.println(ps.executeUpdate()+" row Register!!!");
			}else {						//isbn에 해당하는 책이 있다면....예외발생
				throw new DuplicateISBNException();
			}
		}finally {
			closeAll(ps, conn);
		}
	}//

	@Override
	public void deleteBook(String isbn) throws SQLException, BookNotFoundException{		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			
			String query = "DELETE FROM book WHERE isbn=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, isbn);
			int row = ps.executeUpdate();
			if(row==0) throw new BookNotFoundException();
			else System.out.println(row+" ROW delete !!");
		}finally {
			closeAll(ps, conn);
		}
	}

	@Override
	public Book findByBook(String isbn, String title) throws SQLException {
	
		return null;
	}

	@Override
	public ArrayList<Book> findByWriter(String writer) throws SQLException {
		ArrayList<Book> list = new ArrayList<Book>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = getConnect();
			String query = "SELECT * FROM book WHERE author=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, writer);
			rs = ps.executeQuery();
			while(rs.next()) {
				Book vo = new Book(
								rs.getString(1), 
								rs.getString(2), 
								writer, 
								rs.getString(4), 
								rs.getInt(5));
				list.add(vo);
			}
		}finally {
			closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public ArrayList<Book> findByPublisher(String publisher) throws SQLException {
		
		return null;
	}

	@Override
	public ArrayList<Book> findByPrice(int min, int max) throws SQLException ,InvalidInputException{
		if(min<=0 || min <0 || min >=max) throw new InvalidInputException();
		
		ArrayList<Book> list = new ArrayList<Book>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = getConnect();
			String query = "SELECT * FROM book WHERE price >= ? AND price <= ?";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, min);
			ps.setInt(2, max);
			rs = ps.executeQuery();
			while(rs.next()) {
				Book vo = new Book(
						rs.getString(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getInt(5));
						list.add(vo);
			}
		}finally {
			closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public void discountBook(int per, String publisher) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			String query = "UPDATE book SET price = (price * (1-?/100)) WHERE publisher=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, per);
			ps.setString(2, publisher);
			System.out.println(ps.executeUpdate()+" row price update");
		}finally {
			closeAll(ps, conn);
		}
		
	}

	@Override
	public void printAllInfo() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = getConnect();
			String query = "SELECT * FROM book";
			ps = conn.prepareStatement(query);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Book vo = new Book(
						rs.getString(1), 
						rs.getString(2), 
						rs.getString(3), 
						rs.getString(4), 
						rs.getInt(5));
			}
		}finally {
			closeAll(rs, ps, conn);
		}
	}
}