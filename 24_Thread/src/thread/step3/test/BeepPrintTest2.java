package thread.step3.test;

import java.awt.Toolkit;

/* Thread
 * 
 * 1) main ������.. ���� ������..O
 * 2)�۾�������.....X
 * 
 * �ش� �ڵ忡���� 
 * ������� �︮�� �۾���
 * ���ÿ� ������� ����ϴ� �۾��� �����ؼ� ó���ϵ��� ������ �ۼ�
 * -->
 * �̰��� �ذ��ϴ� ���:
 * ������� ����ϴ� �۾��� ������� ������ ��
 * BeepPrintThread�� �ϳ� �ۼ�
 * BeepPrintTest2���� �����۾��� �� �� �ֵ��� ������ ��� 
 *
 */
class BeepPrintThread extends Thread{
	public void run() {

		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}//for
	}
}
public class BeepPrintTest2 {
	public static void main(String[] args) {
		BeepPrintThread beep = new BeepPrintThread();
		beep.start();
		
		Toolkit tool = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
			}
		}//for
	}

}
