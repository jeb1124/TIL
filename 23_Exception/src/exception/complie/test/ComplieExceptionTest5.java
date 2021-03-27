package exception.complie.test;
//1.try~catch	2. throws
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ComplieExceptionTest5 {
	public static void main(String[] args) throws FileNotFoundException, IOException{	
		String path = "C:\\encore_jeb\\util\\poem.txt";
		FileReader fr = null;
	
		System.out.println("1. FileReader 객체를 생성..");
		
		try {
			fr = new FileReader(path);
			
			System.out.println("2.FileReader의 기능을 이용해서 파일의 내용을 일거들입니다.");
			fr.read();
				
		}finally {
			fr.close();//이 코드가 상당히 중요!
		}
	}
}
