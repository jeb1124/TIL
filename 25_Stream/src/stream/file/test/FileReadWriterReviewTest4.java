package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * hope.txt파일의 문자 데이터를 읽어서 --- FileReader Character계열 사용
 * 다른 경로의 result.txt 파일로 문자 데이터를 출력 --- FileWriter Character계열 사용
 * 
 * ::
 * 스트릠 코드 작성 패턴
 * 1. 입력, 출력 스트림을 한꺼번에 생성
 * 
 * 2. 반복문 안에서 데이터를 전부 다 읽어서
 * 
 * 3. 반복문 안에서 읽어들인 데이터를 Sink방향으로 전부 다 출력
 * 	  --> 문자 데이터를 출력할 떄는 일어들이는 족족 출력하지 않고
 * 		  일정량만큼 모아두었다가 한꺼번에 출력하는 패턴을 보임.
 *        1) auto flush 기능 -- flush()
 *        2) 자원을 닫을 때 그 안에 있는 데이터를 한꺼번에 출력 -- close()
 */
class FileReadWriterReview{
	FileReadWriterReview() throws IOException{
		BufferedReader br =null;
		PrintWriter pw = null;
		try {
		//로직을 여기에다가 작성...1-->2-->3
			br = new BufferedReader(new FileReader("src\\hope.txt"));
			pw = new PrintWriter("C:\\data\\result.txt");//디렉토리가 존재해야지만 출력스트림이 생성...그 안에 출력파일도 만들어짐
			System.out.println("1.Stream Creating....");
			
			String line = null;
			System.out.println("1.FileReading..and Printint...");
			while((line = br.readLine())!=null) pw.println(line);
		}finally {
			br.close();
			pw.close();
		}
	}
}
public class FileReadWriterReviewTest4 {

	public static void main(String[] args) throws IOException{
		new FileReadWriterReview();
	}

}
