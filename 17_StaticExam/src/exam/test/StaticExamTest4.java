package exam.test;
/*
 * Modifier --> Access modifier | Usage Modifier
 * Usage Modifier :: static, final, abstract
 * static + final �ַ� �԰� ���� ����
 * 
 * final :: "���� �������̾�"�� �ǹ��ϴ� Ű����
 * final + ���� --> "���� ������ ������" --> �������
 * final + Ŭ���� --> "���� ������ Ŭ������" --> ��� ����
 * final + �޼ҵ� --> "���� ������ �޼ҵ��" --> �������̵� ����
 */
class A{
	public final static int BASE_SALARY = 300;
	public final String test() {
		return "Overriding ����";
	}
}
final class B{//��� ����..
	
}

/*
 * class C extends B{
 * 
 * }
 */
class C extends A{
	/*
	 * public final String test() { return "Overriding ����"; }
	 */
}
public class StaticExamTest4 {

	public static void main(String[] args) {
		
	}

}
