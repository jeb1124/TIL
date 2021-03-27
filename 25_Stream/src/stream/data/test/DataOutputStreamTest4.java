package stream.data.test;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * scores.dat파일의 내용을 readInt()로 읽어들여서 
 * 각가의 점수를 출력하고 
 * 모든 점수의 총합을 구하는 로직 작성...
 * EOFException은 컴파일 시점에 잡혀지지 않고 
 * 실행 시점에서 잡혀지기 때문에 
 * main메소드 선언부에서 throws로 던져질 수 없다.
 * 
 * ------------------------------------------------------------
 * main메소드 선언부에서 throws로 예외를 던져
 * main을 호출한 곳(JVM)에서 예외를 처리할 수 있는 것은 
 * Compile Exception계열만 가능했다.
 */


public class DataOutputStreamTest4 {

	public static void main(String[] args) {
		int sum =0;
		int score =0;
		DataInputStream dis =null;
		

		try {
			//1. 스트림 생성
			dis = new DataInputStream(new FileInputStream("src\\score.dat"));
			System.out.println("Stream Creating...");
			
			while(true) {
				score = dis.readInt();
				System.out.println(score);
				sum += score;
			}
			
		}catch(EOFException e) {
			System.out.println("모든 점수의 총ㄴ합은 " + sum + "점 입니다!");
			//파일의 마지막 부분까지 모두 읽음. 마지막 문장 사용
		}catch(IOException e) {
			
		}finally {
			try {
				dis.close();
			} catch(IOException e) {
				
			}
			
		}
		//
	}
}
