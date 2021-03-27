package looping.test;
/*
 * 1~100까지 숫자 중 홀수의 합 출력...하는 로직 작성
 * 1) 먼저 1~100까지 합 출력
 * 2) 1)번 중에서 홀수의 합만 합해나간다... continue사용
 */

public class LoopingContinueTest3 {
	

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i =1; i<=100; i++) {
			if(i%2==0) continue; //아래 코드 건너 뛰고 반복을 계속 하라!
			sum += i;
			
		}
		System.out.println("1부터 100까지 홀수의 합..."+sum);
		

	}

}
