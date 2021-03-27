package test;

import java.util.Scanner;
/*
 * Scanner 클래스는
 * 실행시(컴파일시가 아님) 키보드로 입력된 값을 입력받도록 해주는 기능을 가지고 있는 클래스
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.println("키보드로 숫자 2개와 이름을 입력하세요>>>");
		Scanner sc = new Scanner(System.in);//in은 키보드 값, out은 콘솔
		int i = sc.nextInt();//공백을 기준으로 데이터를 반환 nextInt는 int 형태의 값을 입력해라
		int j = sc.nextInt();
		sc.nextLine();//한 라인을 기준으로 데이터를 반환
		String name = sc.next();//공백을 기준으로 데이터를 반환

		System.out.println("숫자값 i:"+i+",j: "+j);
		System.out.println(name);

	}

}
