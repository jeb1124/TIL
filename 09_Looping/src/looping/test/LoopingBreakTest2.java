package looping.test;
/*
 * for���� �̿��ؼ� 1~100������ �� ���� ���ϴ� ������ �ۼ�
 * -�� ���� 500�� �Ѿ�� �ݺ��� �ߴ��ϰ�...break
 * �� ���� �� �հ� i ���� ���
 */

public class LoopingBreakTest2 {

	public static void main(String[] args) {
		int sum = 0;//local ����(���θ޼ҵ� �ȿ��� ����)...�⺻���� �����Ƿ� �ݵ�� �ʱ�ȭ �ʼ�!
		for(int i=1; i<=100; i++) {
			
			sum += i;//sum = sum+i;
			if(sum>500) break;
		}
		System.out.println(sum);
		
	}//main

}
