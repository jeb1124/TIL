package fly.test;

import fly.child.AirPlane;
import fly.child.Bird;
import fly.child.SuperMan;
import fly.parent.Flyer;

public class FlyerTest1 {

	public static void main(String[] args) {
		//1. ���������� ������� �ڽ� ��ü�� 3�� ����..bird, superman, airplane
		//�������̽��� ��ü������ ����� �ƴϰ� ��ü�� �����ϱ� ���� Ÿ�����μ��� ����!
		//Flyer flyer = new Flyer();
		
		Flyer bird = new Bird();
		Flyer superman = new SuperMan();
		Flyer airplane = new AirPlane(); 
		
		//2. for,instanceof �̿��ؼ� ���� �ڽ�Ŭ������ ����� ���� �� ȣ��
		Flyer[] flyers = {bird,superman,airplane};
		
		for(Flyer f : flyers) {
			if(f instanceof Bird)System.out.println(((Bird)f).layEgg());
			if(f instanceof SuperMan)System.out.println(((SuperMan)f).stop_Bullet());
			f.fly();
			f.land();
			f.take_off();
			System.out.println("==================================");
		}//for
	}//main
}//class
