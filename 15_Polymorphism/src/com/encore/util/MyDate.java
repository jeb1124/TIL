package com.encore.util;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/*
	 * public String getDate() { return year+","+month+","+day; }
	 */
	//1 step: Object가 가지고 있는 기능을 물려받음
	//2 step: 그걸 자신에게 맞게 고쳐씀
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
