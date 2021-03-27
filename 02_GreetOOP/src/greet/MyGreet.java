package greet;

/* MyGreet클래스는
 * 인삿말을 콘솔창으로 출력하는 기능을 가지고 있는 클래스
 */

public class MyGreet {
	public String message = "안녕하세요^^";
	
	public void sayHello(String name) {//method worker
	System.out.println(message+","+name);
	}
}
//main메소드가 없어서 실행이 되지 않고, 컴파일만 된다.
