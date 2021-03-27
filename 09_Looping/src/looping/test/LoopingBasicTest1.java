package looping.test;
/*
 * 반복문 중에서 가장 많이 사용되는
 * for문이 어떻게 동작하는지 정확하게 이해한다.
 * 
 * for(초기식; 조건식; 증감식)
 */

public class LoopingBasicTest1 {

	public static void main(String[] args) {
		System.out.println("==================for=================\n");
		for(int i=0; i<10; i++) {//i는 for문 안에서 선언되고 생성되고 사용됨. 따라서 중복에 해당 안됨.
			System.out.println("Hello Looping...");
		}//for
		
		System.out.println("==================while==========\n");
		int i = 0;
		while(i<10) {
			System.out.println("Hello Looping....."+i);
			i++;
		}
		
		System.out.println("============do while===========\n");
		int j = 0;
		do {
			System.out.println(j+ "Always print...");
			j++;
		}while(j<10);
	}
}