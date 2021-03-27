package array.test;

import java.util.Arrays;
import java.util.Random;

public class ArraySortingTest5 {

	public static void main(String[] args) {
		Random r = new Random();
	  //int a = r.nextInt();
		
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++)
			arr[i] = r.nextInt(10);//0~9사이 임의의 정수값
		
		System.out.println("========== Array 초기화 완료========\n");
		for(int i : arr) System.out.println(i+" ");
		
		//~Test4에서 이중 for문을 사용해 Bubble Sorting하는 로직을 이제는 내부적으로 구현된 함수를 바로 사용
		Arrays.sort(arr);
		
		System.out.println("========== 정렬 완료 ========\n");
		for(int i : arr) System.out.println(i+" ");
	}

}
