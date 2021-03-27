package com.encore.child;

import com.encore.parent.Employee;
import com.encore.util.MyDate;

/*
 * �θ� Ŭ���� Employee�κ��� ��� ���� �����ް� 
 * �ڱ��ڽŸ��� ����� �߰��ϴ� �ڽ�Ŭ����
 * 
 * ������ ȣǮ --> ��ü ����
 * 
 */
public class Manager extends Employee{

	//�ڽĸ��� ����� �߰�
	private String dept;
	/*
	 * �ڽĻ�����...��ü���� �˰���
	 * �ڽ� ������ { ù ���ο��� ������ �θ� �⺻ ������ ȣ���� �Ͼ
	 */
	public Manager(String name, MyDate birthday, double salary, String dept) {//�ڽ��� �����Ƿ��Ҷ�...
		//�θ�⺻������ȣ��(������)...super();
		super(name, birthday, salary);		
		this.dept = dept;
	}
	//Method Overriding
	/*
	 * ��Ӱ��迡���� �Ͼ
	 * 1 step: �θ� ���� ����� ��������...ȣǮ�Ѵ�
	 * 2 step: �װ� �ڽſ� �°� ���ľ�
	 * 
	 * Overriding�� Rule
	 * 0. ��Ӽ߰��� �� Ŭ���� ���̿��� �Ͼ 
	 * 1. �޼ҵ� ����δ� ��� ��ġ
	 * 2. �����δ� �ݵ�� �޶�� ��
	 * --> �ϴ� ���� �޶������Ƿ� ���ο� �޼ҵ尡 �������
	 *     �޼ҵ� ������
	 */
	
	public String getDetails() {
		return super.getDetails()+","+dept;
	}

	//Manager Ŭ�������� ����� �߰�
	public void changeDept(String dept) {
		this.dept = dept;
	}	
}
