package com.encore.capsulation.test;

import java.util.Scanner;

import com.encore.capsulation.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		//1.Scanner를 통해서 month,day값을 받는다.
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 입력하세요..원,일순 >>>");
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		MyDate md = new MyDate();
		
		System.out.println("생년월일을 입력해 주십시요.");
		
		
		md.setMonth(month);//Calling...13...0
		md.setDay(day);//Calling...33...0(필드 초기화가 안돼서 0이 찍힘.)
		
		// if(md.getMonth() !=0 && me.getDay() !=0)		
		System.out.println("오늘은 "+md.getMonth()+"월 "+md.getDay()+"일 입니다.");
	}

}