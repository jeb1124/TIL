package com.encore.cons.test;

import com.encore.cons.Programmer;
import com.encore.util.MyDate;

public class ProgrammerTest {

	public static void main(String[] args) {
		
		//1.��ü����... Programmer�� �ı����� �޸𸮿� �ø���.
		//2.�޼ҵ� ȣ�� ..
		//3.�������� ������ �ܼ�â�� ��µǵ��� �ۼ�
		//birthday�� ������ 1980-1-1
		/*
		 * Programmer pro = new Programmer();		
		Programmer pro1 = new Programmer();
		
		MyDate md = new MyDate();
		md.setData(1980, 1, 1);
		
		pro.setProgrammer("James", md, 300000.0f, 10000);//�ʵ忡 ���� ����
		
		pro1.setProgrammer("Peter", md, 400000.0f, 20000);//�ʵ忡 ���� ����
	
		pro = pro1;
		System.out.println(pro.getProgrammer());//���Ե� ���� �޾ƿ�
		System.out.println(pro.getProgrammer());//���Ե� ���� �޾ƿ�
		 */
		
		//step2
		/*
		 * 1. pro1,pro2��ü�� ����
		 * 2. �����ڸ� �̿��ؼ� �ʵ忡 ���� ���� �Ҵ�
		 * 
		 * 3. �ʵ� ������ �ܼ�â���� ���
		 * 
		 * 4.Peter�� ������ 450000.0�޷� �Դϴ�. ����� �ǵ��� ������ �ϼ��ϼ���.
		 * 
		 * 
		 */
		//MyDate md= new MyDate(1980, 1, 1);
		Programmer pro1 = new Programmer("James",new MyDate(1980, 1, 1) , 300000.0f, 10000);
		Programmer pro2 = new Programmer("Peter",new MyDate(1980, 1, 1) , 400000.0f, 20000);
		
		System.out.println(pro1.getProgrammer());
		System.out.println(pro2.getProgrammer());
		
		System.out.println("\n=========================================================\n");
		System.out.println(pro2.getName()+"���� ������"+pro2.getAnnualSalary()+"�޷��Դϴ�!!");

	}

}
