package fly.parent;
//날으는 것과 관련된 기능을 모아놓은 인터페이스
/*
 * 인터페이스의 구성요소
 * 1. static final 상수
 * 2. public abstract 메소드
 */
public interface Flyer {
	//필드가 없음...상수는 존재
	public static final int SIZE = 100;
	
	public abstract void fly();//abstract method...선언부만 있고 구현부가 없는 메소드
	void land();// 인터페이스 안에 무조건 메소드 리턴타입 앞에 public abstract가 생략됨
	void take_off();	
}
