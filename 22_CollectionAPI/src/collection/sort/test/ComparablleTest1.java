package collection.sort.test;

import java.util.ArrayList;
import java.util.Collections;

/*
 * �迭�� �̰� ���� --> Arrays.sor(Xxx[ ]) sort()�� Comparable�� ���ؼ� ���ĵ� ���̴�.
 * ����Ʈ�� �̰� �Ұ��� --> Arrays.sort(arrayList)�� �ȵ��ư���.
 * ����Ʈ�� Collection.sort()�� �ϸ� �ȴ�.
 * �̹� ���������� Comparable�� ����ؼ� ArrayList�ȿ� ����ִ� ��ü���� Ư���� ���� ���ؼ� �����غ��ڴ�.
 *
 * 1. Comparable�� ���� ��ӹ޾Ƽ� �����ϴ� ���...CompareTo�� �����ϰ��� �ʵ忡 ���缭 ����
 * 2. Comparator�� sort �Լ� �ȿ��� ���� �����ϴ� ���
 */
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Person p) {//���̼�
		return -(new Integer(age).compareTo(p.getAge()));//���������� �տ� -�� ���̸� �ȴ�.
	}	
	
	/*
	 * @Override public int compareTo(Person p) {//�̸��� return
	 * -name.compareTo(p.getName());//���������� �տ� -�� ���̸� �ȴ�. }
	 */		
}

public class ComparablleTest1 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("��ȣ��",48));
		list.add(new Person("�̼���",45));
		list.add(new Person("������",38));
		
		Collections.sort(list);
		System.out.println(list);
	}

}
