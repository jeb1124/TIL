package collection.test2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import collection.vo.Customer;

public class CustomerMapTest2 {

	public static void main(String[] args) {
		HashMap<String, Customer> map= new HashMap<String, Customer>();

		map.put("111", new Customer("KANG","��ȣ��",48));
		map.put("222", new Customer("LEE","�̼���",44));
		map.put("333", new Customer("SEO","������",42));
		map.put("444", new Customer("KIM","����ö",37));
		
		//1. KEY ���� 222�� ����� ������ ���
		System.out.println(map.get("222"));
		
		//2. id�� LEE�� ����� ã�Ƽ� �� ����� �̸��� ���
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();	
		while(it.hasNext()) {
			Customer c = map.get(it.next());
			if(c.getId().equals("LEE")) System.out.println(c.getName());
		}
		
		//3.MAP�� ����� �������� ��� KEY������ ���
		System.out.println(map.keySet());
		
		//4.MAP�� ����� ����� ������ ���հ� ��տ����� ���
		Set<String> keys = map.keySet();
		int totalAge = 0;
		for(String s : keys) {
			totalAge += map.get(s).getAge();
		}
		System.out.println("������ ���� "+totalAge+"��");
		System.out.println("��� ������ "+totalAge/map.size() +"��");		
	}

}
