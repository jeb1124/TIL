package file.test;

import java.io.File;

/*
 * ���� = ���丮 ���� + �����̸�
 * �ش� Ŭ�������� 
 * ������ �پ��� ������� ����
 * getParentFile() : file, getParent() : String
 *  | 
 *  mkdir(), mkdirs() 
 *  �Լ��� ����� �ڼ��� �˾ƺ��� ������ �ۼ�
 */
public class FileExamTest1 {

	public static void main(String[] args) {
		File dir = new File("c:\\fileTest");//�̰Ŵ� ���丮 --1
		File dir2 = new File("c:\\fileTest1\\step1\\code");//--2
		File dir3 = new File("c:\\fileTest1\\exam\\data.dat");
		
		System.out.println("������ �����Ǿ�����??");
		
		dir.mkdir();//���丮 ����� funtion --1
		dir2.mkdirs();//--2
		dir3.getParentFile().mkdirs();
		
		//dir3.getParent();
	}

}
