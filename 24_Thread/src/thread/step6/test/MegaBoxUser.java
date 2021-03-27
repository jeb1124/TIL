package thread.step6.test;
/*
 * Ư���� ���� �����ϴ� ������ Ŭ����
 * MegaBox���� �¼��� �����ϴ� ���� ����
 * reserve() ��� ����� ����
 * 
 */
public class MegaBoxUser implements Runnable{
	private boolean seat = false;//�¼����Ű� �������� true�� �ٲ۴�.

	@Override
	public void run() {
		try {
			reserve();	
		}catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}//run

	//�¼��� �����ϴ� ���
	public synchronized void reserve() throws InterruptedException {
		String tName = Thread.currentThread().getName();
		System.out.println(tName+" ��,��ȭ �����Ϸ� ���̽��ϴ�!!");
		if(seat==false) {//�¼��� ����ٸ� ���� ����
			Thread.sleep(1000);
			System.out.println(tName+" ��, �¼� ���Ű� �Ǽ̽��ϴ�.");
			seat = true;//�ݵ�� �־���� �Ѵ�.
		}else {//�¼��� �̹� ���Ű� �Ǿ��ٸ� ���� �Ұ���
			System.out.println(tName+" ��, �ش� �¼��� ���� �Ұ����� �¼��Դϴ�.");
		}
		
	}

}
