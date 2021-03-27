package exception.complie.test;
import java.io.FileInputStream;
/*
 * 1.
 * 예외라는 것은 매우 다양한 상황에서 발생할 수 있다.
 * 이럴때 모든 예외를 Exception 상위클래스로 뭉뚱그려서 하나로 처리하는 것은 그다지 좋은 방법은 아님
 * --> 어느정도 세분화 하는 것이 좋음
 * --> 공통적인 카테고리의 예외는 한가지로 묶어주는 것도 좋음
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ComplieExceptionTest6 {
	public static void main(String[] args)  {	
		try {
			Class.forName("exception.compile.test.ComplieExceptionTest6");
			new FileInputStream("Hello");
			DriverManager.getConnection("aaa");
		}catch(ClassNotFoundException e) {
			System.out.printf("해당 클래스를 찾을 수가 없습니다...: %s",e.getMessage());
		}catch(FileNotFoundException | SQLException e) {
			System.out.printf("해당 하는 리소스가 없습니다: %s",e.getMessage());
		}
		System.out.println("프로그램 정상종료");
	}
}
