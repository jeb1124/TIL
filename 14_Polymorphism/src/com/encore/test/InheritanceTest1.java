package com.encore.test;

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Employee emp = new Employee("James", new MyDate(1982,3,2), 23000.0);
		Manager m = new Manager("Robert", new MyDate(1981,4,2), 33000.0, "IT");
		Engineer eg = new Engineer("Gosling", new MyDate(1978,1,2), 33000.0, "JAVA",200);
		Secretary ss = new Secretary("Peter", new MyDate(1988,1,2), 34000.0, "Robert");
		
		//Robert가 부서를 바꾼다.....IT --> Marketing
		m.changeDept("Marketing");
		
		System.out.println(emp.getDetails());
		System.out.println(m.getDetails());
		System.out.println(eg.getDetails());
		System.out.println(ss.getDetails());

		////////////////////// Polymorphism ////////////////////////////////
		// 부모타입으로 자식을 생성
		System.out.println("\n=============== Polymorphism=========================\n");
		
		Employee e1 = new Manager("Robert1", new MyDate(1981,4,2), 33000.0, "IT1");
		Employee e2 = new Engineer("Gosling1", new MyDate(1978,1,2), 33000.0, "Python",200);
		Employee e3 = new Secretary("Peter1", new MyDate(1988,1,2), 34000.0, "Robert1");
		
		//2. Object Casting 기법 필요...부모로 찾으면 안되고 자식변수로 찾아야 함..자식만의 기능이기 때문에
		((Manager) e1).changeDept("Marketing");
		
		/*
		 * Manager m1 = (Manager)e1;//괄호 안에 부르고자 하는 자식을 쓰면 댐 
		 * m1.changeDept("Marketing");
		 */
		

		/*1.
		 * Virtual Method(생성된 자식의 메소드) Invocation 원리
		 * 상속관계의 2개의 클래스에서
		 * 메소드 오버라이딩을 했을때 발생하는 원리
		 * 
		 * Complie Time Type 메소드 = 부모의 메소드 호출
		 * Runtime Type 메소드 - 자식의 메소드 호출
		 */
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());
	}
}			

