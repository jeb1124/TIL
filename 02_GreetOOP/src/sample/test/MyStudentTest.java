package sample.test;

import sample.MyStudent;

/*
 * 1.MyStudent 객체 생성...ms
 * 2.MyStudent의 메소드의 동작
 * 
 */

public class MyStudentTest {

	public static void main(String[] args) {
		MyStudent ms = new MyStudent(); //1
		
		//2
		ms.name = "조은비";
		ms.age = 25;
		ms.address = "구로구";
		//위의 3줄의 문제점은 실제값이 하드코딩되면 프로그램이라고 할 수 없음(재사용성이 떨어짐)
		
		ms.printInfo();
		
	}
}
