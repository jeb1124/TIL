package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		//1.Scanner�� ���ؼ� month,day���� �޴´�.
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��¥�� �Է��ϼ���..��,�ϼ� >>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		
		System.out.println("��������� �Է��� �ֽʽÿ�.");
		
		
		md.setMonth(month);//Calling...13...0
		md.setDay(day);//Calling...33...0(�ʵ� �ʱ�ȭ�� �ȵż� 0�� ����.)
		
		// if(md.getMonth() !=0 && me.getDay() !=0)		
		System.out.println("������ "+md.getMonth()+"�� "+md.getDay()+"�� �Դϴ�.");
	}

}