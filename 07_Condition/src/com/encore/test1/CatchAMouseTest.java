package com.encore.test1;

import java.util.Scanner;
/*
 * ����� ����� �˰����� �����ϰ� �ٷﺸ��
 */

public class CatchAMouseTest {
	
	private static String algoSolv(int cata, int catb, int mouse) {
		//if,else if ,else ������ Math.abs()�� �̿��Ͽ� �˰����� �����غ���
		if(Math.abs(cata-mouse)>Math.abs(catb-mouse ))
			return "CatB Catch!!";
		else if(Math.abs(cata-mouse)<Math.abs(catb-mouse ))
			return "CatA Catch!!";
		else return "Mouse Escape!!";		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//������� 3���� ���� �Է¹���
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		algoSolv(cata,catb,mouse);
		
		String result = algoSolv(cata, catb, mouse);
		System.out.println("Result :: "+result);

	}
}
