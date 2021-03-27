package com.encore.parent;

import com.encore.util.MyDate;

/*
 * 자식들의 공통적인 성질을 
 * 일반적인 성질로 가지고 있는 부모 클래스
 */
public class Employee {
	public static final double BASIC_SALARY = 100.0;
	private String name;
	private MyDate birthday;
	private double salary;
	
	public Employee() {}//default 생성자(기본 생성자)
	public Employee(String name, MyDate birthDate) {
		this(name, birthDate, BASIC_SALARY);
	}
	
	public Employee(String name, MyDate birthday, double salary) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}
	
	public String getDetails() {
		return name+","+birthday+","+salary;
	}
	public double getSalary() {
		return salary;
	}
	public static double getBasicSalary() {
		return BASIC_SALARY;
	}
	public String getName() {
		return name;
	}
	public MyDate getBirthday() {
		return birthday;
	}				
}
