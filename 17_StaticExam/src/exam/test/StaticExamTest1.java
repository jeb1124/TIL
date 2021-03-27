package exam.test;
/*
 * ==== static�� Ű���� ���� ====
 * 1. ��ü���� ���� ���� �޸𸮿� �ö�
 * 2. ��ü���� ���� �ξ� ������...Class File Loader�������� ...�̶� �޸𸮿� �ö�
 *    JVM(STACK | HEAP(new Ű����� ������ ��ü��) |...Class Area(static�� �������� ���))
 * 3. static�� ������ �ʵ�� ������ ��ü�鿡�� ���� ������!
 * 
 * 4. static�� static���� ����
 * 5. static ��� �ȿ����� this ��� �� ��
 * 6. static�� final�� ������ ���� �Բ� �����.
 *    ex) ����� ���� static final int BASIC_SALARY = 1000;
 * 7. static initialization block 
 * 8. �̱���
 */
class Member{
	//�ʵ� ������ static ������ ����(local level�δ� ����� �� ����)
	static String name = "ȫ�浿";
	static int age = 22;
	
	int count = 1;//�ʵ�
	
	//static block
	public static void getNumber() {//static block
		System.out.println("��/��/��/��"+name);//static variable
		//System.out.println("��/��/��/��"+count);
	}
	
	//non static block
	public void getNumber2() {
		System.out.println("��/��/��/��"+name);
	}
}

public class StaticExamTest1 {

	public static void main(String[] args) {
		//static�� ������ ����� �ٷ� �����ؼ� ��� ����, Class�̸�.static�޼ҵ�
		Member.getNumber();
		
		//
		Member m = new Member();
		Member.getNumber();

	}

}
