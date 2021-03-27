package stream.file.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 *  파일에 입력된 내용을 읽어서
 *  콘솔창으로 출력하는 로직을 작성
 *  ::
 *  스트링 
 *  입력 2개 -- FileReader, BufferedReader
 */
public class FileReaderingTest1 {

	public static void main(String[] args) throws IOException{
		//1. 스트림생성 -- 입력 2개(FileReader, BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		try {
		//2. while문에서 파일의 내용을 일고
			String line = null;
			while((line=br.readLine())!=null) {
		//3. 콘솔로 출력하기	
				System.out.println(line);
			}
		}finally {
			br.close();
		}
		
	}

}
