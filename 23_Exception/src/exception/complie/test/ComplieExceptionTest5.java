package exception.complie.test;
//1.try~catch	2. throws
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ComplieExceptionTest5 {
	public static void main(String[] args) throws FileNotFoundException, IOException{	
		String path = "C:\\encore_jeb\\util\\poem.txt";
		FileReader fr = null;
	
		System.out.println("1. FileReader ��ü�� ����..");
		
		try {
			fr = new FileReader(path);
			
			System.out.println("2.FileReader�� ����� �̿��ؼ� ������ ������ �ϰŵ��Դϴ�.");
			fr.read();
				
		}finally {
			fr.close();//�� �ڵ尡 ����� �߿�!
		}
	}
}
