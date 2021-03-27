package com.encore.capsulation;
/*
 * Encapsulation Pattern
 * 1. �ٸ� Ŭ�������� ���������� ������ �� ������
 *    �ʵ� �տ� ---> private ���� ����
 * 2. Ŭ������ �ʵ忡 ������ setter(),getter() �Ѵ�.
 *    �׸��� ��׵��� �ٸ� Ŭ���������� ���� ������ �� �ֵ��� public
 *    public void setXxx(o)
 *    public int getXxx(x)
 * 3. 
 *    setXxx(){
 *    //ù ���ο���(�ʵ� �ʱ�ȭ �Ǳ� ����!!!)�� Ÿ���� ���� ���� �� �ֵ��� ������ ����
 *    
 *    setDay()
 *    ::
 *    1,3,5,7,8,10,12�� ---> 1 <= day <=31
 *    2�� --->1 <= day <=28
 *    4,6,9,11�� ---> 1 <= day <=30
 *    switch, if
 *    
 *    ::
 *    0�� 22���Դϴ�.(x)
 */

public class MyDate {
	//private �����ϸ� ���� Ŭ���������� ���� ���
	private int month;//1~12
	private int day;
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (month > 0 && month <=12){
			this.month = month;
		}else {//1~12������ ���� �ƴ� ����...
			System.out.println("Invalid Month Value!!");
			//return;-> 0���� ������ ������ 
			//���α׷��� �ٷ� �������� �� �ִ� exit���
			System.exit(0); //0�� ���� ����, -1 ������ ����
		}
	}		

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		//���� ���� day�� �޶�����..
		switch(month) {
		    case 2:
		    	if(day>=1 && day<=28) {
		    		this.day = day;
		    	}else {
		    		System.out.println("Invalid Day Value!!");
		    		//return; -> 0�Ϸ� ������ ���� ���� ���� exit����Ͽ� �ٷ� ���������� �Ѵ�.
		    		System.exit(0);
		    	}
		    break;	
		    case 4:
		    case 6:
		    case 9:
		    case 11:
		    	if(day>=1 && day<=30) {
		    		this.day = day;
		    	}else {
		    		System.out.println("Invalid Day Value!!");
		    		//return;
		    		System.exit(0);
		    	}
		    break;
		    default:		  
		    	if(day>=1 && day<=31) {
		    		this.day = day;
		    	}else {
		    		System.out.println("Invalid Day Value!!");
		    		//return;
		    		System.exit(0);
		    	}
		    break;
		
		}//switch
	}//setDay	
}//class
