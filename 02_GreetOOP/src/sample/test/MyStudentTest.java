package sample.test;

import sample.MyStudent;

/*
 * 1.MyStudent ��ü ����...ms
 * 2.MyStudent�� �޼ҵ��� ����
 * 
 */

public class MyStudentTest {

	public static void main(String[] args) {
		MyStudent ms = new MyStudent(); //1
		
		//2
		ms.name = "������";
		ms.age = 25;
		ms.address = "���α�";
		//���� 3���� �������� �������� �ϵ��ڵ��Ǹ� ���α׷��̶�� �� �� ����(���뼺�� ������)
		
		ms.printInfo();
		
	}
}
