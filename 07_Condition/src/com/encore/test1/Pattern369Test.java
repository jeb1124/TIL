package com.encore.test1;

import java.util.Scanner;

public class Pattern369Test {
	public int ij;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res, num;
		int number369 = 0;
		
		System.out.println("10~99 사이의 정수를 입력해주세요");
		num = sc.nextInt();
		
		if(num >= 10 && num <= 99) {
			res = num%10;
			if(res== 3 || res==6 || res==9) number369++;
			res = num/10;
			if(res== 3 || res==6 || res==9) number369++;
			if(number369 == 1)
				System.out.println("@");
			else if (number369 == 2)
				System.out.println("@@");
		else
			System.out.println(num);			
		}
	}	
}
