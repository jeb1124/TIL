package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  파일에 입력된 내용을 읽어서
 *  또 다른 파일로 출력하는 로직을 작성
 *  ::
 *  스트링 
 *  입력 2개 -- FileReader, BufferedReader
 *  출력 2개 -- FileWriter, BufferedWriter
 *  ::
 *  1.스트림 생성..4개 생성
 *  2.파일의 내용을 읽어서
 *  3.또 다른 파일로 출려(Sink)
 */
public class FileReadingAndWritingTest2 {

	public static void main(String[] args) throws IOException{
		//1. 스트림생성 -- 입력 2개(FileReader, BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src\\result.txt"));
		
		try {
		//2. while문에서 파일의 내용을 일고
			String line = null;
			while((line=br.readLine())!=null) {
				//3. 또 다른 파일로 출려(Sink)..이 부분이 변경..
				bw.write(line);
				bw.newLine();
			}
		//bw.flush();//auto flushing 기능..데이터를 모아두지 말고 입력되는 족족 바로 출력
		}finally {
			br.close();
			bw.close();
		}
		
	}

}
