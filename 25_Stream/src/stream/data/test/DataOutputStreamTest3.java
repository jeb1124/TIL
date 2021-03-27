package stream.data.test;

import java.io.DataInputStream;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataOutputStreamTest3 {

	public static void main(String[] args) {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("src\\score.dat"));
			int data = 0;

			while((data = dis.readInt())!= -1) { // 바이너리 데이터에서 파일의 끝은 -1이다.

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

