package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//�տ��� �ۼ��� Person�� ���⼭ �״�� ���

public class ComparatorTest2 {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ȣ��",48));
		list.add(new Person("�̼���",45));
		list.add(new Person("������",38));
		
		//Arrays.sort(�迭) | collections.sore(����Ʈ, Comparator ��ü)
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p2.getAge()-p1.getAge();//����, ����
			}			
		});
		
		//Ȯ��
		for(Person p:list)System.out.println(p);
		
	}

}
