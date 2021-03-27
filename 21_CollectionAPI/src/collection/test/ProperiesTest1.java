package collection.test;

import java.util.Enumeration;
import java.util.Properties;

/*
 * System���� ž��� VM���� ȯ�溯���� ���� �ַܼ� ����ϴ� ������ �ϼ�
 */
public class ProperiesTest1 {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			String name = (String)e.nextElement();
			String value = p.getProperty(name);
			System.out.println(name+"================="+value);
		}		
	}
}
