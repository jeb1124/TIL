package array.test;
/*
 * �迭�� ���� + ���� + �ʱ�ȭ
 * --> �� ����� �� ���� ���
 * 
 * ::
 * 1. �迭�� Resizing �� �� ����
 *    ó�� ���� ����� �����ϰ� �Ǹ� ���ο� �迭�� �ϳ� ������
 *    
 * 2. �迭�� ��ü��!
 *    new Ű���带 ���� ����..Heap�� �ö�
 *    ������ Class Type�� �������� ����
 *    length��� �ʵ带 �ݵ�� ����� ��
 *    length ==> �迭 �� ������ ������ �����ϴ� �ʵ�
 *   
 * 3. �迭�� ReSizing�� �ȵ����� ����� �ٸ� �迭�� �����͸� �����Ͽ� ����� ����
 *    System.arraycopy()�� ����Ѵ�.
 */

public class ArrayBasicTest2 {

	public static void main(String[] args) {
		int[] arr = {11,22,33};//����, ����, �ʱ�ȭ �ѹ���
		System.out.println(arr);//array �ּҰ� ���
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]+"");//11, 22, 33
			
		//44,55 ���� �ڴʰ� ���ܼ� �߰��ؾ� �Ѵ�.
		arr = new int[5];
		arr[3] = 44;
		arr[4] = 55;
		
		System.out.println("\n=======================");
		System.out.println(arr);
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]+" ");
	
		System.out.println("\n==========arraycopy()=============");
		int[] target = {1,2,3,4,5,6};
		int[] source = {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(source, 3, target, 0, 4);
		//source �迭���� �ε��� 3��°���� 4�� �����Ͽ��� Ÿ�� �迭 �ε��� 0�� ���� �ٿ��ֱ� 
		for(int i=0; i<target.length; i++) System.out.println(target[i]+" ");
		}

	

}
