package looping.test;
/*
 * �ݺ��� �߿��� ���� ���� ���Ǵ�
 * for���� ��� �����ϴ��� ��Ȯ�ϰ� �����Ѵ�.
 * 
 * for(�ʱ��; ���ǽ�; ������)
 */

public class LoopingBasicTest1 {

	public static void main(String[] args) {
		System.out.println("==================for=================\n");
		for(int i=0; i<10; i++) {//i�� for�� �ȿ��� ����ǰ� �����ǰ� ����. ���� �ߺ��� �ش� �ȵ�.
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