package array.test;
/*
 * 배열의 선언 + 생성 + 초기화
 * --> 이 방법을 더 많이 사용
 * 
 * ::
 * 1. 배열은 Resizing 할 수 없음
 *    처음 잡은 사이즈를 변경하게 되면 새로운 배열이 하나 생성됨
 *    
 * 2. 배열은 객체임!
 *    new 키워드를 통해 생성..Heap에 올라감
 *    하지만 Class Type이 존재하지 않음
 *    length라는 필드를 반드시 기억할 것
 *    length ==> 배열 안 데이터 개수를 리턴하는 필드
 *   
 * 3. 배열은 ReSizing은 안되지만 사이즈가 다른 배열의 데이터를 복사하여 사용은 가능
 *    System.arraycopy()를 사용한다.
 */

public class ArrayBasicTest2 {

	public static void main(String[] args) {
		int[] arr = {11,22,33};//선언, 생성, 초기화 한번에
		System.out.println(arr);//array 주소값 출력
		for(int i=0; i<arr.length; i++) System.out.println(arr[i]+"");//11, 22, 33
			
		//44,55 값이 뒤늦게 생겨서 추가해야 한다.
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
		//source 배열에서 인덱스 3번째부터 4개 복사하여를 타겟 배열 인덱스 0번 부터 붙여넣기 
		for(int i=0; i<target.length; i++) System.out.println(target[i]+" ");
		}

	

}
