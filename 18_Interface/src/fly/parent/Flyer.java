package fly.parent;
//������ �Ͱ� ���õ� ����� ��Ƴ��� �������̽�
/*
 * �������̽��� �������
 * 1. static final ���
 * 2. public abstract �޼ҵ�
 */
public interface Flyer {
	//�ʵ尡 ����...����� ����
	public static final int SIZE = 100;
	
	public abstract void fly();//abstract method...����θ� �ְ� �����ΰ� ���� �޼ҵ�
	void land();// �������̽� �ȿ� ������ �޼ҵ� ����Ÿ�� �տ� public abstract�� ������
	void take_off();	
}
