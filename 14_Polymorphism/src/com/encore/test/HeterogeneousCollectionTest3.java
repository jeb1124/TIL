package com.encore.test;
/*
 * Collection
 * 1. homogeneous Collection(�������� ����ü)
 * 2. Heterogeneous Collection(�̱������� ����ü)
 */

import com.encore.child.Engineer;
import com.encore.child.Manager;
import com.encore.child.Secretary;
import com.encore.parent.Employee;
import com.encore.util.MyDate;

public class HeterogeneousCollectionTest3 {
	public static void main(String[] args) {
				
		Employee[] emps = {
				new Employee("James", new MyDate(1982,3,2), 23000.0),
				new Manager("Robert", new MyDate(1981,4,2), 33000.0, "IT"),
				new Engineer("Gosling", new MyDate(1978,1,2), 33000.0, "JAVA",200),
				new Secretary("Peter", new MyDate(1988,1,2), 34000.0, "Robert")
		};
		/*
		 * for�� instanceof�� ����ؼ�
		 * Robert �μ��� IT --> Marketing
		 * Gosling tecg JAVA --> Python
		 * Peter bossOfName Robert --> Gosling ���� ����
		 */
		for(Employee e : emps) {
			if(e instanceof Manager) 
				((Manager) e).changeDept("Marketing");			
			if(e instanceof Engineer) 
				((Engineer) e).changeTech("Python");			
			if(e instanceof Secretary) 
				((Secretary) e).changetBossOfName("Gosling");	
				
			System.out.println(e.getDetails());	
			
		}//for			
	}//main
}//class
/*
 * 
 * Polymorphism
 * 
 * 1. Hetero..Collection
 * 2. Virtual Method Invocation
 * 3. Object Casting
 * 4. �θ�Ÿ������ �����ϰ� ������ ������...���� ���������� ������ ��üŸ���� �˾Ƴ��� ���� Ű����
 *    if(e instanceof �ڽ�Ŭ������)
 * 
 * 
 */
	
	
	
	
	
	
	
	