package com.encore.service;

import com.encore.child.Engineer;
import com.encore.parent.Employee;

/*
 * ��۰��迡 �ִ� �پ��� subclass���� �ڵ鸵�ϴ� ��ɸ����� �̷���� ���� Ŭ���� * 
 */
public class EmployeeService {
	/*
	 * 1step
	 * ::
	 * public void manageManager(Manager m){}
	 * public void manageEngineer(Engineer eg){}
	 * public void manageScretary(Secretary s){}
	 *  
	 * 2step-----Overloading
	 * "�޼ҵ� �̸��� ���� 
	 *  ó���ϴ� �����͸� �޸��ϴ� ���"
	 *  << Rule >>
	 *  0. �ϳ��� Ŭ���������� ����Ǵ� ���
	 *  1. �޼ҵ� �̸��� �ݵ�� ���ƾ� �Ѵ�.
	 *  2. �޼ҵ� ���ڰ��� �ݵ�� �޶�� �Ѵ�.
	 *  3. �޼ҵ� ����Ÿ���� �������.
	 * 
	 * ::
	 * public void manageEmployee(Manager m){}
	 * public void manageEmployee(Engineer eg){}
	 * public void manageEmployee(Secretary s){}
	 *  
	 * 3step
	 * public void manageEmployee(Employee e){
	 * }
	 */
	
	public void manageEmployee(Employee e) {
		if(e.getName().equals("Peter")) {
			System.out.println(e.getDetails());
		}
		if(e instanceof Engineer) {
			System.out.println("����::"+(e.getSalary()*12)+((Engineer)e).getBonus());
		}
	}
	public void printAllEmployee(Employee[] emps) {
		for(Employee e:emps)
			System.out.println(e.getDetails());
	}

}
