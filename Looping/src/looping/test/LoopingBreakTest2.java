package looping.test;
/*
 * for문을 이용해서 1~100까지의 총 합을 구하는 로직을 작성
 * -총 합이 500을 넘어가면 반복을 중단하고...break
 * 그 때의 총 합과 i 값을 출력
 */

public class LoopingBreakTest2 {

	public static void main(String[] args) {
		int sum = 0;//local 변수(메인메소드 안에서 사용됨)...기본값이 없으므로 반드시 초기화 필수!
		for(int i=1; i<=100; i++) {
			
			sum += i;//sum = sum+i;
			if(sum>500) break;
		}
		System.out.println(sum);
		
	}//main

}
