package stream.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 *  ���Ͽ� �Էµ� ������ �о
 *  �� �ٸ� ���Ϸ� ����ϴ� ������ �ۼ�
 *  ::
 *  ��Ʈ�� 
 *  �Է� 2�� -- FileReader, BufferedReader
 *  ��� 2�� -- FileWriter, BufferedWriter
 *  ::
 *  1.��Ʈ�� ����..4�� ����
 *  2.������ ������ �о
 *  3.�� �ٸ� ���Ϸ� ���(Sink)
 */
public class FileReadingAndWritingTest3 {

	public static void main(String[] args) throws IOException{
		//1. ��Ʈ������ -- �Է� 2��(FileReader, BufferedReader)
		BufferedReader br = new BufferedReader(new FileReader("src\\hope.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("src\\result.txt",true), true);
		
		try {
		//2. while������ ������ ������ �ϰ�
			String line = null;
			while((line=br.readLine())!=null) {
				//3. �� �ٸ� ���Ϸ� ���(Sink)..�� �κ��� ����..
				pw.println(line);
			}
		//bw.flush();//auto flushing ���..�����͸� ��Ƶ��� ���� �ԷµǴ� ���� �ٷ� ���
		}finally {
			br.close();
			pw.close();
		}
		
	}

}
