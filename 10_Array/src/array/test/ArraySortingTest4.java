package array.test;

import java.util.Random;

/*
 * Sorting --- 정렬
 * ::
 * 배열과 같은 자료구조에 있어서는 3,5,7,3,11,2
 * 정렬에 대한 요구사항이 빈번하게 일어남
 * 정렬이란?
 * 정렬 전 {3,6,1,2,8,9} ---> 오름차순 정렬 후 {1,2,3,6,8,9} ---> 내림차순 정렬 후 {9,8,6,3,2,1}
 * 
 * 정렬 | 순서
 * 순서는 값이 입력된 순서를 말함
 * a, bb, a, c, zz
 * 
 * ::
 * Bubble Sorting ---버블정렬
 * 정렬을 구현하기 위한 알고리즘 중 가장 대표적인 알고리즘이 버블 솔팅
 * 
 * 방법
 * 인접한 두 수를 비교해 큰 수를 뒤로 보내는 방법
 * 2,5 두 수를 비교 --> 2,5를 유지
 * 5,3 두 수를 비교 -->1)temp라는 임시 변수 하나 만듬
 *                     그 안에 5를 임시 저장
 *                  2) 3을 5자리에 가져다놓음
 *                  3) 3 자리에는 temp 안에 있는 5를 다시 가져와서 갖다 놓음
 *                  ---> 이렇게 두 수의 자리를 temp라는 변수를 이용해 바꾸는 방법을 swap이라 함
 */
public class ArraySortingTest4 {

	public static void main(String[] args) {
		Random r = new Random();
	  //int a =  r.nextInt();
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) 
			arr[i] = r.nextInt(10);//0~9사이 임의의 정수 값
		
		System.out.println("====== Array 초기화 완료 =======\n");
		for(int i : arr) System.out.println(i+" ");
		
		int temp = 0;
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {//앞 수가 뒤 수보다 크다면
					temp = arr[j];//1) 앞 수를 템프에 넣음
					arr[j] = arr[j+1];//2)뒷 수를 앞수로 바꿈
					arr[j+1] = temp;//3)뒷 수를 템프로 넣음 swap단계
				}//if
			}//for			
		}//outer for
		
		System.out.println("\n=============== 정렬 완료 =============\n");
		for(int i : arr) System.out.println(i + " ");
		

	}

}
