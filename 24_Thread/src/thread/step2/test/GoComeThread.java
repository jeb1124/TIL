package thread.step2.test;
/*
 * Runnable 인터페이스를 구현해서 Thread를 만들어본다.
 * Thread는 2개를 구현
 * GoThread, ComeThread
 */
class GoThread implements Runnable{
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//현재 실행중인 쓰레드의 이름을 리턴하는 기능..Thread
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name:: "+tname+","+i);
			i++;
			if(i==20) break;
		}
	}
}

class ComeThread implements Runnable{
	
	//쓰레드가 작동하는 부분...run() 블락 안에서 해당 쓰레드가 전담하는 일을 확인할 수 있음
	public void run() {
		int i = 0;
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String tname = Thread.currentThread().getName();
			System.out.println("CurrentThread Name:: "+tname+","+i);
			i++;
			if(i==20) break;
		}
	}
}

public class GoComeThread {
	public static void main(String[] args) {
		//GoComeThread라는 프로세스 안에서 2개의 쓰레드를 동작시켜보도록 하자
		GoThread go = new GoThread();
		ComeThread come = new ComeThread();
		
		Thread t1 = new Thread(go, "GoThread");
		Thread t2 = new Thread(come, "ComeThread");
		t1.start();
		t2.start();
	}
}
















