package test;

import java.util.Scanner;
/*
 * Scanner Ŭ������
 * �����(�����Ͻð� �ƴ�) Ű����� �Էµ� ���� �Է¹޵��� ���ִ� ����� ������ �ִ� Ŭ����
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.println("Ű����� ���� 2���� �̸��� �Է��ϼ���>>>");
		Scanner sc = new Scanner(System.in);//in�� Ű���� ��, out�� �ܼ�
		int i = sc.nextInt();//������ �������� �����͸� ��ȯ nextInt�� int ������ ���� �Է��ض�
		int j = sc.nextInt();
		sc.nextLine();//�� ������ �������� �����͸� ��ȯ
		String name = sc.next();//������ �������� �����͸� ��ȯ

		System.out.println("���ڰ� i:"+i+",j: "+j);
		System.out.println(name);

	}

}
