package stream.data.test;
//1. ��Ʈ�� ����
//2. while�� �ȿ��� �о���̰�
//3. �ַܼ� ���

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
		}catch(EOFException e){ //ENDOFFILEEXCEPTION..  MORE EXCEPTION!!!.. IOException�� �ڽ�
			
		}catch(IOException e){//EOFException���� ũ��.. ���� ū �༮�� ��ƾ���
			
		}finally {
			try {
				dis.close();
			} catch (IOException e) {

			}
		}
	}
}

