package stream.data.test;
//1. 스트림 생성
//2. while문 안에서 읽어들이고
//3. 콘솔로 출력

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputStreamTest2 {

	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("src\\score.dat"));
			int data = 0;

			while(true) {
				data = dis.readInt();
				System.out.println(data);
			}
		}catch(EOFException e){ //ENDOFFILEEXCEPTION..  MORE EXCEPTION!!!.. IOException의 자식
			
		}catch(IOException e){//EOFException보다 크다.. 점점 큰 녀석을 잡아야함
			
		}finally {
			try {
				dis.close();
			} catch (IOException e) {

			}
		}
	}
}

