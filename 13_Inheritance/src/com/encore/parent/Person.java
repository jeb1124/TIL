package com.encore.parent;

public class Person {
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		super();//object 기본 생성자 호출
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return name+","+age+","+address;
	}
	
	

}
