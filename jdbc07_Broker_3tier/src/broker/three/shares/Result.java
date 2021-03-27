package broker.three.shares;

import java.util.ArrayList;

/*
 * Result 클래스는 한칸짜리 ArrayList
 * 성공/실패 여부를 확인할 수 있는 status값을 가지고 있고
 * db에서 받아오는 결과값을 담을 수 있는 모듈
 */
public class Result extends ArrayList{
	private int status = -1;//기본값...일이 잘 안되는 경우를 디폴트..
	 
	public Result() {
		super(1);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
