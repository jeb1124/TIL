package file.test;

import java.io.File;

/*
 * 파일 = 디렉토리 정보 + 파일이름
 * 해당 클래스에는 
 * 파일을 다양한 방법으로 생성
 * getParentFile() : file, getParent() : String
 *  | 
 *  mkdir(), mkdirs() 
 *  함수의 기능을 자세히 알아보는 로직을 작성
 */
public class FileExamTest1 {

	public static void main(String[] args) {
		File dir = new File("c:\\fileTest");//이거는 디렉토리 --1
		File dir2 = new File("c:\\fileTest1\\step1\\code");//--2
		File dir3 = new File("c:\\fileTest1\\exam\\data.dat");
		
		System.out.println("파일이 생성되었나요??");
		
		dir.mkdir();//디렉토리 만드는 funtion --1
		dir2.mkdirs();//--2
		dir3.getParentFile().mkdirs();
		
		//dir3.getParent();
	}

}
