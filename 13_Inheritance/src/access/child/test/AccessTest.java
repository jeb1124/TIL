package access.child.test;

import access.parent.Parent;

class child extends Parent{
	public void accessTest() {
		System.out.println(publicTest);
		System.out.println(protechedTest);//����
		//System.out.println(defaultTest);
		//System.out.println(privateTest);
	}
	@Override
	public void access() {
		super.access();
		System.out.println("��ӹ��� �ʵ�::"+publicTest);
		System.out.println("��ӹ��� �ʵ�::"+protechedTest);
		
	}
}

public class AccessTest {
	public static void main(String[] args) {
		
		child c = new child();
		c.accessTest();
		System.out.println("================");
		c.access();


	}

}
