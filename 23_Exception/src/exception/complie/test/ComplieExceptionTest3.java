package exception.complie.test;
//1.try~catch	2. throws
import java.io.FileNotFoundException;
import java.io.FileReader;

class FileReading3{
	public void readFile(String filename) throws FileNotFoundException{
		
			FileReader fr = new FileReader(filename);
			System.out.println("...new FileReader()...filename..");
		
		System.out.print("FileReader Creating...");
	}
}
public class ComplieExceptionTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		FileReading3 f = new FileReading3();
		String path = "C:\\encore_jeb\\util\\poem.txt";
	
			f.readFile(path);
	
		System.out.println("파일을 잘 읽어들였습니다..");
	}

}
