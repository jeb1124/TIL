package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * 부모 클래스 Employee로부터 모든 것을 물려받고 
 * 자기자신만의 멤버를 추가하는 자식클래스
 * 
 * 생성자 호풀 --> 객체 생성
 * 
 */
public class Manager extends Employee{

	//자식만의 멤버를 추가
	private String dept;
	/*
	 * 자식생성자...객체생성 알고리즘
	 * 자식 생성자 { 첫 라인에서 무조건 부모 기본 생성자 호출이 일어남
	 */
	public Manager(String name, MyDate birthday, double salary, String dept) {//자식이 생성되려할때...
		//부모기본생성자호출(무조건)...super();
		super(name, birthday, salary);		
		this.dept = dept;
	}
	//Method Overriding
	/*
	 * 상속관계에서만 일어남
	 * 1 step: 부모가 가진 기능을 물려받음...호풀한다
	 * 2 step: 그걸 자신에 맞게 고쳐씀
	 * 
	 * Overriding의 Rule
	 * 0. 상속솬계의 두 클래스 사이에서 일어남 
	 * 1. 메소드 선언부는 모두 일치
	 * 2. 구현부는 반드시 달라야 함
	 * --> 하는 일이 달라졌으므로 새로운 메소드가 만들어짐
	 *     메소드 재정의
	 */
	
	public String getDetails() {
		return super.getDetails()+","+dept;
	}

	//Manager 클래스만의 기능을 추가
	public void changeDept(String dept) {
		this.dept = dept;
	}	
}
