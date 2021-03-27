package stream.data.test;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������ �������� ���Ϸ� ����ϴ� �ڵ帣 �ۼ�
 * ���࿡ score.dat ���� ������ �������� �ʾƼ� ��µǴ� ���� �޼����� ����
 * ����Ʈ �迭 ��Ʈ���� ��µǴ� ������ ���� ����� �ƴ�,Binary Date(���� ������)�̱⿡
 * ����������� ���Ƶ� �� �� ���� �������� ����
 * �׷��� �ᱹ �̸� Ȯ���ϱ� ���ؼ���
 * score.dat���Ͽ� ��µ� Binary Data�� �ٽ� DataInputStream�� ���ؼ� �ڹ� �⺻��(int)���� �ڵ���ȯ���Ѽ� �о�鿩�� ��.
 */
public class DataOutputStreamTest1 {
	public static void main(String[] args) throws IOException{
		int[] scores = {100,90,70,75,66};//���� ����� �ƴϴ�...����Ʈ�迭 ��� ��Ʈ�� ���(FileOutputStream)
		String outfile = "src\\score.dat";
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(outfile));
		
		System.out.println("score.dat������ �����Ǿ����ϴ�.");
		
		//2. �迭 �ȿ� ����ִ� ������ ������ ���Ϸ� ���..writeInt()
		for(int score : scores)dos.writeInt(score);
	

	}

}
